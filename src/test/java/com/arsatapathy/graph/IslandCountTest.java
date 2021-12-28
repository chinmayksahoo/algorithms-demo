package com.arsatapathy.graph;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IslandCountTest {

    @Test
    public void test_01() {
        char[][] grid = {
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'W', 'W', 'L', 'W'},
                {'W', 'W', 'L', 'L', 'W'},
                {'L', 'W', 'W', 'L', 'L'},
                {'L', 'L', 'W', 'W', 'W'}
        };

        Assertions.assertEquals(3, IslandCount.islandCount(grid));
    }

    @Test
    public void test_02() {
        char[][] grid = {
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'W'}
        };

        Assertions.assertEquals(1, IslandCount.islandCount(grid));
    }
}
