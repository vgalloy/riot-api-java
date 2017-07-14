package com.vgalloy.riot.api.internal.query;

import java.util.Collection;
import java.util.Objects;
import java.util.StringJoiner;

import com.vgalloy.riot.library.api.constant.PlatformId;
import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.service.mapper.RegionMapper;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public abstract class AbstractQuery<QUERY extends AbstractQuery<QUERY, DTO>, DTO> extends AbstractCallbackQuery<QUERY, DTO> {

    protected final RiotWebApi riotWebApi;

    private final DefaultParameter defaultParameter;

    private RiotApiKey riotApiKey;
    private Region region;

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
    @SuppressWarnings("unchecked")
    public QUERY riotApiKey(RiotApiKey riotApiKey) {
        this.riotApiKey = riotApiKey;
        return (QUERY) this;
    }

    /**
     * Set the region for this request.
     *
     * @param region the region
     * @return the current query
     */
    @SuppressWarnings("unchecked")
    public QUERY region(Region region) {
        this.region = region;
        return (QUERY) this;
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
        list.stream()
            .map(Object::toString)
            .forEach(stringJoiner::add);
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
    private <T> T getParameter(T currentParameter, T defaultParameter, String message) {
        if (currentParameter != null) {
            return currentParameter;
        }
        return Objects.requireNonNull(defaultParameter, message);
    }
}
