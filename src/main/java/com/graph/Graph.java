package com.graph;

import java.util.List;

public class Graph<T>
{
    List<Vertex<T>> vertices;
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
