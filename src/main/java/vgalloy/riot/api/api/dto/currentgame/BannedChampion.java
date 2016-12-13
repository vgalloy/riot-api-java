package vgalloy.riot.api.api.dto.currentgame;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BannedChampion implements Serializable {

    private static final long serialVersionUID = -7939933136361474182L;

    private Long championId;
    private Integer pickTurn;
    private Long teamId;

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Integer getPickTurn() {
        return pickTurn;
    }

    public void setPickTurn(Integer pickTurn) {
        this.pickTurn = pickTurn;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
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
                Objects.equals(pickTurn, that.pickTurn) &&
                Objects.equals(teamId, that.teamId);
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
