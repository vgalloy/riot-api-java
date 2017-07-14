package com.vgalloy.riot.api.internal.query.impl.champion;

import java.util.Objects;

import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import com.vgalloy.riot.library.api.constant.Region;
import com.vgalloy.riot.library.api.dto.champion.ChampionListDto;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.library.api.query.impl.champion.GetChampionListQuery;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionListQueryImpl implements GetChampionListQuery {

    private final RiotWebApi riotWebApi;
    private final RiotApiKey riotApiKey;
    private final Region region;
    private final boolean freeToPlay;

    /**
     * Constructor.
     *
     * @param riotWebApi the riot web rest for execute query
     * @param riotApiKey the riot api key
     * @param region     the region of query execution
     */
    public GetChampionListQueryImpl(RiotWebApi riotWebApi, RiotApiKey riotApiKey, Region region, boolean freeToPlay) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);
        this.riotApiKey = Objects.requireNonNull(riotApiKey);
        this.region = Objects.requireNonNull(region);
        this.freeToPlay = Objects.requireNonNull(freeToPlay);
    }

    @Override
    public ChampionListDto execute() {
        return riotWebApi.getChampionList(SmallCaseRegion.of(region), freeToPlay, riotApiKey.getApiKey());
    }
}
