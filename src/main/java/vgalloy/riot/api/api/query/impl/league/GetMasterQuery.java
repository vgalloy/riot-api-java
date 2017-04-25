package vgalloy.riot.api.api.query.impl.league;

import java.util.Objects;

import vgalloy.riot.api.api.constant.LeagueQueueType;
import vgalloy.riot.api.api.dto.league.LeagueDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.api.query.impl.league.helper.LeagueEntryDtoComparator;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetMasterQuery extends AbstractQuery<GetMasterQuery, LeagueDto> {

    private final LeagueQueueType rankedQueueType;
    private boolean sorted;

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
        LeagueDto leagueDto = riotWebApi.getMaster(SmallCaseRegion.of(getRegion()), rankedQueueType, getRiotApiKeyValue());
        if (sorted) {
            leagueDto.getEntries().sort(new LeagueEntryDtoComparator());
        }
        return leagueDto;
    }
}
