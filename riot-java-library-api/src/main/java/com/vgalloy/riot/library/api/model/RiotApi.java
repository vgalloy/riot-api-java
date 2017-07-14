package com.vgalloy.riot.library.api.model;

import java.util.List;
import java.util.Map;

import com.vgalloy.riot.library.api.constant.LeagueQueueType;
import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.dto.champion.ChampionDto;
import com.vgalloy.riot.library.api.dto.champion.ChampionListDto;
import com.vgalloy.riot.library.api.dto.championmastery.ChampionMasteryDto;
import com.vgalloy.riot.library.api.dto.currentgame.CurrentGameInfo;
import com.vgalloy.riot.library.api.dto.featuredgame.FeaturedGames;
import com.vgalloy.riot.library.api.dto.game.RecentGamesDto;
import com.vgalloy.riot.library.api.dto.league.LeagueDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ChampionStaticDataDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ChampionStaticDataListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ItemDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.ItemListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.LanguageStringsDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.MapDataDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.MasteryDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.MasteryListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.RealmDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.RuneDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.RuneListDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.SummonerSpellDto;
import com.vgalloy.riot.library.api.dto.lolstaticdata.SummonerSpellListDto;
import com.vgalloy.riot.library.api.dto.lolstatus.Shard;
import com.vgalloy.riot.library.api.dto.lolstatus.ShardStatus;
import com.vgalloy.riot.library.api.dto.mach.MatchDetail;
import com.vgalloy.riot.library.api.dto.matchlist.MatchList;
import com.vgalloy.riot.library.api.dto.stats.PlayerStatsSummaryListDto;
import com.vgalloy.riot.library.api.dto.stats.RankedStatsDto;
import com.vgalloy.riot.library.api.dto.summoner.MasteryPagesDto;
import com.vgalloy.riot.library.api.dto.summoner.RunePagesDto;
import com.vgalloy.riot.library.api.dto.summoner.SummonerDto;
import com.vgalloy.riot.library.api.dto.team.TeamDto;

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
     * @param region     the region of request execution
     * @param freeToPlay champion free to play or not
     * @return the query
     */
    ChampionListDto getChampionList(Region region, boolean freeToPlay);

    /**
     * Create the query for champion by id.
     *
     * @param region     the region of request execution
     * @param championId the champion id
     * @return the query
     */
    ChampionDto getChampionById(Region region, long championId);

    /**
     * Create the query for champion mastery by champion.
     *
     * @param region     the region of request execution
     * @param playerId   the player id
     * @param championId the champion id
     * @return the query
     */
    ChampionMasteryDto getChampionMasteryByChampion(Region region, long playerId, long championId);

    /**
     * Create the query for champion mastery.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    List<ChampionMasteryDto> getChampionMastery(Region region, long playerId);

    /**
     * Create the query for player score.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    Integer getPlayerScore(Region region, long playerId);

    /**
     * Create the query for top champion.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @param count    the number of mastery
     * @return the query
     */
    List<ChampionMasteryDto> getTopChampion(Region region, long playerId, int count);

    /**
     * Create the query for current game.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    CurrentGameInfo getCurrentGameInfo(Region region, long summonerId);

    /**
     * Create the query for feature game.
     *
     * @param region the region of request execution
     * @return the query
     */
    FeaturedGames getFeaturedGame(Region region);

    /**
     * Create the query for recent game.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    RecentGamesDto getRecentGame(Region region, long summonerId);

    /**
     * Create the query for summoner leagues.
     *
     * @param region      the region of request execution
     * @param summonerIds the summoner ids
     * @return the query
     */
    Map<String, List<LeagueDto>> getLeaguesBySummonerIds(Region region, long... summonerIds);

    /**
     * Create the query for summoner league entries.
     *
     * @param region      the region of request execution
     * @param summonerIds the summoner ids
     * @return the query
     */
    Map<String, List<LeagueDto>> getLeaguesEntryBySummonerIds(Region region, long... summonerIds);

    /**
     * Create the query for team leagues.
     *
     * @param region  the region of request execution
     * @param teamIds the team ids
     * @return the query
     * @deprecated Riot seems not support this api any longer.
     */
    @Deprecated
    Map<String, List<LeagueDto>> getLeaguesByTeamIds(Region region, String... teamIds);

    /**
     * Create the query for team league entries.
     *
     * @param region  the region of request execution
     * @param teamIds the team ids
     * @return the query
     * @deprecated Riot seems not support this api any longer.
     */
    @Deprecated
    Map<String, List<LeagueDto>> getLeaguesEntryByTeamIds(Region region, String... teamIds);

    /**
     * Create the query for challenger.
     *
     * @param region          the region of request execution
     * @param rankedQueueType queue type
     * @return the query
     */
    LeagueDto getChallenger(Region region, LeagueQueueType rankedQueueType);

    /**
     * Create the query for master.
     *
     * @param region          the region of request execution
     * @param rankedQueueType queue type
     * @return the query
     */
    LeagueDto getMaster(Region region, LeagueQueueType rankedQueueType);

    /**
     * Create the query for champion data list.
     *
     * @param region the region of request execution
     * @return the query
     */
    ChampionStaticDataListDto getChampionDataList(Region region);

    /**
     * Create the query for champion data by id.
     *
     * @param region     the region of request execution
     * @param championId the champion id
     * @return the query
     */
    ChampionStaticDataDto getChampionDataById(Region region, long championId);

    /**
     * Create the query for item list.
     *
     * @param region the region of request execution
     * @return the query
     */
    ItemListDto getItemList(Region region);

    /**
     * Create the query for item by id.
     *
     * @param region the region of request execution
     * @param itemId the item id
     * @return the query
     */
    ItemDto getItemById(Region region, long itemId);

    /**
     * Create the query for language string.
     *
     * @param region the region of request execution
     * @return the query
     */
    LanguageStringsDto getLanguageString(Region region);

    /**
     * Create the query for language.
     *
     * @param region the region of request execution
     * @return the query
     */
    List<String> getLanguage(Region region);

    /**
     * Create the query for map.
     *
     * @param region the region of request execution
     * @return the query
     */
    MapDataDto getMap(Region region);

    /**
     * Create the query for mastery list.
     *
     * @param region the region of request execution
     * @return the query
     */
    MasteryListDto getMasteryList(Region region);

    /**
     * Create the query for mastery by id.
     *
     * @param region    the region of request execution
     * @param masteryId the mastery id
     * @return the query
     */
    MasteryDto getMasteryById(Region region, long masteryId);

    /**
     * Create the query for realm.
     *
     * @param region the region of request execution
     * @return the query
     */
    RealmDto getRealm(Region region);

    /**
     * Create the query for rune list.
     *
     * @param region the region of request execution
     * @return the query
     */
    RuneListDto getRuneList(Region region);

    /**
     * Create the query for rune by id.
     *
     * @param region the region of request execution
     * @param runeId the rune id
     * @return the query
     */
    RuneDto getRuneById(Region region, long runeId);

    /**
     * Create the query for summoner spell list.
     *
     * @param region the region of request execution
     * @return the query
     */
    SummonerSpellListDto getSummonerSpellList(Region region);

    /**
     * Create the query for summoner spell by id.
     *
     * @param region          the region of request execution
     * @param summonerSpellId the summoner spell id
     * @return the query
     */
    SummonerSpellDto getSummonerSpellById(Region region, long summonerSpellId);

    /**
     * Create the query for version list.
     *
     * @param region the region of request execution
     * @return the query
     */
    List<String> getVersionList(Region region);

    /**
     * Create the query for shard list.
     *
     * @return the query
     */
    List<Shard> getShardList();

    /**
     * Create the query for shard status.
     *
     * @param region the region of request execution
     * @return the query
     */
    ShardStatus getShardStatus(Region region);

    /**
     * Create the query for match id list.
     *
     * @param region         the region of request execution
     * @param tournamentCode the tournament code
     * @return the query
     */
    List<Long> getMatchIdByTournamentCodeList(Region region, String tournamentCode);

    /**
     * Create the query for shard list.
     *
     * @param region            the region of request execution
     * @param tournamentMatchId the tournament match id
     * @return the query
     */
    MatchDetail getTournamentMatchDetailById(Region region, long tournamentMatchId);

    /**
     * Create the query for shard status.
     *
     * @param region  the region of request execution
     * @param matchId the matchId
     *                @param
     * @return the query
     */
    MatchDetail getMatchDetailById(Region region, long matchId, boolean includeTimeline);

    /**
     * Create the query for match list by summoner.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    MatchList getMatchListBySummonerId(Region region, long summonerId);

    /**
     * Create the query for summoner ranked stats.
     *
     * @param region     the region of request execution
     * @param summonerId the summoner id
     * @return the query
     */
    RankedStatsDto getRankedStats(Region region, long summonerId);

    /**
     * Create the query for player stats summary.
     *
     * @param region   the region of request execution
     * @param playerId the player id
     * @return the query
     */
    PlayerStatsSummaryListDto getPlayerStatsSummary(Region region, long playerId);

    /**
     * Create the query for summoner by name.
     *
     * @param region      the region of request execution
     * @param playerNames the player names
     * @return the query
     */
    Map<String, SummonerDto> getSummonerByNames(Region region, String... playerNames);

    /**
     * Create the query for summoner by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    Map<String, SummonerDto> getSummonersByIds(Region region, long... playerIds);

    /**
     * Create the query for summoner masteries by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    Map<String, MasteryPagesDto> getSummonersMasteriesByIds(Region region, long... playerIds);

    /**
     * Create the query for player summoner name by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    Map<String, String> getSummonersNameByIds(Region region, long... playerIds);

    /**
     * Create the query for summoner runes by ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    Map<String, RunePagesDto> getSummonersRunesByIds(Region region, long... playerIds);

    /**
     * Create the query for teams by summoner ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    Map<String, List<TeamDto>> getTeamsBySummonerIds(Region region, long... playerIds);

    /**
     * Create the query for teams by team ids.
     *
     * @param region    the region of request execution
     * @param playerIds the player ids
     * @return the query
     */
    Map<String, TeamDto> getTeamsByTeamIds(Region region, String... playerIds);
}
