package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.arsatapathy.graph.HasPathUsingDepthFirstRecursive.hasPath;

public class HasPathUsingDepthFirstRecursiveTest {

    // Adjacency List
    private final Map<Character, Character[]> graph = Map.of(
            'f', new Character[]{'g','i'},
            'g', new Character[]{'h'},
            'h', new Character[]{},
            'i', new Character[]{'g','k'},
            'j', new Character[]{'i'},
            'k', new Character[]{}
    );

    @Test
    public void test_01() {
        Assertions.assertTrue(hasPath(graph, 'j', 'h'));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(hasPath(graph, 'f', 'j'));
    }
}
