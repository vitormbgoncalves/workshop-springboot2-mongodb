package com.innovativetecnologia.springboot2mongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 3926348368545333L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
