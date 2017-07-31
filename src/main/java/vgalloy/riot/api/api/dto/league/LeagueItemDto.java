package vgalloy.riot.api.api.dto.league;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 31/07/17.
 *
 * @author Vincent Galloy
 */
public class LeagueItemDto implements Serializable {

    private static final long serialVersionUID = 5992435521914239616L;

    private String rank;
    private Boolean hotStreak;
    private MiniSeriesDto miniSeries;
    private Integer wins;
    private Boolean veteran;
    private Integer losses;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private Boolean inactive;
    private Boolean freshBlood;
    private Integer leaguePoints;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Boolean getHotStreak() {
        return hotStreak;
    }

    public void setHotStreak(Boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    public MiniSeriesDto getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(MiniSeriesDto miniSeries) {
        this.miniSeries = miniSeries;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Boolean getVeteran() {
        return veteran;
    }

    public void setVeteran(Boolean veteran) {
        this.veteran = veteran;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public void setPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    public Boolean getInactive() {
        return inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public Boolean getFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(Boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public Integer getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(Integer leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LeagueItemDto that = (LeagueItemDto) o;
        return Objects.equals(rank, that.rank) &&
                Objects.equals(hotStreak, that.hotStreak) &&
                Objects.equals(miniSeries, that.miniSeries) &&
                Objects.equals(wins, that.wins) &&
                Objects.equals(veteran, that.veteran) &&
                Objects.equals(losses, that.losses) &&
                Objects.equals(playerOrTeamId, that.playerOrTeamId) &&
                Objects.equals(playerOrTeamName, that.playerOrTeamName) &&
                Objects.equals(inactive, that.inactive) &&
                Objects.equals(freshBlood, that.freshBlood) &&
                Objects.equals(leaguePoints, that.leaguePoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, hotStreak, miniSeries, wins, veteran, losses, playerOrTeamId, playerOrTeamName, inactive, freshBlood, leaguePoints);
    }

    @Override
    public String toString() {
        return "LeagueItemDto{" +
                "rank='" + rank + '\'' +
                ", hotStreak=" + hotStreak +
                ", miniSeries=" + miniSeries +
                ", wins=" + wins +
                ", veteran=" + veteran +
                ", losses=" + losses +
                ", playerOrTeamId='" + playerOrTeamId + '\'' +
                ", playerOrTeamName='" + playerOrTeamName + '\'' +
                ", inactive=" + inactive +
                ", freshBlood=" + freshBlood +
                ", leaguePoints=" + leaguePoints +
                '}';
    }
}
