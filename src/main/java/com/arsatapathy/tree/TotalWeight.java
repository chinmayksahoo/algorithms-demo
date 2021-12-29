package com.arsatapathy.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TotalWeight {

    public static int totalWeight(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int totalWeight = 0;

        if (root == null) return 0;
        else queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            totalWeight += current.getWeight();

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return totalWeight;
    }
}
