package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RealmDto implements Serializable {

    private static final long serialVersionUID = 2135359382020837721L;

    private String cdn;
    private String css;
    private String dd;
    @JsonProperty("l")
    private String realmL;
    private String lg;
    @JsonProperty("n")
    private Map<String, String> realmN;
    @JsonProperty("profileiconmax")
    private int profileIconMax;
    private String store;
    @JsonProperty("v")
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

    public int getProfileIconMax() {
        return profileIconMax;
    }

    public void setProfileIconMax(int profileIconMax) {
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RealmDto realmDto = (RealmDto) o;
        return profileIconMax == realmDto.profileIconMax &&
                Objects.equals(cdn, realmDto.cdn) &&
                Objects.equals(css, realmDto.css) &&
                Objects.equals(dd, realmDto.dd) &&
                Objects.equals(realmL, realmDto.realmL) &&
                Objects.equals(lg, realmDto.lg) &&
                Objects.equals(realmN, realmDto.realmN) &&
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
