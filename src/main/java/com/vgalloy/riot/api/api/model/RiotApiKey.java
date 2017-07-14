package com.vgalloy.riot.api.api.model;

import java.util.Objects;
import java.util.Properties;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class RiotApiKey {

    private final String apiKey;

    /**
     * Constructor.
     * Be aware, don't let your key appears in the code !
     *
     * @param apiKey the Riot rest key
     */
    public RiotApiKey(String apiKey) {
        this.apiKey = Objects.requireNonNull(apiKey, "Riot api key can not be null");
    }

    /**
     * Constructor from properties.
     *
     * @param properties the properties
     */
    public RiotApiKey(Properties properties) {
        this(String.valueOf(properties.get("api_key")));
    }

    public String getApiKey() {
        return apiKey;
    }
}
