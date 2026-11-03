package com.jvcarvalho.webservices.services.exceptions;

import java.io.Serializable;

public class ResouceNotFoundException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;


    public ResouceNotFoundException(Object id) {
        super("Resouce not found. Id: "+ id);
    }
}


