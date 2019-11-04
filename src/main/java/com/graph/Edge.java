package com.graph;

public class Edge<T>
{
    Vertex<T> vertexLeft, vertexRight;
    double weight = 0.0;
    boolean isDirect, isWeighted;
    Sens sens = Sens.undirected;

    public Edge(Vertex<T> vertexLeft, Vertex<T> vertexRight, double weight,
                boolean isDirect, boolean isWeighted, Sens sens) throws EdgeException
    {

        this.vertexLeft = vertexLeft;
        this.vertexRight = vertexRight;
        this.weight = weight;
        this.isDirect = isDirect;
        this.isWeighted = isWeighted;
        if (isDirect && sens == Sens.undirected)
        {
            throw new EdgeException("The constructed Edge is directed and the entered sens is undirected");

        }
        this.sens = sens;
    }
}
