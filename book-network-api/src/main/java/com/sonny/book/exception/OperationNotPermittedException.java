package com.sonny.book.exception;

public class OperationNotPermittedException extends RuntimeException{

    public OperationNotPermittedException(String message) {
        super(message);
    }
}
