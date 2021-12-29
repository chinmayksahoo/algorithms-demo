package com.arsatapathy.tree;

public class TotalWeight {

    public static int totalWeight(Node root) {
        if (root == null) return 0;
        else return root.getWeight() + totalWeight(root.left) + totalWeight(root.right);
    }

}
