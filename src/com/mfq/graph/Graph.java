package com.mfq.graph;



public interface Graph<V, E> {
    int edgeSize();

    int vertexSize();

    void addVertex(V v);

    void addEdge(V from, V to);

    void addEdge(V from, V to, E weight);

    void removeVertex(V v);

    void removeEdge(V from, V to);
}
