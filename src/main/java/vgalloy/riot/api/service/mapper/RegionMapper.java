package vgalloy.riot.api.service.mapper;

import vgalloy.riot.api.rest.constant.PlatformId;
import vgalloy.riot.api.rest.constant.Region;

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
    }

    /**
     * Converter.
     *
     * @param platformId the platformId
     * @return the region
     */
    public static Region toRegion(PlatformId platformId) {
        switch (platformId) {
            case BR1:
                return Region.br;
            case EUN1:
                return Region.eune;
            case EUW1:
                return Region.euw;
            case JP1:
                return Region.jp;
            case KR:
                return Region.kr;
            case LA1:
                return Region.lan;
            case LA2:
                return Region.las;
            case NA1:
                return Region.na;
            case OC1:
                return Region.oce;
            case RU:
                return Region.ru;
            case TR1:
                return Region.tr;
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
            case br:
                return PlatformId.BR1;
            case eune:
                return PlatformId.EUN1;
            case euw:
                return PlatformId.EUW1;
            case jp:
                return PlatformId.JP1;
            case kr:
                return PlatformId.KR;
            case lan:
                return PlatformId.LA1;
            case las:
                return PlatformId.LA2;
            case na:
                return PlatformId.NA1;
            case oce:
                return PlatformId.OC1;
            case ru:
                return PlatformId.RU;
            case tr:
                return PlatformId.TR1;
            default:
                throw new IllegalStateException("region can not be converted");
        }
    }
}
