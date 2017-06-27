package com.core.exception;

import org.codehaus.jackson.annotate.JsonIgnore;

public class ErrorMessage {
    private String description;
    private String recommendation;
    @JsonIgnore
    private String[] messageArgs;

    public ErrorMessage(final String description) {
        this.description = description;
    }

    public ErrorMessage(final String description, final String[] messageArgs) {
        this.description = description;
        this.messageArgs = messageArgs;
    }

    public ErrorMessage(final String description, final String recommendation) {
        this.description = description;
        this.recommendation = recommendation;
    }

    public ErrorMessage(final String description, final String[] messageArgs, final String recommendation) {
        this.description = description;
        this.recommendation = recommendation;
        this.messageArgs = messageArgs;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getRecommendation() {
        return this.recommendation;
    }

    public void setRecommendation(final String recommendation) {
        this.recommendation = recommendation;
    }

    public String[] getMessageArgs() {
        return this.messageArgs;
    }

    public void setMessageArgs(final String[] messageArgs) {
        this.messageArgs = messageArgs;
    }

    @Override
    public String toString() {
        return "ErrorMessage [description=" + this.description + ", recommendation=" + this.recommendation + "]";
    }

}
