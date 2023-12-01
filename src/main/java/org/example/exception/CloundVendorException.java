package org.example.exception;

import org.springframework.http.HttpStatus;

public class CloundVendorException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    public String getMessage() {
        return message;
    }
    public Throwable getThrowable() {
        return throwable;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    public CloundVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }
}
