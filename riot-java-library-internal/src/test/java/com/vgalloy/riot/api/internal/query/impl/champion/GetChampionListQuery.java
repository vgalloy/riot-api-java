package com.vgalloy.riot.api.internal.query.impl.champion;

import com.vgalloy.riot.api.api.dto.champion.ChampionListDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionListQuery extends AbstractQuery<GetChampionListQuery, ChampionListDto> {

    private boolean freeToPlay;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetChampionListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected ChampionListDto executeWithError() {
        return riotWebApi.getChampionList(SmallCaseRegion.of(getRegion()), freeToPlay, getRiotApiKeyValue());
    }

    /**
     * Only display free to play champions.
     *
     * @param freeToPlay free to play
     * @return this
     */
    public GetChampionListQuery freeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
        return this;
    }
}
