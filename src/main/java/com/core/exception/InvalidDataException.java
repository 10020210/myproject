package com.core.exception;

import java.util.List;

public class InvalidDataException extends CoreException {

    private static final long serialVersionUID = -5011084767411612072L;

    public InvalidDataException() {
        super();
    }

    public InvalidDataException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public InvalidDataException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public InvalidDataException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public InvalidDataException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public InvalidDataException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    public InvalidDataException(final String message) {
        super(message);
    }

    public InvalidDataException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public InvalidDataException(final Throwable throwable) {
        super(throwable);
    }

    public InvalidDataException(final String description, final String[] msgArgs) {
        super(description, msgArgs);
    }

    public InvalidDataException(final String description, final String[] msgArgs, final String recommendation) {
        super(description, msgArgs, recommendation);
    }
}
