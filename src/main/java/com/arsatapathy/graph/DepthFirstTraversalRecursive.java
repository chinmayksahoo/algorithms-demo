package com.arsatapathy.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DepthFirstTraversalRecursive {

    public static List<Character> DFT(Map<Character, Character[]> graph, char start) {
        List<Character> result = new LinkedList<>();

        result.add(start);

        for(char neighbour :graph.get(start))
            result.addAll(DFT(graph, neighbour));

        return result;
    }
}
