package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ConnectedComponentsCount {

    public static int count(Map<Integer, Integer[]> graph) {

        int count = 0;

        Set<Integer> visited = new HashSet<>();

        for (Integer currentNode :graph.keySet()) {
            if (isConnected(graph, currentNode, visited))
                count++;
        }

        return count;
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
