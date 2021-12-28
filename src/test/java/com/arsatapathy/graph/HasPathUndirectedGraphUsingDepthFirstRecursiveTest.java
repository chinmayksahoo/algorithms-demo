package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static com.arsatapathy.graph.HasPathUndirectedGraphUsingDepthFirstRecursive.graph;
import static com.arsatapathy.graph.HasPathUndirectedGraphUsingDepthFirstRecursive.hasPath;

public class HasPathUndirectedGraphUsingDepthFirstRecursiveTest {

    private final char[][] edges = {
            {'i', 'j'},
            {'k', 'i'},
            {'m', 'k'},
            {'k', 'l'},
            {'o', 'n'}
    };

    @Test
    public void test_01() {
        Assertions.assertTrue(hasPath(graph(edges), 'i', 'm', new HashSet<>()));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(hasPath(graph(edges), 'i', 'n', new HashSet<>()));
    }
}
