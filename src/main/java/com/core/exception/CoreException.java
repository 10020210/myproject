package com.core.exception;

import java.util.ArrayList;
import java.util.List;

public class CoreException extends Exception {

    private static final long serialVersionUID = 4550803946228112952L;
    private final List<ErrorMessage> errorMessages = new ArrayList<>();

    public CoreException() {
        super();
    }

    public CoreException(final String description, final String recommendation) {
        this.errorMessages.add(new ErrorMessage(description, recommendation));
    }

    public CoreException(final String description, final String[] msgArgs, final String recommendation) {
        this.errorMessages.add(new ErrorMessage(description, msgArgs, recommendation));
    }

    public CoreException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        this.errorMessages.add(new ErrorMessage(description.get(), recommendation.get()));
    }

    public CoreException(final ErrorMessage errorMessage) {
        this.errorMessages.add(errorMessage);
    }

    public CoreException(final List<ErrorMessage> errorMessages) {
        this.errorMessages.addAll(errorMessages);
    }

    public CoreException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CoreException(final String message) {
        this.errorMessages.add(new ErrorMessage(message));
    }

    public CoreException(final String message, final String[] msgArgs) {
        this.errorMessages.add(new ErrorMessage(message, msgArgs));
    }

    public CoreException(final ErrorDescription errorDescription) {
        this.errorMessages.add(new ErrorMessage(errorDescription.get()));
    }

    public CoreException(final Throwable cause) {
        super(cause);
    }

    public List<ErrorMessage> getErrorMessages() {
        return this.errorMessages;
    }

    public void add(final String description) {
        this.errorMessages.add(new ErrorMessage(description));
    }

    public void add(final String description, final String recommendation) {
        this.errorMessages.add(new ErrorMessage(description, recommendation));
    }

    public void add(final String description, final String[] msgArgs, final String recommendation) {
        this.errorMessages.add(new ErrorMessage(description, msgArgs, recommendation));
    }

    public void add(final ErrorMessage errorMessage) {
        this.errorMessages.add(errorMessage);
    }
}
