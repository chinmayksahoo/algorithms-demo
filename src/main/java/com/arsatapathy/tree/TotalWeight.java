package com.arsatapathy.tree;

public class TotalWeight {

    public static int totalWeight(Node root) {
        int sum = 0;

        if (root == null) return 0;

        if (root.left != null)  sum += totalWeight(root.left);
        if (root.right != null) sum += totalWeight(root.right);

        return sum + root.getWeight();
    }

}
