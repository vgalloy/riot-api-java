package com.vgalloy.riot.api.api.dto.currentgame;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class Mastery implements Serializable {

    private static final long serialVersionUID = 7938595592255067440L;

    private Integer masteryId;
    private Integer rank;

    public Integer getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(Integer masteryId) {
        this.masteryId = masteryId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mastery)) {
            return false;
        }
        Mastery mastery = (Mastery) o;
        return Objects.equals(masteryId, mastery.masteryId) &&
            Objects.equals(rank, mastery.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masteryId, rank);
    }

    @Override
    public String toString() {
        return "Mastery{" +
            "masteryId=" + masteryId +
            ", rank=" + rank +
            '}';
    }
}
