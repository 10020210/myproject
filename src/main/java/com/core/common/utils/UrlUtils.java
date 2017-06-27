package com.core.common.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.core.common.Configuration;

public class UrlUtils {
    private static final String GOOGLE_URL_SHORTENER = Configuration.get("GOOGLE_URL_SHORTENER");
    private static final String API_KEY = Configuration.get("GOOGLE_URL_SHORTENER_API_KEY");

    @SuppressWarnings("rawtypes")
    public static String getShortenUrl(final String longUrl) {
        final String data = "{\"longUrl\": \"" + longUrl + "\"}";
        try {
            final URL url = new URL(GOOGLE_URL_SHORTENER + API_KEY);

            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("User-Agent", "toolbar");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            final OutputStreamWriter output = new OutputStreamWriter(connection.getOutputStream());
            output.write(data);
            output.flush();

            final BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String result = "";
            String line;
            while ((line = response.readLine()) != null) {
                result += line;
            }

            final ObjectMapper mapper = new ObjectMapper();
            final Map map = mapper.readValue(result, Map.class);

            output.close();
            response.close();

            return ((String) map.get("id"));

        } catch (final Exception e) {
            return e.getMessage();
        }
    }
}
