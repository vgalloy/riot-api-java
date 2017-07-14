package com.vgalloy.riot.api.internal.service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.client.RiotWebApiFactory;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimitManager;
import com.vgalloy.riot.api.internal.client.ratelimite.impl.RateLimitManagerImpl;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import com.vgalloy.riot.api.internal.service.mapper.HelperMapper;
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
import com.vgalloy.riot.library.api.model.RiotApi;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.library.api.model.RiotRateLimit;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public class RiotApiImpl implements RiotApi {

    private final RiotApiKey riotApiKey;
    private final RiotWebApi riotWebApi;

    /**
     * Constructor.
     */
    public RiotApiImpl(RiotApiKey riotApiKey, RiotRateLimit... riotRateLimits) {
        this.riotApiKey = Objects.requireNonNull(riotApiKey);
        Objects.requireNonNull(riotRateLimits);

        RateLimitManager rateLimitManager = new RateLimitManagerImpl();
        rateLimitManager.addRateLimit(riotRateLimits);

        riotWebApi = RiotWebApiFactory.getRiotWebApi(rateLimitManager);
    }

    @Override
    public ChampionListDto getChampionList(Region region, boolean freeToPlay) {
        return riotWebApi.getChampionList(SmallCaseRegion.of(region), freeToPlay, riotApiKey.getApiKey());
    }

    @Override
    public ChampionDto getChampionById(Region region, long championId) {
        return riotWebApi.getChampionById(SmallCaseRegion.of(region), championId, riotApiKey.getApiKey());
    }

    @Override
    public ChampionMasteryDto getChampionMasteryByChampion(Region region, long playerId, long championId) {
        return riotWebApi.getChampionMasteryByChampion(SmallCaseRegion.of(region), HelperMapper.toPlatformId(region), playerId, championId, riotApiKey.getApiKey());
    }

    @Override
    public List<ChampionMasteryDto> getChampionMastery(Region region, long playerId) {
        return riotWebApi.getChampionMastery(SmallCaseRegion.of(region), HelperMapper.toPlatformId(region), playerId, riotApiKey.getApiKey());
    }

    @Override
    public Integer getPlayerScore(Region region, long playerId) {
        return riotWebApi.getPlayerScore(SmallCaseRegion.of(region), HelperMapper.toPlatformId(region), playerId, riotApiKey.getApiKey());
    }

    @Override
    public List<ChampionMasteryDto> getTopChampion(Region region, long playerId, int count) {
        return riotWebApi.getTopChampion(SmallCaseRegion.of(region), HelperMapper.toPlatformId(region), playerId, count, riotApiKey.getApiKey());
    }

    @Override
    public CurrentGameInfo getCurrentGameInfo(Region region, long summonerId) {
        return riotWebApi.getCurrentGameInfo(SmallCaseRegion.of(region), HelperMapper.toPlatformId(region), summonerId, riotApiKey.getApiKey());
    }

    @Override
    public FeaturedGames getFeaturedGame(Region region) {
        return riotWebApi.getFeaturedGame(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public RecentGamesDto getRecentGame(Region region, long summonerId) {
        return riotWebApi.getRecentGame(SmallCaseRegion.of(region), summonerId, riotApiKey.getApiKey());
    }

    @Override
    public Map<String, List<LeagueDto>> getLeaguesBySummonerIds(Region region, long... summonerIds) {
        return riotWebApi.getLeaguesBySummonerIds(SmallCaseRegion.of(region), HelperMapper.convert(summonerIds), riotApiKey.getApiKey());
    }

    @Override
    public Map<String, List<LeagueDto>> getLeaguesEntryBySummonerIds(Region region, long... summonerIds) {
        return riotWebApi.getLeaguesBySummonerIds(SmallCaseRegion.of(region), HelperMapper.convert(summonerIds), riotApiKey.getApiKey());
    }

    @Override
    public Map<String, List<LeagueDto>> getLeaguesByTeamIds(Region region, String... teamIds) {
        return riotWebApi.getLeaguesByTeamIds(SmallCaseRegion.of(region), HelperMapper.convert(teamIds), riotApiKey.getApiKey());
    }

    @Override
    public Map<String, List<LeagueDto>> getLeaguesEntryByTeamIds(Region region, String... teamIds) {
        return riotWebApi.getLeaguesEntryByTeamIds(SmallCaseRegion.of(region), HelperMapper.convert(teamIds), riotApiKey.getApiKey());
    }

    @Override
    public LeagueDto getChallenger(Region region, LeagueQueueType rankedQueueType) {
        return riotWebApi.getChallenger(SmallCaseRegion.of(region), rankedQueueType, riotApiKey.getApiKey());
    }

    @Override
    public LeagueDto getMaster(Region region, LeagueQueueType rankedQueueType) {
        return riotWebApi.getMaster(SmallCaseRegion.of(region), rankedQueueType, riotApiKey.getApiKey());
    }

    @Override
    public ChampionStaticDataListDto getChampionDataList(Region region) {
        return riotWebApi.getChampionDataList(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public ChampionStaticDataDto getChampionDataById(Region region, long championId) {
        return riotWebApi.getChampionDataById(SmallCaseRegion.of(region), championId, riotApiKey.getApiKey());
    }

    @Override
    public ItemListDto getItemList(Region region) {
        return riotWebApi.getItemList(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public ItemDto getItemById(Region region, long itemId) {
        return riotWebApi.getItemById(SmallCaseRegion.of(region), itemId, riotApiKey.getApiKey());
    }

    @Override
    public LanguageStringsDto getLanguageString(Region region) {
        return riotWebApi.getLanguageString(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public List<String> getLanguage(Region region) {
        return riotWebApi.getLanguage(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public MapDataDto getMap(Region region) {
        return riotWebApi.getMap(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public MasteryListDto getMasteryList(Region region) {
        return riotWebApi.getMasteryList(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public MasteryDto getMasteryById(Region region, long masteryId) {
        return riotWebApi.getMasteryById(SmallCaseRegion.of(region), masteryId, riotApiKey.getApiKey());
    }

    @Override
    public RealmDto getRealm(Region region) {
        return riotWebApi.getRealm(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public RuneListDto getRuneList(Region region) {
        return riotWebApi.getRuneList(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public RuneDto getRuneById(Region region, long runeId) {
        return riotWebApi.getRuneById(SmallCaseRegion.of(region), runeId, riotApiKey.getApiKey());
    }

    @Override
    public SummonerSpellListDto getSummonerSpellList(Region region) {
        return riotWebApi.getSummonerSpellList(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public SummonerSpellDto getSummonerSpellById(Region region, long summonerSpellId) {
        return riotWebApi.getSummonerSpellById(SmallCaseRegion.of(region), summonerSpellId, riotApiKey.getApiKey());
    }

    @Override
    public List<String> getVersionList(Region region) {
        return riotWebApi.getVersionList(SmallCaseRegion.of(region), riotApiKey.getApiKey());
    }

    @Override
    public List<Shard> getShardList() {
        return riotWebApi.getShardList();
    }

    @Override
    public ShardStatus getShardStatus(Region region) {
        return riotWebApi.getShardStatus(SmallCaseRegion.of(region));
    }

    @Override
    public List<Long> getMatchIdByTournamentCodeList(Region region, String tournamentCode) {
        return riotWebApi.getMatchIdList(SmallCaseRegion.of(region), tournamentCode, riotApiKey.getApiKey());
    }

    @Override
    public MatchDetail getTournamentMatchDetailById(Region region, long tournamentMatchId) {
        return riotWebApi.getTournamentMatchDetailById(SmallCaseRegion.of(region), tournamentMatchId, riotApiKey.getApiKey());
    }

    @Override
    public MatchDetail getMatchDetailById(Region region, long matchId) {
        return riotWebApi.getMatchDetailById(SmallCaseRegion.of(region), matchId, riotApiKey.getApiKey());
    }

    @Override
    public MatchList getMatchListBySummonerId(Region region, long summonerId) {
        return null;
    }

    @Override
    public RankedStatsDto getRankedStats(Region region, long summonerId) {
        return null;
    }

    @Override
    public PlayerStatsSummaryListDto getPlayerStatsSummary(Region region, long playerId) {
        return null;
    }

    @Override
    public Map<String, SummonerDto> getSummonerByNames(Region region, String... playerNames) {
        return null;
    }

    @Override
    public Map<String, SummonerDto> getSummonersByIds(Region region, long... playerIds) {
        return null;
    }

    @Override
    public Map<String, MasteryPagesDto> getSummonersMasteriesByIds(Region region, long... playerIds) {
        return null;
    }

    @Override
    public Map<String, String> getSummonersNameByIds(Region region, long... playerIds) {
        return null;
    }

    @Override
    public Map<String, RunePagesDto> getSummonersRunesByIds(Region region, long... playerIds) {
        return null;
    }

    @Override
    public Map<String, List<TeamDto>> getTeamsBySummonerIds(Region region, long... playerIds) {
        return null;
    }

    @Override
    public Map<String, TeamDto> getTeamsByTeamIds(Region region, String... playerIds) {
        return null;
    }
}
