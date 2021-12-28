package com.arsatapathy.tree;

import java.util.LinkedList;
import java.util.List;

public class DepthFirstTraversalRecursive {

    public static List<Node> DFT(Node root) {
        List<Node> result = new LinkedList<>();

        if (root != null) result.add(root);
        else return result;

        if (root.left != null) result.addAll(DFT(root.left));
        if (root.right != null) result.addAll(DFT(root.right));

        return result;
    }

}
