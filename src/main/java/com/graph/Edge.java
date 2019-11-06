package com.graph;

public class Edge<T> extends Object
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

    @Override
    public boolean equals(Object obj)
    {
        Edge cast;
        if(obj==null)
        {
            return false;
        }
        else
        {
            cast = (Edge) obj;
            if (isDirect)
            {

                return vertexLeft.equals(cast.vertexLeft) && vertexRight.equals(cast.vertexRight)
                        && sens == cast.getSens();
            }
            else
            {
                return (vertexLeft.equals(cast.vertexLeft) && vertexRight.equals(cast.vertexRight))
                        || (vertexLeft.equals(cast.vertexRight) && vertexRight.equals(cast.vertexLeft));
            }
        }

    }

    public Vertex<T> getVertexLeft()
    {

        return vertexLeft;
    }

    public Vertex<T> getVertexRight()
    {

        return vertexRight;
    }

    public double getWeight()
    {

        return weight;
    }

    public boolean isDirect()
    {

        return isDirect;
    }

    public boolean isWeighted()
    {

        return isWeighted;
    }

    public Sens getSens()
    {

        return sens;
    }
}
