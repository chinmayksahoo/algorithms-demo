package com.arsatapathy.graph;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class HasPathUsingBreadthFirst {

    public static boolean hasPath(Map<Character, Character[]> graph, char source, char destination){
        Queue<Character> queue = new LinkedList<>();

        queue.add(source);

        while (!queue.isEmpty()) {
            char current = queue.remove();
            if (current == destination) return true;

            for (char neighbour :graph.get(current))
                queue.add(neighbour);

        }

        return false;
    }
}
