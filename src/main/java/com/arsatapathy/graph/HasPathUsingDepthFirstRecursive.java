package com.arsatapathy.graph;

import java.util.Map;

public class HasPathUsingDepthFirstRecursive {

    public static boolean hasPath(Map<Character, Character[]> graph, char source, char destination) {

        if (source == destination) return true;

        for (char neighbour :graph.get(source))
            if (hasPath(graph, neighbour, destination)) return true;

        return false;
    }
}
