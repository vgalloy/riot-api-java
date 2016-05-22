package vgalloy.riot.service;

import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.RiotWebApiFactory;
import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.service.query.DefaultParameter;
import vgalloy.riot.service.query.impl.GetChampionByIdQuery;
import vgalloy.riot.service.query.impl.GetChampionListQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public class RiotApi {

    private final DefaultParameter defaultParameter = new DefaultParameter();
    private final RiotWebApi riotWebApi;

    /**
     * Constructor.
     *
     * @param rateLimits the rate limits to respect
     */
    public RiotApi(RateLimit... rateLimits) {
        riotWebApi = RiotWebApiFactory.getRiotWebApi(rateLimits);
    }

    /**
     * Create the query for champion list.
     *
     * @return the query
     */
    public GetChampionListQuery getChampionList() {
        return new GetChampionListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for champion by id.
     *
     * @param id the id of the champion
     * @return the query
     */
    public GetChampionByIdQuery getChampionById(long id) {
        return new GetChampionByIdQuery(riotWebApi, defaultParameter, id);
    }

    /**
     * Set the default riot api key for all request.
     *
     * @param defaultRiotApiKey the riot api key
     * @return this
     */
    public RiotApi setDefaultRiotApiKey(RiotApiKey defaultRiotApiKey) {
        this.defaultParameter.setRiotApiKey(defaultRiotApiKey);
        return this;
    }

    /**
     * Set the default region for all request.
     *
     * @param defaultRegion the region
     * @return this
     */
    public RiotApi setDefaultRegion(Region defaultRegion) {
        this.defaultParameter.setRegion(defaultRegion);
        return this;
    }
}
