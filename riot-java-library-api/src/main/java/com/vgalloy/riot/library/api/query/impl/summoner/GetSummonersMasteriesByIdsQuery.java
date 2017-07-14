package com.vgalloy.riot.library.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.library.api.dto.summoner.MasteryPagesDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersMasteriesByIdsQuery extends Query<Map<String, MasteryPagesDto>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetSummonersMasteriesByIdsQuery addSummonerIds(long... summonerIds);
}
