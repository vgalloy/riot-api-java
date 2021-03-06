package vgalloy.riot.api.internal.query;

import vgalloy.riot.api.api.constant.Region;
import vgalloy.riot.api.api.model.RiotApiKey;

/**
 * Created by Vincent on 21/05/2016.
 *
 * @author Vincent Galloy
 */
public final class DefaultParameter {

    private RiotApiKey riotApiKey;
    private Region region;

    public RiotApiKey getRiotApiKey() {
        return riotApiKey;
    }

    public void setRiotApiKey(RiotApiKey riotApiKey) {
        this.riotApiKey = riotApiKey;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
