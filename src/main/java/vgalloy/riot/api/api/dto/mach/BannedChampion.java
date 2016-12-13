package vgalloy.riot.api.api.dto.mach;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BannedChampion implements Serializable {

    private static final long serialVersionUID = -5892311044776388605L;

    private Integer championId;
    private Integer pickTurn;

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BannedChampion)) {
            return false;
        }
        BannedChampion that = (BannedChampion) o;
        return Objects.equals(championId, that.championId) &&
                Objects.equals(pickTurn, that.pickTurn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId, pickTurn);
    }

    @Override
    public String toString() {
        return "BannedChampion{" +
                "championId=" + championId +
                ", pickTurn=" + pickTurn +
                '}';
    }
}
