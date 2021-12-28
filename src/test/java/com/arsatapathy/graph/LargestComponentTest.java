package com.arsatapathy.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class LargestComponentTest {

    // Adjacency List
    private final Map<Character, Character[]> graph = Map.of(
            '0', new Character[]{'8', '1', '5'},
            '1', new Character[]{'0'},
            '5', new Character[]{'0', '8'},
            '8', new Character[]{'0', '5'},
            '2', new Character[]{'3', '4'},
            '3', new Character[]{'2', '4'},
            '4', new Character[]{'3', '2'}
    );

    @Test
    public void test_01() {
        Assertions.assertEquals(4, LargestComponent.largestComponent(graph));
    }
}
