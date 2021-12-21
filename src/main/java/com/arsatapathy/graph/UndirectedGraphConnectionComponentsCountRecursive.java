package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UndirectedGraphConnectionComponentsCountRecursive {
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

        if (visited.contains(start))
            return false;
        else
            visited.add(start);

        for (Integer neighbour :graph.get(start))
            isConnected(graph, neighbour, visited);

        return true;
    }
}
