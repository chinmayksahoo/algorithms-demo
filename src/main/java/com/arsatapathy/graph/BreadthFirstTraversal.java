package com.arsatapathy.graph;

import java.util.*;

public class BreadthFirstTraversal {

    public static List<Character> BFT(Map<Character, Character[]> graph, char start) {
        List<Character> result = new LinkedList<>();

        Queue<Character> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            char current = queue.remove();
            result.add(current);
            for (char neighbour :graph.get(current))
                queue.add(neighbour);
        }

        return result;
    }
}
