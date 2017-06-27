package com.core.exception;

import java.util.List;

public class ServiceException extends CoreException {

    private static final long serialVersionUID = 3890117225813328485L;

    public ServiceException() {
        super();
    }

    public ServiceException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public ServiceException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public ServiceException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public ServiceException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public ServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ServiceException(final String message) {
        super(message);
    }

    public ServiceException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public ServiceException(final Throwable cause) {
        super(cause);
    }

}
