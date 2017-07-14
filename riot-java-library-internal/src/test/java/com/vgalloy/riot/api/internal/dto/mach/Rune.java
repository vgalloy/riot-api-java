package com.vgalloy.riot.api.internal.dto.mach;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class Rune implements Serializable {

    private static final long serialVersionUID = 8497636402696590331L;

    private Integer rank;
    private Long runeId;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Long getRuneId() {
        return runeId;
    }

    public void setRuneId(Long runeId) {
        this.runeId = runeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rune)) {
            return false;
        }
        Rune rune = (Rune) o;
        return Objects.equals(rank, rune.rank) &&
            Objects.equals(runeId, rune.runeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, runeId);
    }

    @Override
    public String toString() {
        return "Rune{" +
            "rank=" + rank +
            ", runeId=" + runeId +
            '}';
    }
}
