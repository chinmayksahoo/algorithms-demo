package com.arsatapathy.tree;

public class HasNodeRecursive {

    public static boolean hasNode(Node root, Node target) {

        if (root == null) return  false;

        if (root == target) return true;

        return hasNode(root.left, target) || hasNode(root.right, target);

    }
}
