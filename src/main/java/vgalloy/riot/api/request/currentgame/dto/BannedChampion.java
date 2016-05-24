package vgalloy.riot.api.request.currentgame.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class BannedChampion {

    private long championId;
    private int pickTurn;
    private long teamId;

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(int pickTurn) {
        this.pickTurn = pickTurn;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
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
                pickTurn == that.pickTurn &&
                teamId == that.teamId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId, pickTurn, teamId);
    }

    @Override
    public String toString() {
        return "BannedChampion{" +
                "championId=" + championId +
                ", pickTurn=" + pickTurn +
                ", teamId=" + teamId +
                '}';
    }
}
