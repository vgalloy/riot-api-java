package vgalloy.riot.api.rest.request.mach.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BannedChampion {

    private int championId;
    private int pickTurn;

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BannedChampion that = (BannedChampion) o;
        return championId == that.championId &&
                pickTurn == that.pickTurn;
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
