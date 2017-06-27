package com.core.exception;

import java.util.List;

public class ForbiddenException extends CoreException {

    private static final long serialVersionUID = 1834875986465726882L;

    public ForbiddenException() {
        super();
    }

    public ForbiddenException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public ForbiddenException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public ForbiddenException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public ForbiddenException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public ForbiddenException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    public ForbiddenException(final String message) {
        super(message);
    }

    public ForbiddenException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public ForbiddenException(final Throwable throwable) {
        super(throwable);
    }

}
