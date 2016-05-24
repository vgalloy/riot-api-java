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
import vgalloy.riot.service.query.impl.lolstaticdata.GetChampionDataByIdQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetChampionDataListQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetItemByIdQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetItemListQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetLanguageQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetLanguageStringQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetMapQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetMasteryByIdQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetMasteryListQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetRealmQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetRuneByIdQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetRuneListQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetSummonerSpellByIdQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetSummonerSpellListQuery;
import vgalloy.riot.service.query.impl.lolstaticdata.GetVersionListQuery;
import vgalloy.riot.service.query.impl.lolstatus.GetShardListQuery;
import vgalloy.riot.service.query.impl.lolstatus.GetShardStatusQuery;
import vgalloy.riot.service.query.impl.match.GetMatchDetailByIdQuery;
import vgalloy.riot.service.query.impl.match.GetMatchIdListQuery;
import vgalloy.riot.service.query.impl.match.GetTournamentMatchDetailByIdQuery;
import vgalloy.riot.service.query.impl.matchlist.GetMatchListBySummonerIdQuery;
import vgalloy.riot.service.query.impl.stats.GetPlayerStatsSummaryQuery;
import vgalloy.riot.service.query.impl.stats.GetSummonerRankedStatsQuery;
import vgalloy.riot.service.query.impl.summoner.GetSummonersByIdsQuery;
import vgalloy.riot.service.query.impl.summoner.GetSummonersByNamesQuery;
import vgalloy.riot.service.query.impl.summoner.GetSummonersMasteriesByIdsQuery;
import vgalloy.riot.service.query.impl.summoner.GetSummonersNameByIdsQuery;
import vgalloy.riot.service.query.impl.summoner.GetSummonersRunesByIdsQuery;

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
     * Set the default riot api key for all request.
     *
     * @param defaultRiotApiKey the riot api key
     * @return this
     */
    public RiotApi defaultRiotApiKey(RiotApiKey defaultRiotApiKey) {
        defaultParameter.setRiotApiKey(defaultRiotApiKey);
        return this;
    }

    /**
     * Set the default region for all request.
     *
     * @param defaultRegion the region
     * @return this
     */
    public RiotApi defaultRegion(Region defaultRegion) {
        defaultParameter.setRegion(defaultRegion);
        return this;
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
     * @param championId the champion id
     * @return the query
     */
    public GetChampionByIdQuery getChampionById(long championId) {
        return new GetChampionByIdQuery(riotWebApi, defaultParameter, championId);
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
     * Create the query for champion data list.
     *
     * @return the query
     */
    public GetChampionDataListQuery getChampionDataList() {
        return new GetChampionDataListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for champion data by id.
     *
     * @param championId the champion id
     * @return the query
     */
    public GetChampionDataByIdQuery getChampionDataById(long championId) {
        return new GetChampionDataByIdQuery(riotWebApi, defaultParameter, championId);
    }

    /**
     * Create the query for item list.
     *
     * @return the query
     */
    public GetItemListQuery getItemList() {
        return new GetItemListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for item by id.
     *
     * @param itemId the item id
     * @return the query
     */
    public GetItemByIdQuery getItemById(long itemId) {
        return new GetItemByIdQuery(riotWebApi, defaultParameter, itemId);
    }

    /**
     * Create the query for language string.
     *
     * @return the query
     */
    public GetLanguageStringQuery getLanguageString() {
        return new GetLanguageStringQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for language.
     *
     * @return the query
     */
    public GetLanguageQuery getLanguage() {
        return new GetLanguageQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for map.
     *
     * @return the query
     */
    public GetMapQuery getMap() {
        return new GetMapQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for mastery list.
     *
     * @return the query
     */
    public GetMasteryListQuery getMasteryList() {
        return new GetMasteryListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for mastery by id.
     *
     * @param masteryId the mastery id
     * @return the query
     */
    public GetMasteryByIdQuery getMasteryById(long masteryId) {
        return new GetMasteryByIdQuery(riotWebApi, defaultParameter, masteryId);
    }

    /**
     * Create the query for realm.
     *
     * @return the query
     */
    public GetRealmQuery getRealm() {
        return new GetRealmQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for rune list.
     *
     * @return the query
     */
    public GetRuneListQuery getRuneList() {
        return new GetRuneListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for rune by id.
     *
     * @param runeId the rune id
     * @return the query
     */
    public GetRuneByIdQuery getRuneById(long runeId) {
        return new GetRuneByIdQuery(riotWebApi, defaultParameter, runeId);
    }

    /**
     * Create the query for summoner spell list.
     *
     * @return the query
     */
    public GetSummonerSpellListQuery getSummonerSpellList() {
        return new GetSummonerSpellListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for summoner spell by id.
     *
     * @param summonerSpellId the summoner spell id
     * @return the query
     */
    public GetSummonerSpellByIdQuery getSummonerSpellById(long summonerSpellId) {
        return new GetSummonerSpellByIdQuery(riotWebApi, defaultParameter, summonerSpellId);
    }

    /**
     * Create the query for version list.
     *
     * @return the query
     */
    public GetVersionListQuery getVersionList() {
        return new GetVersionListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for shard list.
     *
     * @return the query
     */
    public GetShardListQuery getShardList() {
        return new GetShardListQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for shard status.
     *
     * @return the query
     */
    public GetShardStatusQuery getShardStatus() {
        return new GetShardStatusQuery(riotWebApi, defaultParameter);
    }

    /**
     * Create the query for match id list.
     *
     * @param tournamentCode the tournament code
     * @return the query
     */
    public GetMatchIdListQuery getMatchIdList(long tournamentCode) {
        return new GetMatchIdListQuery(riotWebApi, defaultParameter, tournamentCode);
    }

    /**
     * Create the query for shard list.
     *
     * @param tournamentMatchId the tournament match id
     * @return the query
     */
    public GetTournamentMatchDetailByIdQuery getTournamentMatchDetailById(long tournamentMatchId) {
        return new GetTournamentMatchDetailByIdQuery(riotWebApi, defaultParameter, tournamentMatchId);
    }

    /**
     * Create the query for shard status.
     *
     * @param matchId the matchId
     * @return the query
     */
    public GetMatchDetailByIdQuery getMatchDetailById(long matchId) {
        return new GetMatchDetailByIdQuery(riotWebApi, defaultParameter, matchId);
    }

    /**
     * Create the query for match list by summoner.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    public GetMatchListBySummonerIdQuery getMatchListBySummonerId(long summonerId) {
        return new GetMatchListBySummonerIdQuery(riotWebApi, defaultParameter, summonerId);
    }

    /**
     * Create the query for summoner ranked stats.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    public GetSummonerRankedStatsQuery getSummonerRankedStats(long summonerId) {
        return new GetSummonerRankedStatsQuery(riotWebApi, defaultParameter, summonerId);
    }

    /**
     * Create the query for player stats summary.
     *
     * @param playerId the player id
     * @return the query
     */
    public GetPlayerStatsSummaryQuery getPlayerStatsSummary(long playerId) {
        return new GetPlayerStatsSummaryQuery(riotWebApi, defaultParameter, playerId);
    }

    /**
     * Create the query for summoner by name.
     *
     * @param playerNames the player names
     * @return the query
     */
    public GetSummonersByNamesQuery getSummonerByNames(String... playerNames) {
        return new GetSummonersByNamesQuery(riotWebApi, defaultParameter, playerNames);
    }

    /**
     * Create the query for summoner by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    public GetSummonersByIdsQuery getSummonersByIds(long... playerIds) {
        return new GetSummonersByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    /**
     * Create the query for summoner masteries by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    public GetSummonersMasteriesByIdsQuery getSummonersMasteriesByIds(long... playerIds) {
        return new GetSummonersMasteriesByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    /**
     * Create the query for player summoner name by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    public GetSummonersNameByIdsQuery getSummonersNameByIds(long... playerIds) {
        return new GetSummonersNameByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    /**
     * Create the query for summoner runes by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    public GetSummonersRunesByIdsQuery getSummonersRunesByIds(long... playerIds) {
        return new GetSummonersRunesByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }
}
