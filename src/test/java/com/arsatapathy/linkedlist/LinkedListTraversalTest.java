package com.arsatapathy.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTraversalTest {

    @Test
    public void test_01() {

        Node c = new Node("cat");
        Node d = new Node("dog");
        Node e = new Node("elephant");
        Node a = new Node("apple");
        Node b = new Node("bat");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Assertions.assertEquals(List.of("apple", "bat", "cat", "dog", "elephant"), LinkedListTraversal.traverse(a));

    }

    @Test
    public void test_02() {
        Node c = new Node("cat");
        Node d = new Node("dog");
        Node e = new Node("elephant");
        Node a = new Node("apple");
        Node b = new Node("bat");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Assertions.assertEquals(List.of("apple", "bat", "cat", "dog", "elephant"), LinkedListTraversal.traverse(a, new LinkedList<>()));

    }

    @Test
    public void test_03() {
        Node c = new Node("cat");
        Node d = new Node("dog");
        Node e = new Node("elephant");
        Node a = new Node("apple");
        Node b = new Node("bat");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        LinkedListTraversal.print(a);
    }
}
