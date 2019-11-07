package com.graph.com.org;

import com.graph.com.IEdge;
import com.graph.com.IGraph;

import java.util.HashSet;
import java.util.Set;

public abstract class Graph<T> implements IGraph<T>
{
    protected Set<Vertex<T>> vertices;
    protected Set<IEdge<T>> edges;
    protected boolean isDirectedGraph;
    protected boolean isWeightedGraph;

    public Graph(boolean isDirectedGraph, boolean isWeightedGraph)
    {

        this.isDirectedGraph = isDirectedGraph;
        this.isWeightedGraph = isWeightedGraph;
        vertices= new HashSet<Vertex<T>>();
        edges= new HashSet<IEdge<T>>();
    }

    public boolean addVertex(Vertex<T> aInVertex)
    {

        if (vertices.contains(aInVertex))
        {
            return false;
        }
        vertices.add(aInVertex);
        return true;
    }

    public boolean addEdge(IEdge<T> aInEdge)
    {
        if (edges.contains(aInEdge))
        {
            return false;
        }
        edges.add(aInEdge);
        return true;
    }

}
