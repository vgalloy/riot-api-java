package vgalloy.riot.api.api.query.impl.league;

import java.util.Objects;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.dto.league.LeagueDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetMasterQuery extends AbstractQuery<GetMasterQuery, LeagueDto> {

    private final LeagueQueueType rankedQueueType;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param rankedQueueType  the queue type
     */
    public GetMasterQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, LeagueQueueType rankedQueueType) {
        super(riotWebApi, defaultParameter);
        this.rankedQueueType = Objects.requireNonNull(rankedQueueType, "rankedQueueType can not be null");
    }

    @Override
    protected LeagueDto executeWithError() {
        return riotWebApi.getMaster(SmallCaseRegion.of(getRegion()), rankedQueueType, getRiotApiKeyValue());
    }
}
