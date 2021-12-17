package com.arsatapathy;

import java.util.Map;

public class DepthFirstPrintRecursive {

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

        DFP(graph, 'a');
    }

    public static void DFP(Map<Character, Character[]> graph, char source) {
        System.out.print(source);

        for(char neighbour :graph.get(source))
            DFP(graph, neighbour);
    }
}
