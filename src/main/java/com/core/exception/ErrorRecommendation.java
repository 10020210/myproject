package com.core.exception;

public enum ErrorRecommendation {
    CONATCT_ADMIN("Please contact Administrator");

    private String message;

    private ErrorRecommendation(final String description) {
        this.message = description;
    }

    public String get() {
        return this.message;
    }
}
