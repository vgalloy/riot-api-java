package vgalloy.riot.api.client.filter;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/06/16.
 */
public class RiotRateLimitExceededException extends RuntimeException {

    private final Map<String, List<String>> headers;

    /**
     * Constructor.
     *
     * @param headers the response header of the wrong request
     */
    public RiotRateLimitExceededException(Map<String, List<String>> headers) {
        this.headers = headers;
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
        if (headers.get("Retry-After") == null) {
            return Optional.empty();
        }
        String value = headers.get("Retry-After").get(0);
        if (value != null) {
            return Optional.of(Long.valueOf(value));
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
        return "RateLimitExceededException{" +
                "headers=" + headers +
                '}';
    }
}
