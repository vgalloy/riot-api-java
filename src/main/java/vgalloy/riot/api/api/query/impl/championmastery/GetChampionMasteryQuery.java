package vgalloy.riot.api.api.query.impl.championmastery;

import vgalloy.riot.api.api.dto.championmastery.ChampionMasteryDto;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.api.query.AbstractQuery;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChampionMasteryQuery extends AbstractQuery<GetChampionMasteryQuery, List<ChampionMasteryDto>> {

    private final long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetChampionMasteryQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
    }

    @Override
    protected List<ChampionMasteryDto> executeWithError() {
        return riotWebApi.getChampionMastery(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, getRiotApiKeyValue());
    }
}
