package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class HasPathUsingBreadthFirstTest {

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
        Assertions.assertTrue(HasPathUsingBreadthFirst.hasPath(graph, 'f', 'h'));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(HasPathUsingBreadthFirst.hasPath(graph, 'f', 'j'));
    }
}
