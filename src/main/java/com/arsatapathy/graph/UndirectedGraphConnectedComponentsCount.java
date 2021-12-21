package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class UndirectedGraphConnectedComponentsCount {
    public static void main(String[] args) {

        Map<Integer, Integer[]> graph = Map.of(
                1, new Integer[]{2},
                2, new Integer[]{3,4},
                3, new Integer[]{},
                4, new Integer[]{2},
                5, new Integer[]{}
        );

        int count = 0;
        Set<Integer> visited = new HashSet<>();

        for (Integer currentNode :graph.keySet()) {
            if (isConnected(graph, currentNode, visited))
                count++;
        }

        System.out.println(count);

    }

    public static boolean isConnected(Map<Integer, Integer[]> graph, Integer start, Set<Integer> visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            Integer current = stack.pop();

            if (visited.contains(current))
                return false;
            else
                visited.add(current);

            for (Integer neighbour :graph.get(current))
                stack.push(neighbour);
        }

        return true;
    }
}
