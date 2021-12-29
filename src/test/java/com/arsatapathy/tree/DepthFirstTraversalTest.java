package com.arsatapathy.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DepthFirstTraversalTest extends BinaryTree {

    @Test
    public void test_01() {
        Assertions.assertEquals(List.of(a, b, d, e, c, f), DepthFirstTraversal.DFT(a));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(List.of(), DepthFirstTraversal.DFT(null));
    }
}
