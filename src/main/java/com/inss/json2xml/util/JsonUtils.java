package com.inss.json2xml.util;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.InputStream;
import java.lang.reflect.Type;

public class JsonUtils {

    public Class<?> deserializeJson(InputStream inputStream, Class<?> T) {

        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(inputStream, (Type) T);

    }
}
