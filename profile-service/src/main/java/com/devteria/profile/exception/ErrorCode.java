package com.devteria.profile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION (9999, "Uncategorized exception", HttpStatus.BAD_REQUEST)

    ;
    private final int code;
    private final String message;
    private final HttpStatusCode httpStatusCode;

    ErrorCode(int code, String message, HttpStatusCode httpStatusCode) {
        this.code = code;
        this.message = message;
        this.httpStatusCode = httpStatusCode;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatusCode getHttpStatusCode() {
        return httpStatusCode;
    }
}
