package vgalloy.riot.api.dto;

import java.util.Map;

/**
 * Created by Vincent Galloy on 21/05/16.
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
