package vgalloy.riot.api.client.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import java.io.IOException;

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
            throw new RiotRateLimitExceededException(clientResponseContext.getHeaders());
        }
    }
}
