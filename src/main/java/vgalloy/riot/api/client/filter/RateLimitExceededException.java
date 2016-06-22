package vgalloy.riot.api.client.filter;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/06/16.
 */
public class RateLimitExceededException extends RuntimeException {

    private final Map<String, List<String>> headers;

    /**
     * Constructor.
     *
     * @param headers the response header of the wrong request
     */
    public RateLimitExceededException(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RateLimitExceededException)) {
            return false;
        }
        RateLimitExceededException that = (RateLimitExceededException) o;
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
