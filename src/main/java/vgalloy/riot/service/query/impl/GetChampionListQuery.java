package vgalloy.riot.service.query.impl;

import vgalloy.riot.api.dto.ChampionListDto;
import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.service.RiotApiKey;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public class GetChampionListQuery extends AbstractQuery<ChampionListDto> {

    private Region region;

    /**
     * Constructor.
     *
     * @param defaultParameter the default query parameter
     */
    public GetChampionListQuery(DefaultParameter defaultParameter) {
        super(defaultParameter);
    }

    @Override
    public ChampionListDto execute() {
        Region region = getParameter(this.region, defaultParameter.getRegion(), "Region undefined");
        RiotApiKey riotApiKey = getParameter(this.riotApiKey, defaultParameter.getRiotApiKey(), "Riot api key undefined");
        return riotWebApi.getChampionList(region, riotApiKey.getApiKey());
    }

    /**
     * Set the region for this request.
     *
     * @param region the riot api key
     * @return the current query
     */
    public GetChampionListQuery setRegion(Region region) {
        this.region = region;
        return this;
    }
}
