package vgalloy.riot.service.mapper;

import vgalloy.riot.api.dto.constant.PlatformId;
import vgalloy.riot.api.dto.constant.Region;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RegionMapper {

    /**
     * Converter.
     *
     * @param platformId the platformId
     * @return the region
     */
    public static Region toRegion(PlatformId platformId) {
        switch (platformId) {
            case BR1:
                return Region.BR;
            case EUN1:
                return Region.EUNE;
            case EUW1:
                return Region.EUW;
            case JP1:
                return Region.JP;
            case KR:
                return Region.KR;
            case LA1:
                return Region.LAN;
            case LA2:
                return Region.LAS;
            case NA1:
                return Region.NA;
            case OC1:
                return Region.OCE;
            case RU:
                return Region.RU;
            case TR1:
                return Region.TR;
            default:
                throw new IllegalStateException("platformId can not be converted");
        }
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
