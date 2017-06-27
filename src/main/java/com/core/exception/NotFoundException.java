package com.core.exception;

import java.util.List;

public class NotFoundException extends CoreException {

    private static final long serialVersionUID = -8973182862077126439L;

    public NotFoundException() {
        super();
    }

    public NotFoundException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public NotFoundException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public NotFoundException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public NotFoundException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public NotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public NotFoundException(final Throwable cause) {
        super(cause);
    }

    public NotFoundException(final String description, final String[] msgArgs) {
        super(description, msgArgs);
    }

    public NotFoundException(final String description, final String[] msgArgs, final String recommendation) {
        super(description, msgArgs, recommendation);
    }
}
