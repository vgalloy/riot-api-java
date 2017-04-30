package vgalloy.riot.api.api.dto.team;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class TeamStatDetailDto implements Serializable {

    private static final long serialVersionUID = -3049063318319195252L;

    private Integer averageGamesPlayed;
    private Integer losses;
    private String teamStatType;
    private Integer wins;

    public Integer getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public void setAverageGamesPlayed(Integer averageGamesPlayed) {
        this.averageGamesPlayed = averageGamesPlayed;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getTeamStatType() {
        return teamStatType;
    }

    public void setTeamStatType(String teamStatType) {
        this.teamStatType = teamStatType;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeamStatDetailDto)) {
            return false;
        }
        TeamStatDetailDto that = (TeamStatDetailDto) o;
        return Objects.equals(averageGamesPlayed, that.averageGamesPlayed) &&
            Objects.equals(losses, that.losses) &&
            Objects.equals(teamStatType, that.teamStatType) &&
            Objects.equals(wins, that.wins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageGamesPlayed, losses, teamStatType, wins);
    }

    @Override
    public String toString() {
        return "TeamStatDetailDto{" +
            "averageGamesPlayed=" + averageGamesPlayed +
            ", losses=" + losses +
            ", teamStatType='" + teamStatType + '\'' +
            ", wins=" + wins +
            '}';
    }
}
