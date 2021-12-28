package com.arsatapathy.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DepthFirstTraversal {

    public static List<Character> DFT(Map<Character, Character[]> graph, char start) {
        List<Character> result = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
           char current = stack.pop();
           result.add(current);
           for(char neighbour :graph.get(current)) {
               stack.push(neighbour);
           }
        }
        return result;
    }
}
