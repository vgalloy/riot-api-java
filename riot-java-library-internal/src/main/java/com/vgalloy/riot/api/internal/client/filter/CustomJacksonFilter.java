package com.vgalloy.riot.api.internal.client.filter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

/**
 * Created by Vincent Galloy on 14/12/16.
 *
 * @author Vincent Galloy
 */
public class CustomJacksonFilter extends JacksonJaxbJsonProvider {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * Constructor.
     */
    public CustomJacksonFilter() {
        setMapper(MAPPER);
    }
}
