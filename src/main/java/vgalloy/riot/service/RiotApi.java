package vgalloy.riot.service;

import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.service.query.DefaultParameter;
import vgalloy.riot.service.query.impl.GetChampionByIdQuery;
import vgalloy.riot.service.query.impl.GetChampionListQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016.
 */
public class RiotApi {

    private DefaultParameter defaultParameter = new DefaultParameter();

    /**
     * Create the query for champion list.
     *
     * @return the query
     */
    public GetChampionListQuery getChampionList() {
        return new GetChampionListQuery(defaultParameter);
    }

    /**
     * Create the query for champion by id.
     *
     * @param id the id of the champion
     * @return the query
     */
    public GetChampionByIdQuery getChampionById(long id) {
        return new GetChampionByIdQuery(defaultParameter, id);
    }

    /**
     * Set the default riot api key for all request.
     *
     * @param defaultRiotApiKey the riot api key
     */
    public void setDefaultRiotApiKey(RiotApiKey defaultRiotApiKey) {
        this.defaultParameter.setRiotApiKey(defaultRiotApiKey);
    }

    /**
     * Set the default region for all request.
     *
     * @param defaultRegion the region
     */
    public void setDefaultRegion(Region defaultRegion) {
        this.defaultParameter.setRegion(defaultRegion);
    }
}
