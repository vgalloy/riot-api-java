package com.vgalloy.riot.library.api.model;

import com.vgalloy.riot.library.api.constant.LeagueQueueType;
import com.vgalloy.riot.library.api.query.impl.champion.GetChampionByIdQuery;
import com.vgalloy.riot.library.api.query.impl.champion.GetChampionListQuery;
import com.vgalloy.riot.library.api.query.impl.championmastery.GetChampionMasteryByChampionQuery;
import com.vgalloy.riot.library.api.query.impl.championmastery.GetChampionMasteryQuery;
import com.vgalloy.riot.library.api.query.impl.championmastery.GetPlayerScore;
import com.vgalloy.riot.library.api.query.impl.championmastery.GetTopChampion;
import com.vgalloy.riot.library.api.query.impl.currentgame.GetCurrentGameInfoQuery;
import com.vgalloy.riot.library.api.query.impl.featuredgame.GetFeaturedGameQuery;
import com.vgalloy.riot.library.api.query.impl.game.GetRecentGameQuery;
import com.vgalloy.riot.library.api.query.impl.league.GetChallengerQuery;
import com.vgalloy.riot.library.api.query.impl.league.GetLeaguesBySummonerIdsQuery;
import com.vgalloy.riot.library.api.query.impl.league.GetLeaguesByTeamIdsQuery;
import com.vgalloy.riot.library.api.query.impl.league.GetLeaguesEntryBySummonerIdsQuery;
import com.vgalloy.riot.library.api.query.impl.league.GetLeaguesEntryByTeamIdsQuery;
import com.vgalloy.riot.library.api.query.impl.league.GetMasterQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetChampionDataByIdQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetChampionDataListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetItemByIdQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetItemListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetLanguageQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetLanguageStringQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetMapQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetMasteryByIdQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetMasteryListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetRealmQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetRuneByIdQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetRuneListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetSummonerSpellByIdQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetSummonerSpellListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetVersionListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstatus.GetShardListQuery;
import com.vgalloy.riot.library.api.query.impl.lolstatus.GetShardStatusQuery;
import com.vgalloy.riot.library.api.query.impl.match.GetMatchDetailByIdQuery;
import com.vgalloy.riot.library.api.query.impl.match.GetMatchIdListByTournamentCodeQuery;
import com.vgalloy.riot.library.api.query.impl.match.GetTournamentMatchDetailByIdQuery;
import com.vgalloy.riot.library.api.query.impl.matchlist.GetMatchListBySummonerIdQuery;
import com.vgalloy.riot.library.api.query.impl.stats.GetPlayerStatsSummaryQuery;
import com.vgalloy.riot.library.api.query.impl.stats.GetRankedStatsQuery;
import com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersByIdsQuery;
import com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersByNamesQuery;
import com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersMasteriesByIdsQuery;
import com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersNameByIdsQuery;
import com.vgalloy.riot.library.api.query.impl.summoner.GetSummonersRunesByIdsQuery;
import com.vgalloy.riot.library.api.query.impl.team.GetTeamsBySummonerIdsQuery;
import com.vgalloy.riot.library.api.query.impl.team.GetTeamsByTeamIdsQuery;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public interface RiotApi {

    /**
     * Create a Riot api.
     *
     * @param riotApiKey    the riot api key
     * @param riotRateLimit the rate limits
     * @return a new riot api
     */
    static RiotApi newRiotApi(RiotApiKey riotApiKey, RiotRateLimit... riotRateLimit) {
        return RiotApiBuilderLoader.INSTANCE.load().newRiotApi(riotApiKey, riotRateLimit);
    }

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
    GetChallengerQuery getChallenger(LeagueQueueType rankedQueueType);

    /**
     * Create the query for master.
     *
     * @param rankedQueueType queue type
     * @return the query
     */
    GetMasterQuery getMaster(LeagueQueueType rankedQueueType);

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
