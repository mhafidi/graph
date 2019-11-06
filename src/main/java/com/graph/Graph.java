package com.graph;

import java.util.List;
import java.util.Set;

public class Graph<T>
{
    List<Vertex<T>> vertices;
    Set<Edge<T>> unDirectEdges;
    List<Edge<T>> edges;
    boolean isDirectedGraph;
    boolean isWeightedGraph;

    public Graph(List<Vertex<T>> vertices, List<Edge<T>> edges,
                 boolean isDirectedGraph, boolean isWeightedGraph)
    {
        this.vertices = vertices;
        this.edges = edges;
        this.isDirectedGraph = isDirectedGraph;
        this.isWeightedGraph = isWeightedGraph;
    }

}
