package vgalloy.riot.api.service.query.impl.league;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.constant.RankedQueueType;
import vgalloy.riot.api.rest.request.league.dto.LeagueDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.impl.league.helper.LeagueEntryDtoComparator;

import java.util.Collections;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetMasterQuery extends AbstractQuery<GetMasterQuery, LeagueDto> {

    private final RankedQueueType rankedQueueType;
    private boolean sorted;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param rankedQueueType  the queue type
     */
    public GetMasterQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, RankedQueueType rankedQueueType) {
        super(riotWebApi, defaultParameter);
        this.rankedQueueType = Objects.requireNonNull(rankedQueueType, "rankedQueueType can not be null");
    }

    /**
     * Have the list to be sorted  ? If yes the last summoner of the list will be the best
     *
     * @param sorted true if the list have to be sorted
     * @return this
     */
    public GetMasterQuery sorted(boolean sorted) {
        this.sorted = sorted;
        return this;
    }

    @Override
    protected LeagueDto executeWithError() {
        LeagueDto leagueDto = riotWebApi.getMaster(getRegion(), rankedQueueType, getRiotApiKeyValue());
        if (sorted) {
            Collections.sort(leagueDto.getEntries(), new LeagueEntryDtoComparator());
        }
        return leagueDto;
    }
}
