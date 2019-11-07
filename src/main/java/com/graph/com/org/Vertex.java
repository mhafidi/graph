package com.graph.com.org;

public class Vertex<T> extends Object
{
    T name;


    public Vertex(T name)
    {

        this.name = name;
    }

    public T getName()
    {

        return name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null && obj instanceof Vertex)
        {
            return ((Vertex)obj).name.equals(this.name);
        }
        return false;
    }
}
