package vgalloy.riot.client;

import vgalloy.riot.api.rest.ChampionApi;
import vgalloy.riot.api.rest.ChampionMastery;
import vgalloy.riot.api.rest.CurrentGameApi;
import vgalloy.riot.api.rest.FeatureGameApi;
import vgalloy.riot.api.rest.GameApi;
import vgalloy.riot.api.rest.LeagueApi;
import vgalloy.riot.api.rest.SummonerApi;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface RiotWebApi extends ChampionApi,
        ChampionMastery,
        CurrentGameApi,
        FeatureGameApi,
        GameApi,
        LeagueApi,
        SummonerApi {

}
