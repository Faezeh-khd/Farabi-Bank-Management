package com.company;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException (String errorMessage) {
        super(errorMessage);
    }
}