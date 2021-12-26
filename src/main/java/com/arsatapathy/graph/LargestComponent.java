package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LargestComponent {

    public static void main(String[] args) {
        // Adjacency List
        final Map<Character, Character[]> graph = Map.of(
                '0', new Character[]{'8', '1', '5'},
                '1', new Character[]{'0'},
                '5', new Character[]{'0', '8'},
                '8', new Character[]{'0', '5'},
                '2', new Character[]{'3', '4'},
                '3', new Character[]{'2', '4'},
                '4', new Character[]{'3', '2'}
        );

        Set<Character> set = new HashSet<>();

        int count;
        int maxCount = 0;

        for (Character node :graph.keySet()) {
            count = largestComponent(graph, node, set);

            if (count > maxCount) maxCount = count;
        }

        System.out.println(maxCount);
    }

    public static int largestComponent(Map<Character, Character[]> graph, Character start, Set<Character> set) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        stack.push(start);

        while(!stack.isEmpty()) {
            Character current = stack.pop();

            if (set.contains(current))
                continue;
            else
                set.add(current);

            count++;

            for (Character neighbour :graph.get(current))
                stack.push(neighbour);
        }

        return count;
    }

}
