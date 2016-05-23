package vgalloy.riot.service;

import vgalloy.riot.api.constant.QueueType;
import vgalloy.riot.api.constant.Region;
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
import vgalloy.riot.service.query.impl.featuredgame.GetFeaturedGameQuery;
import vgalloy.riot.service.query.impl.game.GetRecentGameQuery;
import vgalloy.riot.service.query.impl.league.GetChallengerQuery;
import vgalloy.riot.service.query.impl.league.GetLeaguesBySummonerIdsQuery;
import vgalloy.riot.service.query.impl.league.GetLeaguesByTeamIdsQuery;
import vgalloy.riot.service.query.impl.league.GetLeaguesEntryBySummonerIdsQuery;
import vgalloy.riot.service.query.impl.league.GetLeaguesEntryByTeamIdsQuery;
import vgalloy.riot.service.query.impl.league.GetMasterQuery;

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
     * Create the query for feature game.
     *
     * @return the query
     */
    public GetFeaturedGameQuery getFeatureGame() {
        return new GetFeaturedGameQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for recent game.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    public GetRecentGameQuery getRecentGame(long summonerId) {
        return new GetRecentGameQuery(riotWebApi, defaultParameter, summonerId);
    }

    /**
     * Create the query for summoner leagues.
     *
     * @param summonerIds the summoner ids
     * @return the query
     */
    public GetLeaguesBySummonerIdsQuery getLeaguesBySummonerIds(long... summonerIds) {
        return new GetLeaguesBySummonerIdsQuery(riotWebApi, defaultParameter, summonerIds);
    }

    /**
     * Create the query for summoner league entries.
     *
     * @param summonerIds the summoner ids
     * @return the query
     */
    public GetLeaguesEntryBySummonerIdsQuery getLeaguesEntryBySummonerIds(long... summonerIds) {
        return new GetLeaguesEntryBySummonerIdsQuery(riotWebApi, defaultParameter, summonerIds);
    }

    /**
     * Create the query for team leagues.
     *
     * @param teamIds the team ids
     * @return the query
     */
    public GetLeaguesByTeamIdsQuery getLeaguesByTeamIds(long... teamIds) {
        return new GetLeaguesByTeamIdsQuery(riotWebApi, defaultParameter, teamIds);
    }

    /**
     * Create the query for team league entries.
     *
     * @param teamIds the team ids
     * @return the query
     */
    public GetLeaguesEntryByTeamIdsQuery getLeaguesEntryByTeamIds(long... teamIds) {
        return new GetLeaguesEntryByTeamIdsQuery(riotWebApi, defaultParameter, teamIds);
    }

    /**
     * Create the query for challenger.
     *
     * @param queueType queue type
     * @return the query
     */
    public GetChallengerQuery getChallenger(QueueType queueType) {
        return new GetChallengerQuery(riotWebApi, defaultParameter, queueType);
    }

    /**
     * Create the query for master.
     *
     * @param queueType queue type
     * @return the query
     */
    public GetMasterQuery getMaster(QueueType queueType) {
        return new GetMasterQuery(riotWebApi, defaultParameter, queueType);
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
