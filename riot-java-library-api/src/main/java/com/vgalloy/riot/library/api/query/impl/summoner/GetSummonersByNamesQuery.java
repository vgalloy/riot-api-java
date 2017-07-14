package com.vgalloy.riot.library.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.library.api.dto.summoner.SummonerDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersByNamesQuery extends Query<Map<String, SummonerDto>> {

    /**
     * Add summoner names.
     *
     * @param summonerNames the summoner names
     * @return this
     */
    GetSummonersByNamesQuery addSummonerNames(String... summonerNames);
}
