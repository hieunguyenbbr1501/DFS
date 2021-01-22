package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);
        Node g = new Node(6);
        a.addNeighbor(b);
        a.addNeighbor(c);
        b.addNeighbor(d);
        d.addNeighbor(c);
        d.addNeighbor(e);
        e.addNeighbor(f);
        e.addNeighbor(g);
        Graph graph = new Graph(a);
        graph.depthFirstTraverse();
    }
}
