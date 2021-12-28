package com.arsatapathy.graph;

import java.util.*;

public class HasPathUndirectedGraphUsingDepthFirstRecursive {

    public static boolean hasPath(Map<Character, List<Character>> graph, char source, char destination, Set<Character> visited) {

        if (visited.contains(source))
            return false;
        else
            visited.add(source);

        if (source == destination) return true;

        for (char neighbour :graph.get(source))
            if (hasPath(graph, neighbour, destination, visited)) return  true;

        return false;
    }

    public static Map<Character, List<Character>> graph(char[][] edges) {
        Map<Character, List<Character>> graph = new HashMap<>();

        for (char[] edge :edges) {
            if (!graph.containsKey(edge[0]))
                graph.put(edge[0], new LinkedList<>());
            if (!graph.containsKey(edge[1]))
                graph.put(edge[1], new LinkedList<>());

            List<Character> neighbour_0 = graph.get(edge[0]);
            neighbour_0.add(edge[1]);
            graph.put(edge[0], neighbour_0);

            List<Character> neighbour_1 = graph.get(edge[1]);
            neighbour_1.add(edge[0]);
            graph.put(edge[1], neighbour_1);
        }

        return graph;
    }
}
