package com.core.exception;

import java.util.List;

public class ConditionFailedException extends CoreException {

    private static final long serialVersionUID = -509365624468304760L;

    public ConditionFailedException() {
        super();
    }

    public ConditionFailedException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public ConditionFailedException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public ConditionFailedException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public ConditionFailedException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public ConditionFailedException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    public ConditionFailedException(final String message) {
        super(message);
    }

    public ConditionFailedException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public ConditionFailedException(final Throwable throwable) {
        super(throwable);
    }

    public ConditionFailedException(final String description, final String[] msgArgs) {
        super(description, msgArgs);
    }

    public ConditionFailedException(final String description, final String[] msgArgs, final String recommendation) {
        super(description, msgArgs, recommendation);
    }
}
