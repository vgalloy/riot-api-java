package vgalloy.riot.service.query.impl.league;

import vgalloy.riot.api.constant.QueueType;
import vgalloy.riot.api.request.league.dto.LeagueDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChallengerQuery extends AbstractQuery<LeagueDto> {

    private final QueueType queueType;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param queueType        the queue type
     */
    public GetChallengerQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, QueueType queueType) {
        super(riotWebApi, defaultParameter);
        this.queueType = Objects.requireNonNull(queueType, "queueType can not be null");
    }

    @Override
    public LeagueDto execute() {
        return riotWebApi.getChallenger(getRegion(), queueType, getRiotApiKeyValue());
    }
}
