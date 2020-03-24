package com.mfq.graph;

import java.util.Set;

public class ListGraph implements Graph {
    @Override
    public int edgeSize() {
        return 0;
    }

    @Override
    public int vertexSize() {
        return 0;
    }

    @Override
    public void addVertex(Object o) {

    }

    @Override
    public void addEdge(Object from, Object to) {

    }

    @Override
    public void addEdge(Object from, Object to, Object weight) {

    }

    @Override
    public void removeVertex(Object o) {

    }

    @Override
    public void removeEdge(Object from, Object to) {

    }

    private static class Vertex<V, E> {
        V value;
        Set<Edge<V, E>> inEdges;
        Set<Edge<V, E>> outEdges;
    }

    private static class Edge<V, E> {
        Vertex<V, E> from;
        Vertex<V, E> to;
        E weight;
    }
}
