package com.arsatapathy.tree;

import java.util.LinkedList;
import java.util.Queue;

public class HasNode {

    public static boolean hasNode(Node root, Node target) {
        Queue<Node> queue = new LinkedList<>();

        if (root != null) queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current == target) return true;

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return false;
    }
}
