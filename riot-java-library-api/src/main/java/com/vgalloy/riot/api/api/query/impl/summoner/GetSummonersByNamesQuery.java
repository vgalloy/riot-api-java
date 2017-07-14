package com.vgalloy.riot.api.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.api.api.dto.summoner.SummonerDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersByNamesQuery extends AbstractQuery<GetSummonersByNamesQuery, Map<String, SummonerDto>> {

    /**
     * Add summoner names.
     *
     * @param summonerNames the summoner names
     * @return this
     */
    GetSummonersByNamesQuery addSummonerNames(String... summonerNames);
}
