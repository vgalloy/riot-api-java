package com.vgalloy.riot.library.api.model;

import com.vgalloy.riot.library.api.constant.LeagueQueueType;
import com.vgalloy.riot.library.api.constant.Region;
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
     * @param region the region of request execution
     * @return the query
     */
    GetChampionListQuery getChampionList(Region region);

    /**
     * Create the query for champion by id.
     *
     * @param region     the region of request execution
     * @param championId the champion id
     * @return the query
     */
    GetChampionByIdQuery getChampionById(Region region, long championId);

    /**
     * Create the query for champion mastery by champion.
     *
     * @param region     the region of request execution
     * @param playerId   the player id
     * @param championId the champion id
     * @return the query
     */
    GetChampionMasteryByChampionQuery getChampionMasteryByChampion(Region region, long playerId, long championId);

    /**
     * Create the query for champion mastery.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    GetChampionMasteryQuery getChampionMastery(Region region, long playerId);

    /**
     * Create the query for player score.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    GetPlayerScore getPlayerScore(Region region, long playerId);

    /**
     * Create the query for top champion.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    GetTopChampion getTopChampion(Region region, long playerId);

    /**
     * Create the query for current game.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    GetCurrentGameInfoQuery getCurrentGameInfo(Region region, long summonerId);

    /**
     * Create the query for feature game.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetFeaturedGameQuery getFeatureGame(Region region);

    /**
     * Create the query for recent game.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    GetRecentGameQuery getRecentGame(Region region, long summonerId);

    /**
     * Create the query for summoner leagues.
     *
     * @param region      the region of request execution
     * @param summonerIds the summoner ids
     * @return the query
     */
    GetLeaguesBySummonerIdsQuery getLeaguesBySummonerIds(Region region, long... summonerIds);

    /**
     * Create the query for summoner league entries.
     *
     * @param region      the region of request execution
     * @param summonerIds the summoner ids
     * @return the query
     */
    GetLeaguesEntryBySummonerIdsQuery getLeaguesEntryBySummonerIds(Region region, long... summonerIds);

    /**
     * Create the query for team leagues.
     *
     * @param region  the region of request execution
     * @param teamIds the team ids
     * @return the query
     * @deprecated Riot seems not support this api any longer.
     */
    @Deprecated
    GetLeaguesByTeamIdsQuery getLeaguesByTeamIds(Region region, String... teamIds);

    /**
     * Create the query for team league entries.
     *
     * @param region  the region of request execution
     * @param teamIds the team ids
     * @return the query
     * @deprecated Riot seems not support this api any longer.
     */
    @Deprecated
    GetLeaguesEntryByTeamIdsQuery getLeaguesEntryByTeamIds(Region region, String... teamIds);

    /**
     * Create the query for challenger.
     *
     * @param region          the region of request execution
     * @param rankedQueueType queue type
     * @return the query
     */
    GetChallengerQuery getChallenger(Region region, LeagueQueueType rankedQueueType);

    /**
     * Create the query for master.
     *
     * @param region          the region of request execution
     * @param rankedQueueType queue type
     * @return the query
     */
    GetMasterQuery getMaster(Region region, LeagueQueueType rankedQueueType);

    /**
     * Create the query for champion data list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetChampionDataListQuery getChampionDataList(Region region);

    /**
     * Create the query for champion data by id.
     *
     * @param region     the region of request execution
     * @param championId the champion id
     * @return the query
     */
    GetChampionDataByIdQuery getChampionDataById(Region region, long championId);

    /**
     * Create the query for item list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetItemListQuery getItemList(Region region);

    /**
     * Create the query for item by id.
     *
     * @param region the region of request execution
     * @param itemId the item id
     * @return the query
     */
    GetItemByIdQuery getItemById(Region region, long itemId);

    /**
     * Create the query for language string.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetLanguageStringQuery getLanguageString(Region region);

    /**
     * Create the query for language.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetLanguageQuery getLanguage(Region region);

    /**
     * Create the query for map.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetMapQuery getMap(Region region);

    /**
     * Create the query for mastery list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetMasteryListQuery getMasteryList(Region region);

    /**
     * Create the query for mastery by id.
     *
     * @param region    the region of request execution
     * @param masteryId the mastery id
     * @return the query
     */
    GetMasteryByIdQuery getMasteryById(Region region, long masteryId);

    /**
     * Create the query for realm.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetRealmQuery getRealm(Region region);

    /**
     * Create the query for rune list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetRuneListQuery getRuneList(Region region);

    /**
     * Create the query for rune by id.
     *
     * @param region the region of request execution
     * @param runeId the rune id
     * @return the query
     */
    GetRuneByIdQuery getRuneById(Region region, long runeId);

    /**
     * Create the query for summoner spell list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetSummonerSpellListQuery getSummonerSpellList(Region region);

    /**
     * Create the query for summoner spell by id.
     *
     * @param region          the region of request execution
     * @param summonerSpellId the summoner spell id
     * @return the query
     */
    GetSummonerSpellByIdQuery getSummonerSpellById(Region region, long summonerSpellId);

    /**
     * Create the query for version list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetVersionListQuery getVersionList(Region region);

    /**
     * Create the query for shard list.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetShardListQuery getShardList(Region region);

    /**
     * Create the query for shard status.
     *
     * @param region the region of request execution
     * @return the query
     */
    GetShardStatusQuery getShardStatus(Region region);

    /**
     * Create the query for match id list.
     *
     * @param region         the region of request execution
     * @param tournamentCode the tournament code
     * @return the query
     */
    GetMatchIdListByTournamentCodeQuery getMatchIdByTournamentCodeList(Region region, String tournamentCode);

    /**
     * Create the query for shard list.
     *
     * @param region            the region of request execution
     * @param tournamentMatchId the tournament match id
     * @return the query
     */
    GetTournamentMatchDetailByIdQuery getTournamentMatchDetailById(Region region, long tournamentMatchId);

    /**
     * Create the query for shard status.
     *
     * @param region  the region of request execution
     * @param matchId the matchId
     * @return the query
     */
    GetMatchDetailByIdQuery getMatchDetailById(Region region, long matchId);

    /**
     * Create the query for match list by summoner.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    GetMatchListBySummonerIdQuery getMatchListBySummonerId(Region region, long summonerId);

    /**
     * Create the query for summoner ranked stats.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    GetRankedStatsQuery getRankedStats(Region region, long summonerId);

    /**
     * Create the query for player stats summary.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    GetPlayerStatsSummaryQuery getPlayerStatsSummary(Region region, long playerId);

    /**
     * Create the query for summoner by name.
     *
     * @param region      the region of request execution
     * @param playerNames the player names
     * @return the query
     */
    GetSummonersByNamesQuery getSummonerByNames(Region region, String... playerNames);

    /**
     * Create the query for summoner by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersByIdsQuery getSummonersByIds(Region region, long... playerIds);

    /**
     * Create the query for summoner masteries by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersMasteriesByIdsQuery getSummonersMasteriesByIds(Region region, long... playerIds);

    /**
     * Create the query for player summoner name by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersNameByIdsQuery getSummonersNameByIds(Region region, long... playerIds);

    /**
     * Create the query for summoner runes by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    GetSummonersRunesByIdsQuery getSummonersRunesByIds(Region region, long... playerIds);

    /**
     * Create the query for teams by summoner ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    GetTeamsBySummonerIdsQuery getTeamsBySummonerIds(Region region, long... playerIds);

    /**
     * Create the query for teams by team ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    GetTeamsByTeamIdsQuery getTeamsByTeamIds(Region region, String... playerIds);
}
