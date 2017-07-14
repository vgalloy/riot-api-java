package com.vgalloy.riot.api.internal.query.impl.champion;

import java.util.Objects;

import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.dto.champion.ChampionDto;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.library.api.query.impl.champion.GetChampionByIdQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 21/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionByIdQueryImpl implements GetChampionByIdQuery {

    private final RiotWebApi riotWebApi;
    private final RiotApiKey riotApiKey;
    private final Region region;
    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi the riot web rest for execute query
     * @param riotApiKey the riot api key
     * @param region     the region of query execution
     * @param championId the champion id
     */
    public GetChampionByIdQueryImpl(RiotWebApi riotWebApi, RiotApiKey riotApiKey, Region region, long championId) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);
        this.riotApiKey = Objects.requireNonNull(riotApiKey);
        this.region = Objects.requireNonNull(region);
        this.championId = championId;
    }

    @Override
    public ChampionDto execute() {
        return riotWebApi.getChampionById(SmallCaseRegion.of(region), championId, riotApiKey.getApiKey());
    }
}
