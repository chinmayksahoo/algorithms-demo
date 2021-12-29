package com.arsatapathy.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinValue {

    public static int minValue(Node root) {

        Queue<Node> queue = new LinkedList<>();
        int minValue = 0;

        if (root != null) {
            queue.add(root);
            minValue = root.getWeight();
        }

        while(!queue.isEmpty()) {
            Node current = queue.remove();

            if (current.getWeight() < minValue) minValue = current.getWeight();

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return minValue;
    }
}
