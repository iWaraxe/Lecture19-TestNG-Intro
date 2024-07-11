package com.coherentsolutions.java.webauto.section10;

/**
 * Exception thrown when a wrong parameter is passed.
 */
public class WrongParameterException extends Exception {
    public WrongParameterException(String message) {
        super(message);
    }
}
