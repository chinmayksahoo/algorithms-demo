package com.arsatapathy.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HasNodeRecursiveTest extends BinaryTree {

    private final Node g = new Node('g');

    @Test
    public void test_01() {
        Assertions.assertTrue(HasNodeRecursive.hasNode(a, c));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(HasNodeRecursive.hasNode(a, g));
    }
}
