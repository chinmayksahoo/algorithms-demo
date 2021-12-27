package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Set;

public class MaxSizeIsland {
    public static void main(String[] args) {
        char[][] grid = {
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'W'},
                {'W', 'W', 'W', 'L', 'W'},
                {'W', 'W', 'L', 'L', 'W'},
                {'L', 'W', 'W', 'L', 'L'},
                {'L', 'L', 'W', 'W', 'W'}
        };

        System.out.println("Mx Island Size: " + maxIslandSize(grid));

    }


    public static int maxIslandSize(char[][] grid) {
        int size = 0;
        int maxIslandSize = 0;
        Set<String> visitedSet = new HashSet<>();

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                size = islandSize(grid, i, j, visitedSet);
                if (size > maxIslandSize) maxIslandSize = size;
            }

        return maxIslandSize;
    }

    public static int islandSize(char[][] grid, int row, int column, Set<String> visitedSet) {
        boolean rowInBound = row >= 0 && row < grid.length;
        boolean columnInBound = column >= 0 && column < grid[0].length;


        if (!rowInBound || !columnInBound)
            return 0;

        if (grid[row][column] == 'W')
            return 0;

        if (visitedSet.contains(row + "," + column))
            return 0;
        else
            visitedSet.add(row + "," + column);

        int size = 1;

        size += islandSize(grid, row -1, column, visitedSet);
        size += islandSize(grid, row +1, column, visitedSet);
        size += islandSize(grid, row, column -1, visitedSet);
        size += islandSize(grid, row, column +1, visitedSet);

        return size;
    }
}
