package vgalloy.riot.api.internal.client;

import vgalloy.riot.api.internal.rest.request.ChampionApi;
import vgalloy.riot.api.internal.rest.request.ChampionMastery;
import vgalloy.riot.api.internal.rest.request.CurrentGameApi;
import vgalloy.riot.api.internal.rest.request.FeaturedGameApi;
import vgalloy.riot.api.internal.rest.request.GameApi;
import vgalloy.riot.api.internal.rest.request.LeagueApi;
import vgalloy.riot.api.internal.rest.request.LolStaticDataApi;
import vgalloy.riot.api.internal.rest.request.LolStatusApi;
import vgalloy.riot.api.internal.rest.request.MatchApi;
import vgalloy.riot.api.internal.rest.request.MatchListApi;
import vgalloy.riot.api.internal.rest.request.StatsApi;
import vgalloy.riot.api.internal.rest.request.SummonerApi;
import vgalloy.riot.api.internal.rest.request.TeamApi;

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
