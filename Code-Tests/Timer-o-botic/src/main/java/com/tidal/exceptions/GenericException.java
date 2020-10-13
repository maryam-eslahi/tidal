package com.tidal.exceptions;

public class GenericException extends RuntimeException {


    private static final long serialVersionUID = 3955872701312216767L;

    public GenericException(String message) {
        super(message);
    }
}
