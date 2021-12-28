package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class DepthFirstTraversalTest {

    @Test
    public void test_01() {

        // Adjacency List
        final Map<Character, Character[]> graph = Map.of(
                'a', new Character[]{'b', 'c'},
                'b', new Character[]{'d'},
                'c', new Character[]{'e'},
                'd', new Character[]{'f'},
                'e', new Character[]{},
                'f', new Character[]{}
        );

       Assertions.assertEquals(List.of('a', 'c', 'e', 'b', 'd', 'f'), DepthFirstTraversal.DFT(graph, 'a'));
    }
}
