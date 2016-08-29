package vgalloy.riot.api.internal.service.mapper;

import vgalloy.riot.api.api.constant.PlatformId;
import vgalloy.riot.api.api.constant.Region;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public final class RegionMapper {

    /**
     * Constructor.
     * To prevent instantiation
     */
    private RegionMapper() {
        throw new AssertionError();
    }

    /**
     * Converter.
     *
     * @param region the region
     * @return the platform Id
     */
    public static PlatformId fromRegion(Region region) {
        switch (region) {
            case BR:
                return PlatformId.BR1;
            case EUNE:
                return PlatformId.EUN1;
            case EUW:
                return PlatformId.EUW1;
            case JP:
                return PlatformId.JP1;
            case KR:
                return PlatformId.KR;
            case LAN:
                return PlatformId.LA1;
            case LAS:
                return PlatformId.LA2;
            case NA:
                return PlatformId.NA1;
            case OCE:
                return PlatformId.OC1;
            case RU:
                return PlatformId.RU;
            case TR:
                return PlatformId.TR1;
            default:
                throw new IllegalStateException("region can not be converted");
        }
    }
}
