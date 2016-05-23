package vgalloy.riot.client;

import vgalloy.riot.api.champion.ChampionApi;
import vgalloy.riot.api.championmastery.ChampionMastery;
import vgalloy.riot.api.currentgame.CurrentGameApi;
import vgalloy.riot.api.featuredgame.FeaturedGameApi;
import vgalloy.riot.api.game.GameApi;
import vgalloy.riot.api.league.LeagueApi;
import vgalloy.riot.api.lolstaticdata.LolStaticDataApi;
import vgalloy.riot.api.lolstatus.LolStatusApi;
import vgalloy.riot.api.mach.MatchApi;
import vgalloy.riot.api.matchlist.MatchListApi;
import vgalloy.riot.api.stats.StatsApi;
import vgalloy.riot.api.summoner.SummonerApi;
import vgalloy.riot.api.team.TeamApi;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface RiotWebApi extends ChampionApi,
        ChampionMastery,
        CurrentGameApi,
        FeaturedGameApi,
        GameApi,
        LeagueApi,
        LolStaticDataApi,
        LolStatusApi,
        MatchApi,
        MatchListApi,
        StatsApi,
        SummonerApi,
        TeamApi {

}
