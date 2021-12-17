package com.arsatapathy.graph;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstPrint {

    public static void main(String[] args) {
        // Adjacency List
        final Map<Character, Character[]> graph = Map.of(
                'a', new Character[]{'b', 'c'},
                'b', new Character[]{'d'},
                'c', new Character[]{'e'},
                'd', new Character[]{'f'},
                'e', new Character[]{},
                'f', new Character[]{}
        );

        BFP(graph, 'a');
    }

    public static void BFP(Map<Character, Character[]> graph, char start) {
        Queue<Character> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            char current = queue.remove();
            System.out.println(current);
            for (char neighbour :graph.get(current))
                queue.add(neighbour);
        }
    }
}
