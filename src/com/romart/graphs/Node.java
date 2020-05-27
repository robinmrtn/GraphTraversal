package com.romart.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private int data;
    private boolean visited;
    private List<Node> neighbours;

    public Node(String name, int data) {
        this.name = name;
        this.data = data;
        this.visited = false;
        this.neighbours = new ArrayList<>();
    }

    public void visit() {
        this.visited = true;
    }

    public void addNeighbour(Node neighbour) {
        this.neighbours.add(neighbour);
    }

    public List<Node> getNeighbours() {
        return this.neighbours;
    }

    public String getName() {
        return name;
    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }
}
