package vgalloy.riot.api.client;

import vgalloy.riot.api.rest.request.champion.ChampionApi;
import vgalloy.riot.api.rest.request.championmastery.ChampionMastery;
import vgalloy.riot.api.rest.request.currentgame.CurrentGameApi;
import vgalloy.riot.api.rest.request.featuredgame.FeaturedGameApi;
import vgalloy.riot.api.rest.request.game.GameApi;
import vgalloy.riot.api.rest.request.league.LeagueApi;
import vgalloy.riot.api.rest.request.lolstaticdata.LolStaticDataApi;
import vgalloy.riot.api.rest.request.lolstatus.LolStatusApi;
import vgalloy.riot.api.rest.request.mach.MatchApi;
import vgalloy.riot.api.rest.request.matchlist.MatchListApi;
import vgalloy.riot.api.rest.request.stats.StatsApi;
import vgalloy.riot.api.rest.request.summoner.SummonerApi;
import vgalloy.riot.api.rest.request.team.TeamApi;

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
