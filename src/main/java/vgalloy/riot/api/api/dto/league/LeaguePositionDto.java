package vgalloy.riot.api.api.dto.league;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 31/07/2017.
 *
 * @author Vincent Galloy
 */
public class LeaguePositionDto implements Serializable {

    private static final long serialVersionUID = 2756805575529165019L;

    private String rank;
    private String queueType;
    private Boolean hotStreak;
    private MiniSeriesDto miniSeries;
    private Integer wins;
    private boolean veteran;
    private Integer losses;
    private String playerOrTeamId;
    private String leagueName;
    private String playerOrTeamName;
    private Boolean inactive;
    private Boolean freshBlood;
    private String tier;
    private Integer leaguePoints;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
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

    public boolean isVeteran() {
        return veteran;
    }

    public void setVeteran(boolean veteran) {
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

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
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

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
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
        LeaguePositionDto that = (LeaguePositionDto) o;
        return veteran == that.veteran &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(queueType, that.queueType) &&
                Objects.equals(hotStreak, that.hotStreak) &&
                Objects.equals(miniSeries, that.miniSeries) &&
                Objects.equals(wins, that.wins) &&
                Objects.equals(losses, that.losses) &&
                Objects.equals(playerOrTeamId, that.playerOrTeamId) &&
                Objects.equals(leagueName, that.leagueName) &&
                Objects.equals(playerOrTeamName, that.playerOrTeamName) &&
                Objects.equals(inactive, that.inactive) &&
                Objects.equals(freshBlood, that.freshBlood) &&
                Objects.equals(tier, that.tier) &&
                Objects.equals(leaguePoints, that.leaguePoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, queueType, hotStreak, miniSeries, wins, veteran, losses, playerOrTeamId, leagueName, playerOrTeamName, inactive, freshBlood, tier, leaguePoints);
    }

    @Override
    public String toString() {
        return "LeaguePositionDto{" +
                "rank='" + rank + '\'' +
                ", queueType='" + queueType + '\'' +
                ", hotStreak=" + hotStreak +
                ", miniSeries=" + miniSeries +
                ", wins=" + wins +
                ", veteran=" + veteran +
                ", losses=" + losses +
                ", playerOrTeamId='" + playerOrTeamId + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", playerOrTeamName='" + playerOrTeamName + '\'' +
                ", inactive=" + inactive +
                ", freshBlood=" + freshBlood +
                ", tier='" + tier + '\'' +
                ", leaguePoints=" + leaguePoints +
                '}';
    }
}
