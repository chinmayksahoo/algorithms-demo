package com.arsatapathy.graph;

import java.util.Map;
import java.util.Stack;

public class HasPathUsingDepthFist {

    public static void main(String[] args) {
        // Adjacency List
        Map<Character, Character[]> graph = Map.of(
                'f', new Character[]{'g','i'},
                'g', new Character[]{'h'},
                'h', new Character[]{},
                'i', new Character[]{'g','k'},
                'j', new Character[]{'i'},
                'k', new Character[]{}
        );

        test(
                () -> System.out.println(hasPath(graph, 'f', 'h'))
        );

        test(
                () -> System.out.println(hasPath(graph, 'f', 'j'))
        );
    }

    public static void test(Test test) {
        test.test();
    }

    public static boolean hasPath(Map<Character, Character[]> graph, char source, char destination) {
        Stack<Character> stack = new Stack<>();

        stack.push(source);

        while(!stack.isEmpty()) {
            char current = stack.pop();

            if (current == destination) return true;

            for (char neighbour :graph.get(current))
                stack.push(neighbour);
        }

        return false;
    }
}
