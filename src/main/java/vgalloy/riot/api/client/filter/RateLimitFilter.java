package vgalloy.riot.api.client.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import java.io.IOException;
import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/06/16.
 */
public class RateLimitFilter implements ClientResponseFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(RateLimitFilter.class);

    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext) throws IOException {
        LOGGER.debug("Rate limit : " + clientResponseContext.getHeaders().get("X-Rate-Limit-Count"));
        if (clientResponseContext.getStatus() == 429) {
            //clientResponseContext.getHeaders().entrySet().forEach(e -> LOGGER.warn("{} : {}", e.getKey(), e.getValue()));

            List<String> retryAfter = clientResponseContext.getHeaders().get("Retry-After");
            List<String> xRateLimitType = clientResponseContext.getHeaders().get("X-Rate-Limit-Type");
            List<String> xRateLimitCount = clientResponseContext.getHeaders().get("X-Rate-Limit-Count");
            throw new RateLimitExceededException(toString(retryAfter), toString(xRateLimitType), toString(xRateLimitCount));
        }
    }

    /**
     * Convert a list of String into one string.
     *
     * @param header the list of string, can be null
     * @return a string can br null
     */
    private String toString(List<String> header) {
        if (header == null) {
            return null;
        }
        return header.toString();
    }
}
