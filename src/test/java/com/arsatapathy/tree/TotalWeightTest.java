package com.arsatapathy.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TotalWeightTest extends BinaryTree {

    @Test
    public void test_01() {
        Assertions.assertEquals(25, TotalWeight.totalWeight(a));
    }
}
