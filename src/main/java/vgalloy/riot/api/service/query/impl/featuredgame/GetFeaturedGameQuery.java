package vgalloy.riot.api.service.query.impl.featuredgame;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.featuredgame.dto.FeaturedGames;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetFeaturedGameQuery extends AbstractQuery<FeaturedGames> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetFeaturedGameQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected FeaturedGames executeWithError() {
        return riotWebApi.getFeaturedGame(getRegion(), getRiotApiKeyValue());
    }
}
