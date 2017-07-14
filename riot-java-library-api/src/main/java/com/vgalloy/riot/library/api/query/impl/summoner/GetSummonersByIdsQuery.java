package com.vgalloy.riot.library.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.library.api.dto.summoner.SummonerDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersByIdsQuery extends Query<Map<String, SummonerDto>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetSummonersByIdsQuery addSummonerIds(long... summonerIds);
}
