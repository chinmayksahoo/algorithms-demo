package com.arsatapathy.graph;

import java.util.*;

public class ShortestPath {

    public static void main(String[] args) {
        char[][] edges = {
                {'w', 'x'},
                {'x', 'y'},
                {'z', 'y'},
                {'z', 'v'},
                {'w', 'v'}
        };

        System.out.println(shortestPath(graph(edges), 'w', 'z'));
    }

    public static int shortestPath(Map<Character, List<Character>> graph, char start, char end) {

        class Node {
            private final Character node;
            private final Integer distance;

            Node(Character node, Integer distance) {
                this.node = node;
                this.distance = distance;
            }
        }

        Queue<Node> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();

        int distance = 0;

        queue.add(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current.node == end)
                return current.distance;

            if (!visited.contains(current.node))
                visited.add(current.node);
            else {
                continue;
            }

            for (Character neighbour :graph.get(current.node))
                queue.add(new Node(neighbour, current.distance + 1));

        }

        return distance;

    }

    public static Map<Character, List<Character>> graph(char[][] edges) {
        Map<Character, List<Character>> graph = new HashMap<>();

        for (char[] edge :edges) {
            if (!graph.containsKey(edge[0]))
                graph.put(edge[0], new LinkedList<>());

            if (!graph.containsKey(edge[1]))
                graph.put(edge[1], new LinkedList<>());

            List<Character> neighbours_of_0 = graph.get(edge[0]);
            neighbours_of_0.add(edge[1]);
            graph.put(edge[0], neighbours_of_0);

            List<Character> neighbours_of_1 = graph.get(edge[1]);
            neighbours_of_1.add(edge[0]);
            graph.put(edge[1], neighbours_of_1);
        }


        return graph;
    }

}
