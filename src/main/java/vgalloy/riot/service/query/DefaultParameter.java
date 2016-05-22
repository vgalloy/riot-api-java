package vgalloy.riot.service.query;

import vgalloy.riot.api.dto.constant.Region;
import vgalloy.riot.service.RiotApiKey;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public class DefaultParameter {

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
