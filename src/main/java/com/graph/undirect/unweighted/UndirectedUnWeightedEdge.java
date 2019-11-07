package com.graph.undirect.unweighted;

import com.graph.com.org.Edge;
import com.graph.com.org.EdgeException;
import com.graph.com.org.Sens;
import com.graph.com.org.Vertex;

public class UndirectedUnWeightedEdge<T> extends Edge<T>
{
    public UndirectedUnWeightedEdge(Vertex<T> vertexLeft, Vertex<T> vertexRight) throws EdgeException
    {
        super(vertexLeft, vertexRight, 0.0, false, false, Sens.undirected);
    }

    @Override
    public String toString()
    {
        return "{" + this.vertexLeft.getName() + "," + this.vertexRight.getName() + "}";
    }

}
