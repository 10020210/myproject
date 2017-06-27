package com.core.model;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

@Component
public class JsonUTCSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(final Date date, final JsonGenerator gen, final SerializerProvider provider) throws IOException, JsonProcessingException {
        gen.writeString(new DateTime(date).toString());
    }

}
