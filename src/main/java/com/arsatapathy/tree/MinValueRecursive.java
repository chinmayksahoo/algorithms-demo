package com.arsatapathy.tree;

public class MinValueRecursive {

    public static int minValue(Node root) {
        if (root == null) return Integer.MAX_VALUE;

        return Math.min(
                Math.min(root.getWeight(), minValue(root.right)),
                Math.min(root.getWeight(), minValue(root.left))
        );

    }
}
