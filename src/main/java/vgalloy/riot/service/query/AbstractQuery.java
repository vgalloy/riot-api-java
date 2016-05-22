package vgalloy.riot.service.query;

import vgalloy.riot.api.dto.constant.PlatformId;
import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.RiotApiKey;
import vgalloy.riot.service.mapper.RegionMapper;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public abstract class AbstractQuery<Dto> implements Query<Dto> {

    protected RiotWebApi riotWebApi;
    protected DefaultParameter defaultParameter;
    protected RiotApiKey riotApiKey;
    protected Region region;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public AbstractQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        this.riotWebApi = riotWebApi;
        this.defaultParameter = defaultParameter;
    }

    /**
     * Set the riot api key for this request.
     *
     * @param riotApiKey the riot api key
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
     * Return the Riot api key value.
     *
     * @return the Riot api key value
     */
    protected String getRiotApiKeyValue() {
        return getParameter(this.riotApiKey, defaultParameter.getRiotApiKey(), "Riot api key undefined").getApiKey();
    }

    /**
     * Return the region.
     *
     * @return the region
     */
    protected Region getRegion() {
        return getParameter(this.region, defaultParameter.getRegion(), "Region is undefined");
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
