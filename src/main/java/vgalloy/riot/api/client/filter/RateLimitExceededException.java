package vgalloy.riot.api.client.filter;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/06/16.
 */
public class RateLimitExceededException extends RuntimeException {

    private final String retryAfter;
    private final String xRateLimitType;
    private final String xRateLimitCount;

    /**
     * Constructor.
     *
     * @param retryAfter      The remaining number of seconds before the rate limit resets
     * @param xRateLimitType  The rate limit type, either "user" or "service"
     * @param xRateLimitCount The rate limit count
     */
    public RateLimitExceededException(String retryAfter, String xRateLimitType, String xRateLimitCount) {
        this.retryAfter = retryAfter;
        this.xRateLimitType = xRateLimitType;
        this.xRateLimitCount = xRateLimitCount;
    }

    public String getRetryAfter() {
        return retryAfter;
    }

    public String getXRateLimitType() {
        return xRateLimitType;
    }

    public String getXRateLimitCount() {
        return xRateLimitCount;
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
        return Objects.equals(retryAfter, that.retryAfter) &&
                Objects.equals(xRateLimitType, that.xRateLimitType) &&
                Objects.equals(xRateLimitCount, that.xRateLimitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryAfter, xRateLimitType, xRateLimitCount);
    }

    @Override
    public String toString() {
        return "RateLimitExceededException{" +
                "retryAfter='" + retryAfter + '\'' +
                ", xRateLimitType='" + xRateLimitType + '\'' +
                ", xRateLimitCount='" + xRateLimitCount + '\'' +
                '}';
    }
}
