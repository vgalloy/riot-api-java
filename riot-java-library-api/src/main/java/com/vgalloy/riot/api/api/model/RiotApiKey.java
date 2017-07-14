package com.vgalloy.riot.api.api.model;

import java.util.Objects;
import java.util.Properties;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public final class RiotApiKey {

    private final String apiKey;

    /**
     * Constructor.
     *
     * @param apiKey the Riot rest key
     */
    private RiotApiKey(String apiKey) {
        this.apiKey = Objects.requireNonNull(apiKey, "Riot api key can not be null");
    }

    /**
     * Build a RiotApiKey from properties.
     *
     * @param properties the properties
     */
    public static RiotApiKey fromProperties(Properties properties) {
        String apiKey = String.valueOf(properties.get("api_key"));
        return of(apiKey);
    }

    /**
     * Build a RiotApiKey.
     * Be aware, don't let your key appears in the code !
     *
     * @param apiKey the Riot rest key
     */
    public static RiotApiKey of(String apiKey) {
        return new RiotApiKey(apiKey);
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RiotApiKey that = (RiotApiKey) o;
        return Objects.equals(apiKey, that.apiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKey);
    }
}
