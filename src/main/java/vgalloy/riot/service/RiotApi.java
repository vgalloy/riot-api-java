package vgalloy.riot.service;

import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.RiotWebApiFactory;
import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.service.query.DefaultParameter;
import vgalloy.riot.service.query.impl.champion.GetChampionByIdQuery;
import vgalloy.riot.service.query.impl.champion.GetChampionListQuery;
import vgalloy.riot.service.query.impl.championmastery.GetChampionMasteryByChampionQuery;
import vgalloy.riot.service.query.impl.championmastery.GetChampionMasteryQuery;
import vgalloy.riot.service.query.impl.championmastery.GetPlayerScore;
import vgalloy.riot.service.query.impl.championmastery.GetTopChampion;
import vgalloy.riot.service.query.impl.currentgame.GetCurrentGameInfoQuery;

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
     * Create the query for champion mastery by champion.
     *
     * @param playerId   the player id
     * @param championId the champion id
     * @return the query
     */
    public GetChampionMasteryByChampionQuery getChampionMasteryByChampion(long playerId, long championId) {
        return new GetChampionMasteryByChampionQuery(riotWebApi, defaultParameter, playerId, championId);
    }

    /**
     * Create the query for champion mastery.
     *
     * @param playerId the player id
     * @return the query
     */
    public GetChampionMasteryQuery getChampionMastery(long playerId) {
        return new GetChampionMasteryQuery(riotWebApi, defaultParameter, playerId);
    }

    /**
     * Create the query for player score.
     *
     * @param playerId the player id
     * @return the query
     */
    public GetPlayerScore getPlayerScore(long playerId) {
        return new GetPlayerScore(riotWebApi, defaultParameter, playerId);
    }

    /**
     * Create the query for top champion.
     *
     * @param playerId the player id
     * @return the query
     */
    public GetTopChampion getTopChampion(long playerId) {
        return new GetTopChampion(riotWebApi, defaultParameter, playerId);
    }

    /**
     * Create the query for current game.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    public GetCurrentGameInfoQuery getCurrentGameInfo(long summonerId) {
        return new GetCurrentGameInfoQuery(riotWebApi, defaultParameter, summonerId);
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
