package com.graph.com.org;

public class EdgeException extends Exception
{
    String errorMessage;

    public EdgeException(String message)
    {

        super(message);
        this.errorMessage = message;
    }
}
