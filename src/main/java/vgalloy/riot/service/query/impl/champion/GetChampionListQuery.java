package vgalloy.riot.service.query.impl.champion;

import vgalloy.riot.api.champion.dto.ChampionListDto;
import vgalloy.riot.api.constant.Region;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public class GetChampionListQuery extends AbstractQuery<ChampionListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetChampionListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public ChampionListDto execute() {
        Region region = getParameter(this.region, defaultParameter.getRegion(), "Region undefined");
        return riotWebApi.getChampionList(region, getRiotApiKeyValue());
    }

    /**
     * Set the region for this request.
     *
     * @param region the riot api key
     * @return the current query
     */
    public GetChampionListQuery region(Region region) {
        this.region = region;
        return this;
    }
}
