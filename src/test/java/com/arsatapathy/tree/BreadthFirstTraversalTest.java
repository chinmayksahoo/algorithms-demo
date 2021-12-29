package com.arsatapathy.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BreadthFirstTraversalTest extends BinaryTree {

    @Test
    public void test_01() {
        Assertions.assertEquals(List.of(a, b, c, d, e, f), BreadthFirstTraversal.BFT(a));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(List.of(), BreadthFirstTraversal.BFT(null));
    }
}
