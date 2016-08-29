package vgalloy.riot.api.api.query.impl.championmastery;

import vgalloy.riot.api.api.dto.championmastery.ChampionMasteryDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChampionMasteryByChampionQuery extends AbstractQuery<GetChampionMasteryByChampionQuery, ChampionMasteryDto> {

    private final long playerId;
    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     * @param championId       the champion id
     */
    public GetChampionMasteryByChampionQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId, long championId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
        this.championId = championId;
    }

    @Override
    protected ChampionMasteryDto executeWithError() {
        return riotWebApi.getChampionMasteryByChampion(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, championId, getRiotApiKeyValue());
    }
}
