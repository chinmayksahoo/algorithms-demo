package com.arsatapathy.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstTraversalRecursiveTest {

    @Test
    public void test_01() {
//        Binary Tree
//             a
//            / \
//           b   c
//          / \   \
//         d   e   f

        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

        Assertions.assertEquals(List.of(a, b, d, e, c, f), DepthFirstTraversalRecursive.DFT(a));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(List.of(), DepthFirstTraversalRecursive.DFT(null));
    }

}
