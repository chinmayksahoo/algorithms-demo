package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LargestComponent {

    public static int largestComponent(Map<Character, Character[]> graph) {
        Set<Character> visitedSet = new HashSet<>();

        int count = 0;
        int maxCount = 0;

        for (Character node :graph.keySet()) {
            count = components(graph, node, visitedSet);

            if (count > maxCount) maxCount = count;
        }

        return maxCount;
    }

    public static int components(Map<Character, Character[]> graph, Character start, Set<Character> visited) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        stack.push(start);

        while(!stack.isEmpty()) {
            Character current = stack.pop();

            if (visited.contains(current))
                continue;
            else
                visited.add(current);

            count++;

            for (Character neighbour :graph.get(current))
                stack.push(neighbour);
        }

        return count;
    }

}
