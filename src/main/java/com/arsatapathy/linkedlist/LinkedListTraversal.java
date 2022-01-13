package com.arsatapathy.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTraversal {

    public static List<String> traverse(Node head) {
        List<String> listToReturn = new LinkedList<>();

        Node current = head;

        while(current!= null) {
            listToReturn.add(current.data);
            current = current.next;
        }

        return listToReturn;
    }

    public static List<String> traverse(Node head, List<String> listToReturn) {
        if (head == null)
            return listToReturn;

        listToReturn.add(head.data);
        return traverse(head.next, listToReturn);
    }

    public static void print(Node head) {
        if (head == null)
            return;

        System.out.println(head.data);

        print(head.next);
    }

}
