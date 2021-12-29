package com.arsatapathy.tree;

import org.junit.jupiter.api.BeforeAll;

public abstract class BinaryTree {
    //        Binary Tree
    //             a
    //            / \
    //           b   c
    //          / \   \
    //         d   e   f

    protected static final Node a = new Node(3);
    protected static final Node b = new Node(11);
    protected static final Node c = new Node(4);
    protected static final Node d = new Node(4);
    protected static final Node e = new Node(2);
    protected static final Node f = new Node(1);

    @BeforeAll
    public static void init() {
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;
    }
}
