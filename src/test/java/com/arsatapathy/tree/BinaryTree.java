package com.arsatapathy.tree;

import org.junit.jupiter.api.BeforeAll;

public class BinaryTree {
    //        Binary Tree
    //             a
    //            / \
    //           b   c
    //          / \   \
    //         d   e   f

    protected static final Node a = new Node('a');
    protected static final Node b = new Node('b');
    protected static final Node c = new Node('c');
    protected static final Node d = new Node('d');
    protected static final Node e = new Node('e');
    protected static final Node f = new Node('f');

    @BeforeAll
    public static void init() {
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;
    }
}
