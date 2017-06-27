package com.core.common.utils;

public class StringUtils {

    public static String getEncapsulatedString(final String mainString, final String str1, final String str2) {
        String encapsulatedString = "";

        encapsulatedString = mainString.substring(mainString.indexOf(str1) + str1.length(), mainString.indexOf(str2));
        return encapsulatedString;
    }

    public static String stripQuotes(final String orig) {
        if (orig == null) {
            return "";
        }
        return orig.replace("\"", "");
    }
}
