package com.vgalloy.riot.api.internal.rest.dto;

import com.vgalloy.riot.library.api.constant.Region;

/**
 * Created by Vincent Galloy on 29/08/16.
 *
 * @author Vincent Galloy
 */
public enum SmallCaseRegion {
    br, eune, euw, jp, kr, lan, las, na, oce, ru, tr;

    /**
     * Build a small case region from a region.
     *
     * @param region the region
     * @return the SmallCaseRegion
     */
    public static SmallCaseRegion of(Region region) {
        switch (region) {
            case BR:
                return br;
            case EUNE:
                return eune;
            case EUW:
                return euw;
            case JP:
                return jp;
            case KR:
                return kr;
            case LAN:
                return lan;
            case LAS:
                return las;
            case NA:
                return na;
            case OCE:
                return oce;
            case RU:
                return ru;
            case TR:
                return tr;
            default:
                throw new IllegalStateException("Region can not be converted");
        }
    }
}
