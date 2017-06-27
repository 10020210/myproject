package com.core.exception;

import java.util.List;

public class FileExistsException extends CoreException {

    private static final long serialVersionUID = -8973182862077126439L;

    public FileExistsException() {
        super();
    }

    public FileExistsException(final String description, final String recommendation) {
        super(description, recommendation);
    }

    public FileExistsException(final ErrorDescription description, final ErrorRecommendation recommendation) {
        super(description, recommendation);
    }

    public FileExistsException(final ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public FileExistsException(final List<ErrorMessage> errorMessages) {
        super(errorMessages);
    }

    public FileExistsException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FileExistsException(final String message) {
        super(message);
    }

    public FileExistsException(final ErrorDescription errorDescription) {
        super(errorDescription);
    }

    public FileExistsException(final Throwable cause) {
        super(cause);
    }
}
