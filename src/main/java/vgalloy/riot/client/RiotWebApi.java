package vgalloy.riot.client;

import vgalloy.riot.api.request.champion.ChampionApi;
import vgalloy.riot.api.request.championmastery.ChampionMastery;
import vgalloy.riot.api.request.currentgame.CurrentGameApi;
import vgalloy.riot.api.request.featuredgame.FeaturedGameApi;
import vgalloy.riot.api.request.game.GameApi;
import vgalloy.riot.api.request.league.LeagueApi;
import vgalloy.riot.api.request.lolstaticdata.LolStaticDataApi;
import vgalloy.riot.api.request.lolstatus.LolStatusApi;
import vgalloy.riot.api.request.mach.MatchApi;
import vgalloy.riot.api.request.matchlist.MatchListApi;
import vgalloy.riot.api.request.stats.StatsApi;
import vgalloy.riot.api.request.summoner.SummonerApi;
import vgalloy.riot.api.request.team.TeamApi;

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
