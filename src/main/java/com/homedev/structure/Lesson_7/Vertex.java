package com.homedev.structure.Lesson_7;

public class Vertex {

    private final String label;
    private boolean visited;
    private Vertex prevVertex;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public Vertex getPrevVertex() {
        return prevVertex;
    }

    public void setPrevVertex(Vertex prevVertex) {
        this.prevVertex = prevVertex;
    }
}
