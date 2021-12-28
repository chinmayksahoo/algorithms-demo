package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ConnectedComponentsCountTest {

    @Test
    public void test_01() {
        // Adjacency List
        Map<Integer, Integer[]> graph = Map.of(
                0, new Integer[]{8, 1, 5},
                1, new Integer[]{0},
                5, new Integer[]{0,8},
                8, new Integer[]{0,5},
                2, new Integer[]{3,4},
                3, new Integer[]{2,4},
                4, new Integer[]{3,2}
        );

        Assertions.assertEquals(2, ConnectedComponentsCount.count(graph));
    }
}
