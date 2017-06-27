package com.core.common;

public class ConfigurationException extends RuntimeException {

    private static final long serialVersionUID = -5972652188047355044L;

    public ConfigurationException() {
        super();
    }

    public ConfigurationException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ConfigurationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(final String message) {
        super(message);
    }

    public ConfigurationException(final Throwable cause) {
        super(cause);
    }

}
