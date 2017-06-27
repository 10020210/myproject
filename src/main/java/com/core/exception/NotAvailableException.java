package com.core.exception;

import java.util.List;

public class NotAvailableException extends CoreException {

    private static final long serialVersionUID = -8973182862077126439L;

    public NotAvailableException() {
        super();
    }

    public NotAvailableException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public NotAvailableException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public NotAvailableException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public NotAvailableException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public NotAvailableException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NotAvailableException(final String message) {
        super(message);
    }

    public NotAvailableException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public NotAvailableException(final Throwable cause) {
        super(cause);
    }
}
