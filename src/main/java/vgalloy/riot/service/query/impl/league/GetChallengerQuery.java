package vgalloy.riot.service.query.impl.league;

import java.util.Objects;

import vgalloy.riot.api.constant.RankedQueueType;
import vgalloy.riot.api.request.league.dto.LeagueDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChallengerQuery extends AbstractQuery<LeagueDto> {

    private final RankedQueueType rankedQueueType;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param rankedQueueType  the queue type
     */
    public GetChallengerQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, RankedQueueType rankedQueueType) {
        super(riotWebApi, defaultParameter);
        this.rankedQueueType = Objects.requireNonNull(rankedQueueType, "rankedQueueType can not be null");
    }

    @Override
    public LeagueDto executeWithError() {
        return riotWebApi.getChallenger(getRegion(), rankedQueueType, getRiotApiKeyValue());
    }
}
