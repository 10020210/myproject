package com.core.common;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Configuration {
    // private static final Logger LOG = Logger.getLogger(Configuration.class);
    private static final Map<String, String> CONFIG = new Hashtable<String, String>();

    public static void put(final String key, final String value) {
        CONFIG.put(key, value);
    }

    public static String get(final String key) {
        final String value = CONFIG.get(key);
        if (value == null) {
            throw new ConfigurationException();
        }
        return value;
    }

    public static Set<Map.Entry<String, String>> entrySet() {
        return CONFIG.entrySet();
    }
}
