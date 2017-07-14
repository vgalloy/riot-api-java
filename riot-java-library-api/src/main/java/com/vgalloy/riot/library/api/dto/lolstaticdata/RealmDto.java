package com.vgalloy.riot.library.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class RealmDto implements Serializable {

    private static final long serialVersionUID = 2135359382020837721L;

    private String cdn;
    private String css;
    private String dd;
    private String realmL;
    private String lg;
    private Map<String, String> realmN;
    private Integer profileIconMax;
    private String store;
    private String realmV;

    public String getCdn() {
        return cdn;
    }

    public void setCdn(String cdn) {
        this.cdn = cdn;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public String getRealmL() {
        return realmL;
    }

    public void setRealmL(String realmL) {
        this.realmL = realmL;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public Map<String, String> getRealmN() {
        return realmN;
    }

    public void setRealmN(Map<String, String> realmN) {
        this.realmN = realmN;
    }

    public Integer getProfileIconMax() {
        return profileIconMax;
    }

    public void setProfileIconMax(Integer profileIconMax) {
        this.profileIconMax = profileIconMax;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getRealmV() {
        return realmV;
    }

    public void setRealmV(String realmV) {
        this.realmV = realmV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealmDto)) {
            return false;
        }
        RealmDto realmDto = (RealmDto) o;
        return Objects.equals(cdn, realmDto.cdn) &&
            Objects.equals(css, realmDto.css) &&
            Objects.equals(dd, realmDto.dd) &&
            Objects.equals(realmL, realmDto.realmL) &&
            Objects.equals(lg, realmDto.lg) &&
            Objects.equals(realmN, realmDto.realmN) &&
            Objects.equals(profileIconMax, realmDto.profileIconMax) &&
            Objects.equals(store, realmDto.store) &&
            Objects.equals(realmV, realmDto.realmV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdn, css, dd, realmL, lg, realmN, profileIconMax, store, realmV);
    }

    @Override
    public String toString() {
        return "RealmDto{" +
            "cdn='" + cdn + '\'' +
            ", css='" + css + '\'' +
            ", dd='" + dd + '\'' +
            ", realmL='" + realmL + '\'' +
            ", lg='" + lg + '\'' +
            ", realmN=" + realmN +
            ", profileIconMax=" + profileIconMax +
            ", store='" + store + '\'' +
            ", realmV='" + realmV + '\'' +
            '}';
    }
}
