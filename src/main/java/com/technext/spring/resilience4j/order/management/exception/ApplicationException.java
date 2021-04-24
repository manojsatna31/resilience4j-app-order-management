package com.technext.spring.resilience4j.order.management.exception;

public class ApplicationException extends Exception{
    public ApplicationException(String msg) {
        super(msg);
    }
}
