package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.arsatapathy.graph.HasPathUndirectedGraphUsingDepthFirst.hasPath;
import static com.arsatapathy.graph.HasPathUndirectedGraphUsingDepthFirst.graph;

public class HasPathUndirectedGraphUsingDepthFirstTest {

    private final char[][] edges = {
            {'i', 'j'},
            {'k', 'i'},
            {'m', 'k'},
            {'k', 'l'},
            {'o', 'n'}
    };

    @Test
    public void test_01() {
        Assertions.assertTrue(hasPath(graph(edges), 'i', 'm'));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(hasPath(graph(edges), 'i', 'n'));
    }
}
