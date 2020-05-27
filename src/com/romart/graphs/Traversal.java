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
    public static void depthForSearchIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode.isVisited()) {
                currentNode.visit();
                printNode(currentNode);
            }

            List<Node> neighbours = currentNode.getNeighbours();

            for (Node neighbour : neighbours) {
                if (neighbour != null && neighbour.isVisited()) {
                    stack.push(neighbour);
                }
            }
        }
    }

    public static void depthForSearchRecursive(Node node) {
        List<Node> neighbours = node.getNeighbours();

        node.visit();
        printNode(node);

        for(Node neighbour : neighbours) {
            if(neighbour != null && neighbour.isVisited()) {
                depthForSearchRecursive(neighbour);
            }
        }
    }

    public static void printNode(Node node) {
        System.out.printf("Visited element '%s' with value '%d'.", node.getName(), node.getData());
    }


}
