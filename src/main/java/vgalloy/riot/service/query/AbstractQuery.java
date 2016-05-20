package vgalloy.riot.service.query;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.RiotWebApiFactory;
import vgalloy.riot.service.RiotApiKey;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public abstract class AbstractQuery<Dto> implements Query<Dto> {

    protected RiotWebApi riotWebApi = RiotWebApiFactory.getRiotWebApi();
    protected DefaultParameter defaultParameter;
    protected RiotApiKey riotApiKey;

    /**
     * Constructor.
     *
     * @param defaultParameter the default query parameter
     */
    public AbstractQuery(DefaultParameter defaultParameter) {
        this.defaultParameter = defaultParameter.clone();
    }

    /**
     * Set the riot api key for this request.
     *
     * @param riotApiKey the riot api key
     * @return the current query
     */
    public AbstractQuery<Dto> setRiotApiKey(RiotApiKey riotApiKey) {
        this.riotApiKey = riotApiKey;
        return this;
    }

    /**
     * Gets the parameter. Return the current parameter or the default parameter if the first one is null.
     * If both are null throw null pointer exception.
     *
     * @param currentParameter the current parameter
     * @param defaultParameter the default parameter
     * @param message          the message if currentParameter and defaultParameter are null
     * @param <T>              the return type
     * @return the parameter
     */
    protected <T> T getParameter(T currentParameter, T defaultParameter, String message) {
        if (currentParameter != null) {
            return currentParameter;
        }
        return Objects.requireNonNull(defaultParameter, message);
    }

    /**
     * Gets the parameter.
     *
     * @param currentParameter the current parameter
     * @param message          the message if currentParameter if null;
     * @param <T>              the return type
     * @return the parameter
     */
    protected <T> T getParameter(T currentParameter, String message) {
        return getParameter(currentParameter, null, message);
    }
}
