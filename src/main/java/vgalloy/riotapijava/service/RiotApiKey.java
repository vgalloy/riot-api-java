package vgalloy.riotapijava.service;
import java.util.Objects;
import java.util.Properties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class RiotApiKey {

    private String value;

    public RiotApiKey(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public RiotApiKey(Properties properties) {
        this(String.valueOf(properties.get("api_key")));
    }

    public String getValue() {
        return value;
    }
}
