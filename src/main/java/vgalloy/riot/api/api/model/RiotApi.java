package vgalloy.riot.api.api.model;

import vgalloy.riot.api.api.constant.RankedQueueType;
import vgalloy.riot.api.api.constant.Region;
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

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public interface RiotApi {

    /**
     * Add a rate limit for all region.
     * If you create a new RateLimit(10, 1_000), each region will be able to do 10 request / sec at the same time.
     *
     * @param rateLimit the rate limit
     * @return this
     */
    RiotApi addGlobalRateLimit(RateLimit... rateLimit);

    /**
     * Add a rate limit for one region.
     *
     * @param region    the region
     * @param rateLimit the rate limit
     * @return this
     */
    RiotApi addRegionRateLimit(Region region, RateLimit... rateLimit);

    /**
     * Set the default riot rest key for all request.
     *
     * @param defaultRiotApiKey the riot rest key
     * @return this
     */
    RiotApi defaultRiotApiKey(RiotApiKey defaultRiotApiKey);

    /**
     * Set the default region for all request.
     *
     * @param defaultRegion the region
     * @return this
     */
    RiotApi defaultRegion(Region defaultRegion);

    /**
     * Create the query for champion list.
     *
     * @return the query
     */
    GetChampionListQuery getChampionList();

    /**
     * Create the query for champion by id.
     *
     * @param championId the champion id
     * @return the query
     */
    GetChampionByIdQuery getChampionById(long championId);

    /**
     * Create the query for champion mastery by champion.
     *
     * @param playerId   the player id
     * @param championId the champion id
     * @return the query
     */
    GetChampionMasteryByChampionQuery getChampionMasteryByChampion(long playerId, long championId);

    /**
     * Create the query for champion mastery.
     *
     * @param playerId the player id
     * @return the query
     */
    GetChampionMasteryQuery getChampionMastery(long playerId);

    /**
     * Create the query for player score.
     *
     * @param playerId the player id
     * @return the query
     */
    GetPlayerScore getPlayerScore(long playerId);

    /**
     * Create the query for top champion.
     *
     * @param playerId the player id
     * @return the query
     */
    GetTopChampion getTopChampion(long playerId);

    /**
     * Create the query for current game.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    GetCurrentGameInfoQuery getCurrentGameInfo(long summonerId);

    /**
     * Create the query for feature game.
     *
     * @return the query
     */
    GetFeaturedGameQuery getFeatureGame();

    /**
     * Create the query for recent game.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    GetRecentGameQuery getRecentGame(long summonerId);

    /**
     * Create the query for summoner leagues.
     *
     * @param summonerIds the summoner ids
     * @return the query
     */
    GetLeaguesBySummonerIdsQuery getLeaguesBySummonerIds(long... summonerIds);

    /**
     * Create the query for summoner league entries.
     *
     * @param summonerIds the summoner ids
     * @return the query
     */
    GetLeaguesEntryBySummonerIdsQuery getLeaguesEntryBySummonerIds(long... summonerIds);

    /**
     * Create the query for team leagues.
     *
     * @param teamIds the team ids
     * @return the query
     * @deprecated Riot seems not support this api any longer.
     */
    @Deprecated
    GetLeaguesByTeamIdsQuery getLeaguesByTeamIds(String... teamIds);

    /**
     * Create the query for team league entries.
     *
     * @param teamIds the team ids
     * @return the query
     * @deprecated Riot seems not support this api any longer.
     */
    @Deprecated
    GetLeaguesEntryByTeamIdsQuery getLeaguesEntryByTeamIds(String... teamIds);

    /**
     * Create the query for challenger.
     *
     * @param rankedQueueType queue type
     * @return the query
     */
    GetChallengerQuery getChallenger(RankedQueueType rankedQueueType);

    /**
     * Create the query for master.
     *
     * @param rankedQueueType queue type
     * @return the query
     */
    GetMasterQuery getMaster(RankedQueueType rankedQueueType);

    /**
     * Create the query for champion data list.
     *
     * @return the query
     */
    GetChampionDataListQuery getChampionDataList();

    /**
     * Create the query for champion data by id.
     *
     * @param championId the champion id
     * @return the query
     */
    GetChampionDataByIdQuery getChampionDataById(long championId);

    /**
     * Create the query for item list.
     *
     * @return the query
     */
    GetItemListQuery getItemList();

    /**
     * Create the query for item by id.
     *
     * @param itemId the item id
     * @return the query
     */
    GetItemByIdQuery getItemById(long itemId);

    /**
     * Create the query for language string.
     *
     * @return the query
     */
    GetLanguageStringQuery getLanguageString();

    /**
     * Create the query for language.
     *
     * @return the query
     */
    GetLanguageQuery getLanguage();

    /**
     * Create the query for map.
     *
     * @return the query
     */
    GetMapQuery getMap();

    /**
     * Create the query for mastery list.
     *
     * @return the query
     */
    GetMasteryListQuery getMasteryList();

    /**
     * Create the query for mastery by id.
     *
     * @param masteryId the mastery id
     * @return the query
     */
    GetMasteryByIdQuery getMasteryById(long masteryId);

    /**
     * Create the query for realm.
     *
     * @return the query
     */
    GetRealmQuery getRealm();

    /**
     * Create the query for rune list.
     *
     * @return the query
     */
    GetRuneListQuery getRuneList();

    /**
     * Create the query for rune by id.
     *
     * @param runeId the rune id
     * @return the query
     */
    GetRuneByIdQuery getRuneById(long runeId);

    /**
     * Create the query for summoner spell list.
     *
     * @return the query
     */
    GetSummonerSpellListQuery getSummonerSpellList();

    /**
     * Create the query for summoner spell by id.
     *
     * @param summonerSpellId the summoner spell id
     * @return the query
     */
    GetSummonerSpellByIdQuery getSummonerSpellById(long summonerSpellId);

    /**
     * Create the query for version list.
     *
     * @return the query
     */
    GetVersionListQuery getVersionList();

    /**
     * Create the query for shard list.
     *
     * @return the query
     */
    GetShardListQuery getShardList();

    /**
     * Create the query for shard status.
     *
     * @return the query
     */
    GetShardStatusQuery getShardStatus();

    /**
     * Create the query for match id list.
     *
     * @param tournamentCode the tournament code
     * @return the query
     */
    GetMatchIdListByTournamentCodeQuery getMatchIdByTournamentCodeList(String tournamentCode);

    /**
     * Create the query for shard list.
     *
     * @param tournamentMatchId the tournament match id
     * @return the query
     */
    GetTournamentMatchDetailByIdQuery getTournamentMatchDetailById(long tournamentMatchId);

    /**
     * Create the query for shard status.
     *
     * @param matchId the matchId
     * @return the query
     */
    GetMatchDetailByIdQuery getMatchDetailById(long matchId);

    /**
     * Create the query for match list by summoner.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    GetMatchListBySummonerIdQuery getMatchListBySummonerId(long summonerId);

    /**
     * Create the query for summoner ranked stats.
     *
     * @param summonerId the summoner id
     * @return the query
     */
    GetRankedStatsQuery getRankedStats(long summonerId);

    /**
     * Create the query for player stats summary.
     *
     * @param playerId the player id
     * @return the query
     */
    GetPlayerStatsSummaryQuery getPlayerStatsSummary(long playerId);

    /**
     * Create the query for summoner by name.
     *
     * @param playerNames the player names
     * @return the query
     */
    GetSummonersByNamesQuery getSummonerByNames(String... playerNames);

    /**
     * Create the query for summoner by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersByIdsQuery getSummonersByIds(long... playerIds);

    /**
     * Create the query for summoner masteries by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersMasteriesByIdsQuery getSummonersMasteriesByIds(long... playerIds);

    /**
     * Create the query for player summoner name by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersNameByIdsQuery getSummonersNameByIds(long... playerIds);

    /**
     * Create the query for summoner runes by ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersRunesByIdsQuery getSummonersRunesByIds(long... playerIds);

    /**
     * Create the query for teams by summoner ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    GetTeamsBySummonerIdsQuery getTeamsBySummonerIds(long... playerIds);

    /**
     * Create the query for teams by team ids.
     *
     * @param playerIds the player ids
     * @return the query
     */
    GetTeamsByTeamIdsQuery getTeamsByTeamIds(String... playerIds);
}
