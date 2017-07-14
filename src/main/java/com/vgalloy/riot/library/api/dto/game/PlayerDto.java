package com.vgalloy.riot.library.api.dto.game;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public class PlayerDto implements Serializable {

    private static final long serialVersionUID = 419411897723170076L;

    private Integer championId;
    private Integer summonerId;
    private Integer teamId;

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Integer getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Integer summonerId) {
        this.summonerId = summonerId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlayerDto)) {
            return false;
        }
        PlayerDto playerDto = (PlayerDto) o;
        return Objects.equals(championId, playerDto.championId) &&
            Objects.equals(summonerId, playerDto.summonerId) &&
            Objects.equals(teamId, playerDto.teamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId, summonerId, teamId);
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
            "championId=" + championId +
            ", summonerId=" + summonerId +
            ", teamId=" + teamId +
            '}';
    }
}
