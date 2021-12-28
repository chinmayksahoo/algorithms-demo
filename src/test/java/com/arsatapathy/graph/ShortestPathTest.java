package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathTest {

    private final char[][] edges = {
            {'w', 'x'},
            {'x', 'y'},
            {'z', 'y'},
            {'z', 'v'},
            {'w', 'v'}
    };

    @Test
    public void test_01() {
        Assertions.assertEquals(2, ShortestPath.shortestPath(ShortestPath.graph(edges), 'w', 'z') );
    }
}
