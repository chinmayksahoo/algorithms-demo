package com.arsatapathy.graph;

import java.util.Map;
import java.util.Stack;

public class HasPathUsingDepthFist {

    public static void test(Test test) {
        test.test();
    }

    public static boolean hasPath(Map<Character, Character[]> graph, char source, char destination) {
        Stack<Character> stack = new Stack<>();

        stack.push(source);

        while(!stack.isEmpty()) {
            char current = stack.pop();

            if (current == destination) return true;

            for (char neighbour :graph.get(current))
                stack.push(neighbour);
        }

        return false;
    }
}
