package com.vgalloy.riot.api.internal.client;

import com.vgalloy.riot.api.internal.rest.request.ChampionApi;
import com.vgalloy.riot.api.internal.rest.request.ChampionMastery;
import com.vgalloy.riot.api.internal.rest.request.CurrentGameApi;
import com.vgalloy.riot.api.internal.rest.request.FeaturedGameApi;
import com.vgalloy.riot.api.internal.rest.request.GameApi;
import com.vgalloy.riot.api.internal.rest.request.LeagueApi;
import com.vgalloy.riot.api.internal.rest.request.LolStaticDataApi;
import com.vgalloy.riot.api.internal.rest.request.LolStatusApi;
import com.vgalloy.riot.api.internal.rest.request.MatchApi;
import com.vgalloy.riot.api.internal.rest.request.MatchListApi;
import com.vgalloy.riot.api.internal.rest.request.StatsApi;
import com.vgalloy.riot.api.internal.rest.request.SummonerApi;
import com.vgalloy.riot.api.internal.rest.request.TeamApi;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
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
