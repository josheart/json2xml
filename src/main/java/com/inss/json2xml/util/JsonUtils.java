package com.inss.json2xml.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.InputStream;
import java.lang.reflect.Type;

@Component
public class JsonUtils {

    public Class<?> deserializeJson(InputStream inputStream, Class<?> T) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(inputStream, (Type) T);
    }

    public <T> T  deserWIthJackson(String json, Class<T> T) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(json, T);
    }
}
