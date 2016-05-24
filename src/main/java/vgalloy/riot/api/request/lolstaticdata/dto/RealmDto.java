package vgalloy.riot.api.request.lolstaticdata.dto;

import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class RealmDto {

    private String cdn;
    private String css;
    private String dd;
    private String l;
    private String lg;
    private Map<String, String> n;
    private int profileiconmax;
    private String store;
    private String v;

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

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public Map<String, String> getN() {
        return n;
    }

    public void setN(Map<String, String> n) {
        this.n = n;
    }

    public int getProfileiconmax() {
        return profileiconmax;
    }

    public void setProfileiconmax(int profileiconmax) {
        this.profileiconmax = profileiconmax;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
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
        return profileiconmax == realmDto.profileiconmax &&
                Objects.equals(cdn, realmDto.cdn) &&
                Objects.equals(css, realmDto.css) &&
                Objects.equals(dd, realmDto.dd) &&
                Objects.equals(l, realmDto.l) &&
                Objects.equals(lg, realmDto.lg) &&
                Objects.equals(n, realmDto.n) &&
                Objects.equals(store, realmDto.store) &&
                Objects.equals(v, realmDto.v);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdn, css, dd, l, lg, n, profileiconmax, store, v);
    }

    @Override
    public String toString() {
        return "RealmDto{" +
                "cdn='" + cdn + '\'' +
                ", css='" + css + '\'' +
                ", dd='" + dd + '\'' +
                ", l='" + l + '\'' +
                ", lg='" + lg + '\'' +
                ", n=" + n +
                ", profileiconmax=" + profileiconmax +
                ", store='" + store + '\'' +
                ", v='" + v + '\'' +
                '}';
    }
}
