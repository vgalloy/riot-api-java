package com.vgalloy.riot.api.api.query.impl.summoner;

import java.util.Map;

import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetSummonersNameByIdsQuery extends AbstractQuery<GetSummonersNameByIdsQuery, Map<String, String>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetSummonersNameByIdsQuery addSummonerIds(long... summonerIds);
}
