package com.vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class SpellVarsDto implements Serializable {

    private static final long serialVersionUID = 8882022081469556975L;

    private List<Double> coeff;
    private String dyn;
    private String key;
    private String link;
    private String ranksWith;

    public List<Double> getCoeff() {
        return coeff;
    }

    public void setCoeff(List<Double> coeff) {
        this.coeff = coeff;
    }

    public String getDyn() {
        return dyn;
    }

    public void setDyn(String dyn) {
        this.dyn = dyn;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getRanksWith() {
        return ranksWith;
    }

    public void setRanksWith(String ranksWith) {
        this.ranksWith = ranksWith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpellVarsDto that = (SpellVarsDto) o;
        return Objects.equals(coeff, that.coeff) &&
            Objects.equals(dyn, that.dyn) &&
            Objects.equals(key, that.key) &&
            Objects.equals(link, that.link) &&
            Objects.equals(ranksWith, that.ranksWith);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coeff, dyn, key, link, ranksWith);
    }

    @Override
    public String toString() {
        return "SpellVarsDto{" +
            "coeff=" + coeff +
            ", dyn='" + dyn + '\'' +
            ", key='" + key + '\'' +
            ", link='" + link + '\'' +
            ", ranksWith='" + ranksWith + '\'' +
            '}';
    }
}
