package com.arsatapathy.tree;

public class MaxRootToLeafPath {

    public static int maxRootToLeafPath(Node root) {

        if (root == null) return Integer.MIN_VALUE;

        if (root.left == null && root.right == null) return root.getWeight();

        return root.getWeight() + Math.max(maxRootToLeafPath(root.left), maxRootToLeafPath(root.right));
    }
}