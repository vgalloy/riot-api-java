package vgalloy.riot.api.service.query.impl.champion;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.champion.dto.ChampionListDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public class GetChampionListQuery extends AbstractQuery<ChampionListDto> {

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
        return riotWebApi.getChampionList(getRegion(), freeToPlay, getRiotApiKeyValue());
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
