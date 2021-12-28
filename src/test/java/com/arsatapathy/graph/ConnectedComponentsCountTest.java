package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ConnectedComponentsCountTest {

    @Test
    public void test_01() {
        // Adjacency List
        Map<Integer, Integer[]> graph = Map.of(
                1, new Integer[]{2},
                2, new Integer[]{3,4},
                3, new Integer[]{},
                4, new Integer[]{2},
                5, new Integer[]{}
        );

        Assertions.assertEquals(2, ConnectedComponentsCount.count(graph));
    }
}
