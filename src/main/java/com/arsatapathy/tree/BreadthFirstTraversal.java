package com.arsatapathy.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {

    public static List<Node> BFT(Node root) {
        List<Node> result = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();

        if (root != null) queue.add(root);

        while(!queue.isEmpty()) {
            Node current = queue.remove();

            result.add(current);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);

        }

        return result;
    }
}
