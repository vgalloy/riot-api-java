package vgalloy.riot.api.api.query.impl.champion;

import vgalloy.riot.api.api.dto.champion.ChampionListDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
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
