package com.core.exception;

import java.util.List;

public class UnAuthorizedException extends CoreException {

    private static final long serialVersionUID = -6760759577115759798L;

    public UnAuthorizedException() {
        super();
    }

    public UnAuthorizedException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public UnAuthorizedException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public UnAuthorizedException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public UnAuthorizedException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public UnAuthorizedException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    public UnAuthorizedException(final String message) {
        super(message);
    }

    public UnAuthorizedException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public UnAuthorizedException(final Throwable throwable) {
        super(throwable);
    }

}
