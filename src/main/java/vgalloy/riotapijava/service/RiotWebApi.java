package vgalloy.riotapijava.service;

import vgalloy.riotapijava.api.ChampionApi;
import vgalloy.riotapijava.api.ChampionMastery;
import vgalloy.riotapijava.api.CurrentGameApi;
import vgalloy.riotapijava.api.FeatureGameApi;
import vgalloy.riotapijava.api.GameApi;
import vgalloy.riotapijava.api.SummonerApi;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public interface RiotWebApi extends ChampionApi,
        ChampionMastery,
        CurrentGameApi,
        FeatureGameApi,
        GameApi,
        SummonerApi {

}
