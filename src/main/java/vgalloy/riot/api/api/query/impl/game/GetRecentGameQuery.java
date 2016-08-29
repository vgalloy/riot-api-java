package vgalloy.riot.api.api.query.impl.game;

import vgalloy.riot.api.api.dto.game.RecentGamesDto;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.api.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetRecentGameQuery extends AbstractQuery<GetRecentGameQuery, RecentGamesDto> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetRecentGameQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected RecentGamesDto executeWithError() {
        return riotWebApi.getRecentGame(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
