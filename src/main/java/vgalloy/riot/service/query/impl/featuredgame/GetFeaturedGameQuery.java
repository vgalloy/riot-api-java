package vgalloy.riot.service.query.impl.featuredgame;

import vgalloy.riot.api.request.featuredgame.dto.FeaturedGames;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetFeaturedGameQuery extends AbstractQuery<FeaturedGames> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetFeaturedGameQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public FeaturedGames executeWithError() {
        return riotWebApi.getFeaturedGame(getRegion(), getRiotApiKeyValue());
    }
}
