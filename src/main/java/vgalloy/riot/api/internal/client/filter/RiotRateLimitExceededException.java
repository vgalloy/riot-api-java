package vgalloy.riot.api.internal.client.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Vincent Galloy on 21/06/16.
 *
 * @author Vincent Galloy
 */
public class RiotRateLimitExceededException extends RuntimeException {

    private static final long serialVersionUID = 5227065410577259768L;

    private final Map<String, List<String>> headers;

    /**
     * Constructor.
     *
     * @param headers the response header of the wrong request
     */
    public RiotRateLimitExceededException(Map<String, List<String>> headers) {
        super("Riot api rate limit exceeded");
        this.headers = Optional.ofNullable(headers).orElse(new HashMap<>());
    }

    /**
     * Get the rate limit type.
     *
     * @return the rate limit type
     */
    public Optional<List<String>> getRateLimitType() {
        return Optional.ofNullable(headers.get("X-Rate-Limit-Type"));
    }

    /**
     * Get the sleeping time.
     *
     * @return the time before the next request
     */
    public Optional<Long> getRetryAfter() {
        if (headers.get("Retry-After") != null) {
            String value = headers.get("Retry-After").get(0);
            if (value != null) {
                return Optional.of(Long.valueOf(value));
            }
        }
        return Optional.empty();
    }

    /**
     * Get the headers.
     *
     * @return the headers
     */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RiotRateLimitExceededException)) {
            return false;
        }
        RiotRateLimitExceededException that = (RiotRateLimitExceededException) o;
        return Objects.equals(headers, that.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headers);
    }

    @Override
    public String toString() {
        return "RiotRateLimitExceededException{" +
            "headers=" + headers +
            '}';
    }
}
