package com.romart.graphs;

import java.util.List;
import java.util.Stack;

public final class Traversal {

    /*
        private constructor disallows instantiation of utility class
     */
    private Traversal() {
        throw new RuntimeException("Instantiation of Traversal class not allowed.");
    }

    /*
            DFS Iterative using a Stack
    */
    public static void depthFirstSearchIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode.isVisited()) {
                currentNode.visit();
                          }

            List<Node> neighbours = currentNode.getNeighbours();

            for (Node neighbour : neighbours) {
                if (neighbour != null && !neighbour.isVisited()) {
                    stack.push(neighbour);
                }
            }
        }
    }

    public static void depthFirstSearchRecursive(Node node) {
        List<Node> neighbours = node.getNeighbours();

        node.visit();

        for (Node neighbour : neighbours) {
            if(neighbour != null && !neighbour.isVisited()) {
                depthFirstSearchRecursive(neighbour);
            }
        }
    }
}
