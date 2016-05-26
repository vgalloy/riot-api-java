package vgalloy.riot.api.service.query;

import java.util.Collection;
import java.util.Objects;
import java.util.StringJoiner;

import vgalloy.riot.api.rest.constant.PlatformId;
import vgalloy.riot.api.rest.constant.Region;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.RiotApiKey;
import vgalloy.riot.api.service.mapper.RegionMapper;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public abstract class AbstractQuery<Dto> extends AbstractCallbackQuery<Dto> {

    protected final RiotWebApi riotWebApi;
    protected final DefaultParameter defaultParameter;
    protected RiotApiKey riotApiKey;
    protected Region region;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public AbstractQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        this.riotWebApi = riotWebApi;
        this.defaultParameter = defaultParameter;
    }

    /**
     * Set the riot rest key for this request.
     *
     * @param riotApiKey the riot rest key
     * @return the current query
     */
    public AbstractQuery<Dto> riotApiKey(RiotApiKey riotApiKey) {
        this.riotApiKey = riotApiKey;
        return this;
    }

    /**
     * Set the region for this request.
     *
     * @param region the region
     * @return the current query
     */
    public AbstractQuery<Dto> region(Region region) {
        this.region = region;
        return this;
    }

    /**
     * Return the Riot rest key value.
     *
     * @return the Riot rest key value
     */
    protected String getRiotApiKeyValue() {
        return getParameter(riotApiKey, defaultParameter.getRiotApiKey(), "Riot api key undefined").getApiKey();
    }

    /**
     * Return the region.
     *
     * @return the region
     */
    protected Region getRegion() {
        return getParameter(region, defaultParameter.getRegion(), "Region is undefined");
    }

    /**
     * Return the platform id.
     *
     * @return the platform id
     */
    protected PlatformId getPlatformId() {
        return RegionMapper.fromRegion(getRegion());
    }

    /**
     * Convert a list of item into a String separated by comma.
     *
     * @param list the list of item
     * @return a String
     */
    protected String convert(Collection<?> list) {
        StringJoiner stringJoiner = new StringJoiner(",");
        list.stream().forEach(e -> stringJoiner.add(e.toString()));
        return stringJoiner.toString();
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
}
