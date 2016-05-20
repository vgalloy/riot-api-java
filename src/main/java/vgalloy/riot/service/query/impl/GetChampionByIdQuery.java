package vgalloy.riot.service.query.impl;

import vgalloy.riot.api.dto.ChampionDto;
import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.service.RiotApiKey;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class GetChampionByIdQuery extends AbstractQuery<ChampionDto> {

    private Region region;
    private Long championId;

    /**
     * Constructor.
     *
     * @param defaultParameter the default query parameter
     * @param championId       the champion Id
     */
    public GetChampionByIdQuery(DefaultParameter defaultParameter, Long championId) {
        super(defaultParameter);
        this.championId = championId;
    }

    @Override
    public ChampionDto execute() {
        Region region = getParameter(this.region, defaultParameter.getRegion(), "Region undefined");
        Long championId = getParameter(this.championId, "Champion Id undefined");
        RiotApiKey riotApiKey = getParameter(this.riotApiKey, defaultParameter.getRiotApiKey(), "Riot api key undefined");
        return riotWebApi.getChampionById(region, championId, riotApiKey.getApiKey());
    }

    /**
     * Set the region for this request.
     *
     * @param region the riot api key
     * @return the current query
     */
    public GetChampionByIdQuery setRegion(Region region) {
        this.region = region;
        return this;
    }
}
