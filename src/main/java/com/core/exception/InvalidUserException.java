package com.core.exception;

import java.util.List;

public class InvalidUserException extends CoreException {

    private static final long serialVersionUID = -5011084767411612072L;

    public InvalidUserException() {
        super();
    }

    public InvalidUserException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public InvalidUserException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public InvalidUserException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public InvalidUserException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public InvalidUserException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    public InvalidUserException(final String message) {
        super(message);
    }

    public InvalidUserException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public InvalidUserException(final Throwable throwable) {
        super(throwable);
    }

    public InvalidUserException(final String description, final String[] msgArgs) {
        super(description, msgArgs);
    }

    public InvalidUserException(final String description, final String[] msgArgs, final String recommendation) {
        super(description, msgArgs, recommendation);
    }
}
