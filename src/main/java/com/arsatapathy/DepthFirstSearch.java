package com.arsatapathy;

import java.util.Map;
import java.util.Stack;

public class DepthFirstSearch {

    public static void main(String[] args) {
        final Map<Character, Character[]> graph = Map.of(
                'a', new Character[]{'b', 'c'},
                'b', new Character[]{'d'},
                'c', new Character[]{'e'},
                'd', new Character[]{'f'},
                'e', new Character[]{},
                'f', new Character[]{}
        );

        DFS(graph, 'a');
    }

    public static void DFS(Map<Character, Character[]> graph, char start) {
        Stack<Character> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
           char current = stack.pop();
            System.out.print(current + " ");
           for(char neighbour :graph.get(current)) {
               stack.push(neighbour);
           }
        }

    }
}
