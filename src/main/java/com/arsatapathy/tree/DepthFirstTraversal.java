package com.arsatapathy.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {

    public static List<Node> DFT(Node root) {
        List<Node> result = new LinkedList<>();

        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            result.add(current);

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }

        return result;
    }
}
