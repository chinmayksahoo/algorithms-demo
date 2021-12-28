package com.arsatapathy.graph;

import java.util.HashSet;
import java.util.Set;

public class IslandCount {

    public static int islandCount(char[][] grid) {
        int count = 0;
        Set<String> visitedSet = new HashSet<>();

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (isAnIsland(grid, i, j, visitedSet))
                    count++;

        return count;
    }

    public static boolean isAnIsland(char[][] grid, int row, int column, Set<String> visitedSet) {
        boolean rowInBound = row >= 0 && row < grid.length;
        boolean columnInBound = column >= 0 && column < grid[0].length;

        if (!rowInBound || !columnInBound)
            return false;

        if (grid[row][column] == 'W')
            return false;

        if (visitedSet.contains(row + "," + column))
            return false;
        else
            visitedSet.add(row + "," + column);


       isAnIsland(grid, row -1, column, visitedSet);
       isAnIsland(grid, row +1, column, visitedSet);
       isAnIsland(grid, row, column -1, visitedSet);
       isAnIsland(grid, row, column +1, visitedSet);

        return true;
    }
}
