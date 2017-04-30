package vgalloy.riot.api.internal.service;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.api.model.RateLimit;
import vgalloy.riot.api.api.model.RiotApi;
import vgalloy.riot.api.api.model.RiotApiKey;
import vgalloy.riot.api.api.query.impl.champion.GetChampionByIdQuery;
import vgalloy.riot.api.api.query.impl.champion.GetChampionListQuery;
import vgalloy.riot.api.api.query.impl.championmastery.GetChampionMasteryByChampionQuery;
import vgalloy.riot.api.api.query.impl.championmastery.GetChampionMasteryQuery;
import vgalloy.riot.api.api.query.impl.championmastery.GetPlayerScore;
import vgalloy.riot.api.api.query.impl.championmastery.GetTopChampion;
import vgalloy.riot.api.api.query.impl.currentgame.GetCurrentGameInfoQuery;
import vgalloy.riot.api.api.query.impl.featuredgame.GetFeaturedGameQuery;
import vgalloy.riot.api.api.query.impl.game.GetRecentGameQuery;
import vgalloy.riot.api.api.query.impl.league.GetChallengerQuery;
import vgalloy.riot.api.api.query.impl.league.GetLeaguesBySummonerIdsQuery;
import vgalloy.riot.api.api.query.impl.league.GetLeaguesByTeamIdsQuery;
import vgalloy.riot.api.api.query.impl.league.GetLeaguesEntryBySummonerIdsQuery;
import vgalloy.riot.api.api.query.impl.league.GetLeaguesEntryByTeamIdsQuery;
import vgalloy.riot.api.api.query.impl.league.GetMasterQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetChampionDataByIdQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetChampionDataListQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetItemByIdQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetItemListQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetLanguageQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetLanguageStringQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetMapQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetMasteryByIdQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetMasteryListQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetRealmQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetRuneByIdQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetRuneListQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetSummonerSpellByIdQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetSummonerSpellListQuery;
import vgalloy.riot.api.api.query.impl.lolstaticdata.GetVersionListQuery;
import vgalloy.riot.api.api.query.impl.lolstatus.GetShardListQuery;
import vgalloy.riot.api.api.query.impl.lolstatus.GetShardStatusQuery;
import vgalloy.riot.api.api.query.impl.match.GetMatchDetailByIdQuery;
import vgalloy.riot.api.api.query.impl.match.GetMatchIdListByTournamentCodeQuery;
import vgalloy.riot.api.api.query.impl.match.GetTournamentMatchDetailByIdQuery;
import vgalloy.riot.api.api.query.impl.matchlist.GetMatchListBySummonerIdQuery;
import vgalloy.riot.api.api.query.impl.stats.GetPlayerStatsSummaryQuery;
import vgalloy.riot.api.api.query.impl.stats.GetRankedStatsQuery;
import vgalloy.riot.api.api.query.impl.summoner.GetSummonersByIdsQuery;
import vgalloy.riot.api.api.query.impl.summoner.GetSummonersByNamesQuery;
import vgalloy.riot.api.api.query.impl.summoner.GetSummonersMasteriesByIdsQuery;
import vgalloy.riot.api.api.query.impl.summoner.GetSummonersNameByIdsQuery;
import vgalloy.riot.api.api.query.impl.summoner.GetSummonersRunesByIdsQuery;
import vgalloy.riot.api.api.query.impl.team.GetTeamsBySummonerIdsQuery;
import vgalloy.riot.api.api.query.impl.team.GetTeamsByTeamIdsQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.client.RiotWebApiFactory;
import vgalloy.riot.api.internal.client.ratelimite.RateLimitManager;
import vgalloy.riot.api.internal.client.ratelimite.impl.RateLimitManagerImpl;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public class RiotApiImpl implements RiotApi {

    private final DefaultParameter defaultParameter = new DefaultParameter();
    private final RiotWebApi riotWebApi;
    private final RateLimitManager rateLimitManager;

    /**
     * Constructor.
     */
    public RiotApiImpl() {
        rateLimitManager = new RateLimitManagerImpl();
        riotWebApi = RiotWebApiFactory.getRiotWebApi(rateLimitManager);
    }

    @Override
    public RiotApiImpl addGlobalRateLimit(RateLimit... rateLimit) {
        rateLimitManager.addRateLimit(rateLimit);
        return this;
    }

    @Override
    public RiotApiImpl addRegionRateLimit(Region region, RateLimit... rateLimit) {
        rateLimitManager.addRateLimit(SmallCaseRegion.of(region), rateLimit);
        return this;
    }

    @Override
    public RiotApiImpl defaultRiotApiKey(RiotApiKey defaultRiotApiKey) {
        defaultParameter.setRiotApiKey(defaultRiotApiKey);
        return this;
    }

    @Override
    public RiotApiImpl defaultRegion(Region defaultRegion) {
        defaultParameter.setRegion(defaultRegion);
        return this;
    }

    @Override
    public GetChampionListQuery getChampionList() {
        return new GetChampionListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetChampionByIdQuery getChampionById(long championId) {
        return new GetChampionByIdQuery(riotWebApi, defaultParameter, championId);
    }

    @Override
    public GetChampionMasteryByChampionQuery getChampionMasteryByChampion(long playerId, long championId) {
        return new GetChampionMasteryByChampionQuery(riotWebApi, defaultParameter, playerId, championId);
    }

    @Override
    public GetChampionMasteryQuery getChampionMastery(long playerId) {
        return new GetChampionMasteryQuery(riotWebApi, defaultParameter, playerId);
    }

    @Override
    public GetPlayerScore getPlayerScore(long playerId) {
        return new GetPlayerScore(riotWebApi, defaultParameter, playerId);
    }

    @Override
    public GetTopChampion getTopChampion(long playerId) {
        return new GetTopChampion(riotWebApi, defaultParameter, playerId);
    }

    @Override
    public GetCurrentGameInfoQuery getCurrentGameInfo(long summonerId) {
        return new GetCurrentGameInfoQuery(riotWebApi, defaultParameter, summonerId);
    }

    @Override
    public GetFeaturedGameQuery getFeatureGame() {
        return new GetFeaturedGameQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetRecentGameQuery getRecentGame(long summonerId) {
        return new GetRecentGameQuery(riotWebApi, defaultParameter, summonerId);
    }

    @Override
    public GetLeaguesBySummonerIdsQuery getLeaguesBySummonerIds(long... summonerIds) {
        return new GetLeaguesBySummonerIdsQuery(riotWebApi, defaultParameter, summonerIds);
    }

    @Override
    public GetLeaguesEntryBySummonerIdsQuery getLeaguesEntryBySummonerIds(long... summonerIds) {
        return new GetLeaguesEntryBySummonerIdsQuery(riotWebApi, defaultParameter, summonerIds);
    }

    @Override
    public GetLeaguesByTeamIdsQuery getLeaguesByTeamIds(String... teamIds) {
        return new GetLeaguesByTeamIdsQuery(riotWebApi, defaultParameter, teamIds);
    }

    @Override
    public GetLeaguesEntryByTeamIdsQuery getLeaguesEntryByTeamIds(String... teamIds) {
        return new GetLeaguesEntryByTeamIdsQuery(riotWebApi, defaultParameter, teamIds);
    }

    @Override
    public GetChallengerQuery getChallenger(LeagueQueueType rankedQueueType) {
        return new GetChallengerQuery(riotWebApi, defaultParameter, rankedQueueType);
    }

    @Override
    public GetMasterQuery getMaster(LeagueQueueType rankedQueueType) {
        return new GetMasterQuery(riotWebApi, defaultParameter, rankedQueueType);
    }

    @Override
    public GetChampionDataListQuery getChampionDataList() {
        return new GetChampionDataListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetChampionDataByIdQuery getChampionDataById(long championId) {
        return new GetChampionDataByIdQuery(riotWebApi, defaultParameter, championId);
    }

    @Override
    public GetItemListQuery getItemList() {
        return new GetItemListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetItemByIdQuery getItemById(long itemId) {
        return new GetItemByIdQuery(riotWebApi, defaultParameter, itemId);
    }

    @Override
    public GetLanguageStringQuery getLanguageString() {
        return new GetLanguageStringQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetLanguageQuery getLanguage() {
        return new GetLanguageQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetMapQuery getMap() {
        return new GetMapQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetMasteryListQuery getMasteryList() {
        return new GetMasteryListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetMasteryByIdQuery getMasteryById(long masteryId) {
        return new GetMasteryByIdQuery(riotWebApi, defaultParameter, masteryId);
    }

    @Override
    public GetRealmQuery getRealm() {
        return new GetRealmQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetRuneListQuery getRuneList() {
        return new GetRuneListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetRuneByIdQuery getRuneById(long runeId) {
        return new GetRuneByIdQuery(riotWebApi, defaultParameter, runeId);
    }

    @Override
    public GetSummonerSpellListQuery getSummonerSpellList() {
        return new GetSummonerSpellListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetSummonerSpellByIdQuery getSummonerSpellById(long summonerSpellId) {
        return new GetSummonerSpellByIdQuery(riotWebApi, defaultParameter, summonerSpellId);
    }

    @Override
    public GetVersionListQuery getVersionList() {
        return new GetVersionListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetShardListQuery getShardList() {
        return new GetShardListQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetShardStatusQuery getShardStatus() {
        return new GetShardStatusQuery(riotWebApi, defaultParameter);
    }

    @Override
    public GetMatchIdListByTournamentCodeQuery getMatchIdByTournamentCodeList(String tournamentCode) {
        return new GetMatchIdListByTournamentCodeQuery(riotWebApi, defaultParameter, tournamentCode);
    }

    @Override
    public GetTournamentMatchDetailByIdQuery getTournamentMatchDetailById(long tournamentMatchId) {
        return new GetTournamentMatchDetailByIdQuery(riotWebApi, defaultParameter, tournamentMatchId);
    }

    @Override
    public GetMatchDetailByIdQuery getMatchDetailById(long matchId) {
        return new GetMatchDetailByIdQuery(riotWebApi, defaultParameter, matchId);
    }

    @Override
    public GetMatchListBySummonerIdQuery getMatchListBySummonerId(long summonerId) {
        return new GetMatchListBySummonerIdQuery(riotWebApi, defaultParameter, summonerId);
    }

    @Override
    public GetRankedStatsQuery getRankedStats(long summonerId) {
        return new GetRankedStatsQuery(riotWebApi, defaultParameter, summonerId);
    }

    @Override
    public GetPlayerStatsSummaryQuery getPlayerStatsSummary(long playerId) {
        return new GetPlayerStatsSummaryQuery(riotWebApi, defaultParameter, playerId);
    }

    @Override
    public GetSummonersByNamesQuery getSummonerByNames(String... playerNames) {
        return new GetSummonersByNamesQuery(riotWebApi, defaultParameter, playerNames);
    }

    @Override
    public GetSummonersByIdsQuery getSummonersByIds(long... playerIds) {
        return new GetSummonersByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    @Override
    public GetSummonersMasteriesByIdsQuery getSummonersMasteriesByIds(long... playerIds) {
        return new GetSummonersMasteriesByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    @Override
    public GetSummonersNameByIdsQuery getSummonersNameByIds(long... playerIds) {
        return new GetSummonersNameByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    @Override
    public GetSummonersRunesByIdsQuery getSummonersRunesByIds(long... playerIds) {
        return new GetSummonersRunesByIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    @Override
    public GetTeamsBySummonerIdsQuery getTeamsBySummonerIds(long... playerIds) {
        return new GetTeamsBySummonerIdsQuery(riotWebApi, defaultParameter, playerIds);
    }

    @Override
    public GetTeamsByTeamIdsQuery getTeamsByTeamIds(String... playerIds) {
        return new GetTeamsByTeamIdsQuery(riotWebApi, defaultParameter, playerIds);
    }
}
