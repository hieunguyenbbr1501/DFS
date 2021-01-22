package com.company;

import java.util.Stack;

public class Graph {
    public Node root;
    public Stack visited;

    public Graph(Node node) {
        root = node;
        visited = new Stack();
    }
    public void depthFirstTraverse() {
        traverse(root);
    }
    public void traverse(Node node) {
        if (node.visited == false && !visited.contains(node)) {
            visited.push(node);
            node.visited = true;
            System.out.println(node.value);
                for (Node neighbor: node.neighbors) {
                    traverse(neighbor);
                }
            if (visited.empty()) {
                return;
            } else {
                visited.pop();
            }
        }
    }
}
