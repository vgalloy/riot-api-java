package com.vgalloy.riot.api.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.api.api.dto.summoner.RunePagesDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersRunesByIdsQuery extends AbstractQuery<GetSummonersRunesByIdsQuery, Map<String, RunePagesDto>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetSummonersRunesByIdsQuery addSummonerIds(long... summonerIds);
}
