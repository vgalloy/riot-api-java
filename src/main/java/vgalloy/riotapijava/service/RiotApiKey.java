package vgalloy.riotapijava.service;

import java.util.Objects;
import java.util.Properties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class RiotApiKey {

    private String apiKey;

    /**
     * Constructor.
     * Be aware, don't let your key appears in the code !
     * Prefer use constructor with properties.
     *
     * @param apiKey the Riot api key
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
