package com.core.exception;

import java.util.List;

public class UniqueConstraintException extends CoreException {

    private static final long serialVersionUID = 4696874821099317538L;

    public UniqueConstraintException() {
        super();
    }

    public UniqueConstraintException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public UniqueConstraintException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public UniqueConstraintException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public UniqueConstraintException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public UniqueConstraintException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UniqueConstraintException(final String message) {
        super(message);
    }

    public UniqueConstraintException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public UniqueConstraintException(final Throwable cause) {
        super(cause);
    }

}
