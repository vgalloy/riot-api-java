package vgalloy.riot.api.internal.rest.dto;

import java.util.Objects;

import vgalloy.riot.api.api.constant.Region;

/**
 * Created by Vincent Galloy on 29/08/16.
 *
 * @author Vincent Galloy
 */
public enum SmallCaseRegion {
    br1, eun1, euw1, jp1, kr, lan, las, na1, oc1, ru, tr1;

    /**
     * Build a small case region from a region.
     *
     * @param region the region
     * @return the SmallCaseRegion
     */
    public static SmallCaseRegion of(Region region) {
        Objects.requireNonNull(region);

        switch (region) {
            case BR:
                return br1;
            case EUNE:
                return eun1;
            case EUW:
                return euw1;
            case JP:
                return jp1;
            case KR:
                return kr;
            case LAN:
                return lan;
            case LAS:
                return las;
            case NA:
                return na1;
            case OCE:
                return oc1;
            case RU:
                return ru;
            case TR:
                return tr1;
            default:
                throw new IllegalStateException("Region can not be converted");
        }
    }
}
