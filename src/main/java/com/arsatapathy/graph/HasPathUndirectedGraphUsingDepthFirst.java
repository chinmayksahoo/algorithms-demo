package com.arsatapathy.graph;

import java.util.*;

public class HasPathUndirectedGraphUsingDepthFirst {
    public static void main(String[] args) {
        char[][] edges = {
                {'i', 'j'},
                {'k', 'i'},
                {'m', 'k'},
                {'k', 'l'},
                {'o', 'n'}
        };

        Map<Character, List<Character>> graph = graph(edges);

        test(
                () -> System.out.println(hasPath(graph, 'i', 'm'))
        );

        test(
                () -> System.out.println(hasPath(graph, 'i', 'n'))
        );

        test(
                () -> System.out.println(hasPath(graph, 'o', 'n'))
        );
    }

    public static void test(Test test) {
        test.test();
    }

    public static Map<Character, List<Character>> graph(char[][] edges) {
        Map<Character, List<Character>> graph = new HashMap<>();

        for (char[] edge : edges) {
            if (!graph.containsKey(edge[0]))
                graph.put(edge[0], new LinkedList<>());
            if (!graph.containsKey(edge[1]))
                graph.put(edge[1], new LinkedList<>());

            List<Character> neighbours_0 = graph.get(edge[0]);
            neighbours_0.add(edge[1]);
            graph.put(edge[0], neighbours_0);

            List<Character> neighbours_1 = graph.get(edge[1]);
            neighbours_1.add(edge[0]);
            graph.put(edge[1], neighbours_1);
        }

        return graph;
    }

    public static boolean hasPath(Map<Character, List<Character>> graph, char source, char destination) {

        Stack<Character> stack = new Stack<>();

        Set<Character> visited = new HashSet<>();

        stack.push(source);

        while (!stack.isEmpty()){
            char currentNode = stack.pop();

            if (visited.contains(currentNode)) {
                continue;
            } else {
                visited.add(currentNode);
            }

            if (currentNode == destination)
                return true;

            for (char neighbour : graph.get(currentNode)) {
                stack.push(neighbour);
            }
        }

        return false;
    }
}
