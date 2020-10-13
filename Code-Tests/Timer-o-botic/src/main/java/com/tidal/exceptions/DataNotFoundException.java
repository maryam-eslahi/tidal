package com.tidal.exceptions;

public class DataNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6946963757977196984L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
