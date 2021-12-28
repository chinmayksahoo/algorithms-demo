package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConnectedComponentsCount {

    public static int count(Map<Integer, Integer[]> graph) {

        int count = 0;

        Set<Integer> visited = new HashSet<>();

        for (Integer currentNode :graph.keySet()) {
            if (isConnected(graph, currentNode, visited))
                count += 1;
        }

        return count;
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
