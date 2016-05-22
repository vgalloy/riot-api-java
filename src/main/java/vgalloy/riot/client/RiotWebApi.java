package vgalloy.riot.client;

import vgalloy.riot.api.rest.ChampionApi;
import vgalloy.riot.api.rest.ChampionMastery;
import vgalloy.riot.api.rest.CurrentGameApi;
import vgalloy.riot.api.rest.FeaturedGameApi;
import vgalloy.riot.api.rest.GameApi;
import vgalloy.riot.api.rest.LeagueApi;
import vgalloy.riot.api.rest.LolStaticDataApi;
import vgalloy.riot.api.rest.LolStatusApi;
import vgalloy.riot.api.rest.MatchApi;
import vgalloy.riot.api.rest.MatchListApi;
import vgalloy.riot.api.rest.StatsApi;
import vgalloy.riot.api.rest.SummonerApi;
import vgalloy.riot.api.rest.TeamApi;

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
