package com.core.exception;

import java.util.List;

public class PersistenceException extends CoreException {

    private static final long serialVersionUID = -986711652082460723L;

    public PersistenceException() {
        super();
    }

    public PersistenceException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public PersistenceException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public PersistenceException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public PersistenceException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public PersistenceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(final String message) {
        super(message);
    }

    public PersistenceException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public PersistenceException(final Throwable cause) {
        super(cause);
    }

}
