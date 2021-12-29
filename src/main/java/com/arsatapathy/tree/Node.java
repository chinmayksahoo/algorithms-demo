package com.arsatapathy.tree;

public class Node {

    private final int weight;
    public Node left;
    public Node right;

    Node(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
