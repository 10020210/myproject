package com.core.exception;

public enum ErrorDescription {
    COULD_NOT_PROCEED("We are currently not able to proceed with your request"), INVALID_REQUEST("Invalid Request");

    private String description;

    private ErrorDescription(final String description) {
        this.description = description;
    }

    public String get() {
        return this.description;
    }
}
