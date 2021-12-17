package com.arsatapathy.graph;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class HasPathUsingBreadthFirst {

    public static void main(String[] args) {
        Map<Character, Character[]> graph = Map.of(
                'f', new Character[]{'g','i'},
                'g', new Character[]{'h'},
                'h', new Character[]{},
                'i', new Character[]{'g','k'},
                'j', new Character[]{'j','i'},
                'k', new Character[]{}
        );

        test(
                () -> System.out.println(hasPath(graph, 'f', 'h'))
        );

        test(
                () -> System.out.println(hasPath(graph, 'f', 'j'))
        );
    }

    public static void test(Test test) {
        test.test();
    }

    public static boolean hasPath(Map<Character, Character[]> graph, char source, char destination){
        Queue<Character> queue = new LinkedList<>();

        queue.add(source);

        while (!queue.isEmpty()) {
            char current = queue.remove();
            if (current == destination) return true;

            for (char neighbour :graph.get(current))
                queue.add(neighbour);

        }

        return false;
    }
}
