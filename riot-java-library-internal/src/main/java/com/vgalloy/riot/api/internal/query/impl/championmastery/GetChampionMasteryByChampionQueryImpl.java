package com.vgalloy.riot.api.internal.query.impl.championmastery;

import java.util.Objects;

import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import com.vgalloy.riot.api.internal.service.mapper.RegionMapper;
import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.dto.championmastery.ChampionMasteryDto;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.library.api.query.impl.championmastery.GetChampionMasteryByChampionQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetChampionMasteryByChampionQueryImpl implements GetChampionMasteryByChampionQuery {

    private final RiotWebApi riotWebApi;
    private final RiotApiKey riotApiKey;
    private final Region region;
    private final long playerId;
    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi the riot web rest for execute query
     * @param riotApiKey the riot api key
     * @param region     the region of query execution
     */
    public GetChampionMasteryByChampionQueryImpl(RiotWebApi riotWebApi, RiotApiKey riotApiKey, Region region, long playerId, long championId) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);
        this.riotApiKey = Objects.requireNonNull(riotApiKey);
        this.region = Objects.requireNonNull(region);
        this.playerId = Objects.requireNonNull(playerId);
        this.championId = Objects.requireNonNull(championId);
    }

    @Override
    public ChampionMasteryDto execute() {
        return riotWebApi.getChampionMasteryByChampion(SmallCaseRegion.of(region), RegionMapper.fromRegion(region), playerId, championId, riotApiKey.getApiKey());
    }
}
