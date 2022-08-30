package com.training.alterra.introspringbootjpa.exceptions;

public class ValidationErrorException extends RuntimeException {
    public ValidationErrorException() {
        super();
    }

    public ValidationErrorException(String messgae, Throwable cause) {
        super(messgae, cause);
    }

    public ValidationErrorException(String messgae) {
        super(messgae);
    }

    public ValidationErrorException(Throwable cause) {
        super(cause);
    }
}
