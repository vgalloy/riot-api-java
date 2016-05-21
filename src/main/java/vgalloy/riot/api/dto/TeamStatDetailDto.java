package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class TeamStatDetailDto {

    private int averageGamesPlayed;
    private int losses;
    private String teamStatType;
    private int wins;

    public int getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public void setAverageGamesPlayed(int averageGamesPlayed) {
        this.averageGamesPlayed = averageGamesPlayed;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getTeamStatType() {
        return teamStatType;
    }

    public void setTeamStatType(String teamStatType) {
        this.teamStatType = teamStatType;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
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
