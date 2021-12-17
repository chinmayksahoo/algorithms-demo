package com.arsatapathy;

import java.util.Map;

public class DepthFirstSearchRecursive {

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

        DFS(graph, 'a');
    }

    public static void DFS(Map<Character, Character[]> graph, char source) {
        System.out.print(source);

        for(char neighbour :graph.get(source))
            DFS(graph, neighbour);
    }
}
