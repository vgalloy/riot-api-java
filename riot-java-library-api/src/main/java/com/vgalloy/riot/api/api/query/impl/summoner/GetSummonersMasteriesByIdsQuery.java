package com.vgalloy.riot.api.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.api.api.dto.summoner.MasteryPagesDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersMasteriesByIdsQuery extends AbstractQuery<GetSummonersMasteriesByIdsQuery, Map<String, MasteryPagesDto>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetSummonersMasteriesByIdsQuery addSummonerIds(long... summonerIds);
}
