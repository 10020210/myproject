package com.core.common.utils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.core.exception.ErrorMessage;

public class ResourceBundleUtil {

    private static final Logger LOG = Logger.getLogger(ResourceBundleUtil.class);

    private static final ResourceBundle msgBundle = ResourceBundle.getBundle("bundle.validationMessages");
    private static final ResourceBundle infoBundle = ResourceBundle.getBundle("bundle.information");

    public static List<ErrorMessage> getValidationMessages(final List<ErrorMessage> rawMessages) {
        final List<ErrorMessage> errMessages = new ArrayList<>();
        ErrorMessage errorMessage;
        for (final ErrorMessage errMessage : rawMessages) {
            errorMessage = new ErrorMessage(getValidationMessage(errMessage.getDescription(), errMessage.getMessageArgs()),
                    getValidationMessage(errMessage.getRecommendation(), errMessage.getMessageArgs()));
            errMessages.add(errorMessage);
        }
        return errMessages;
    }

    private static String getValidationMessage(final String key, final String[] msgArgs) {
        try {
            if (!org.apache.commons.lang3.StringUtils.isBlank(key)) {
                final String pattern = msgBundle.getString(key);
                if ((msgArgs != null) && (msgArgs.length > 0)) {
                    final String[] msgs = new String[msgArgs.length];
                    for (int i = 0; i < msgArgs.length; i++) {
                        try {
                            msgs[i] = msgBundle.getString(msgArgs[i]);
                        } catch (MissingResourceException e) {
                            msgs[i] = msgArgs[i];
                        }
                    }
                    return MessageFormat.format(pattern, (Object[]) msgs);
                }
                return pattern;
            }
        } catch (final Exception exp) {
            LOG.error(exp.getMessage());
            return key;
        }
        return key;
    }

    private static String getInformationMessage(final String key, final String[] msgArgs) {
        try {
            if (!org.apache.commons.lang3.StringUtils.isBlank(key)) {
                final String pattern = infoBundle.getString(key);
                if ((msgArgs != null) && (msgArgs.length > 0)) {
                    return MessageFormat.format(pattern, (Object[]) (Object[]) msgArgs);
                }
                return pattern;
            }
        } catch (final Exception Exp) {
            return key;
        }
        return key;
    }

    public static String getInformation(final String key) {
        return getInformationMessage(key, null);
    }
}