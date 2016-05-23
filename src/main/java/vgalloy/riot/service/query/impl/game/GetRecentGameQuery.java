package vgalloy.riot.service.query.impl.game;

import vgalloy.riot.api.game.dto.RecentGamesDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetRecentGameQuery extends AbstractQuery<RecentGamesDto> {

    private long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetRecentGameQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    public RecentGamesDto execute() {
        return riotWebApi.getRecentGame(getRegion(), String.valueOf(summonerId), getRiotApiKeyValue());
    }
}
