package vgalloy.riot.api.service.query.impl.game;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.game.dto.RecentGamesDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

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
        return riotWebApi.getRecentGame(getRegion(), summonerId, getRiotApiKeyValue());
    }
}
