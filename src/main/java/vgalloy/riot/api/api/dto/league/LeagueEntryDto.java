package vgalloy.riot.api.api.dto.league;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import vgalloy.riot.api.api.constant.PlayStyle;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueEntryDto implements Serializable {

    private static final long serialVersionUID = 2353617061845514375L;

    private String division;
    private boolean isFreshBlood;
    private boolean isHotStreak;
    private boolean isInactive;
    private boolean isVeteran;
    private int leaguePoints;
    private int losses;
    private MiniSeriesDto miniSeries;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private PlayStyle playstyle;
    private int wins;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public boolean isIsFreshBlood() {
        return isFreshBlood;
    }

    public void setIsFreshBlood(boolean freshBlood) {
        isFreshBlood = freshBlood;
    }

    public boolean isIsHotStreak() {
        return isHotStreak;
    }

    public void setIsHotStreak(boolean hotStreak) {
        isHotStreak = hotStreak;
    }

    public boolean isIsInactive() {
        return isInactive;
    }

    public void setIsInactive(boolean inactive) {
        isInactive = inactive;
    }

    public boolean isIsVeteran() {
        return isVeteran;
    }

    public void setIsVeteran(boolean veteran) {
        isVeteran = veteran;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public MiniSeriesDto getMiniSeries() {
        return miniSeries;
    }

    public void setMiniSeries(MiniSeriesDto miniSeries) {
        this.miniSeries = miniSeries;
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

    public PlayStyle getPlaystyle() {
        return playstyle;
    }

    public void setPlaystyle(PlayStyle playstyle) {
        this.playstyle = playstyle;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LeagueEntryDto that = (LeagueEntryDto) o;
        return isFreshBlood == that.isFreshBlood &&
                isHotStreak == that.isHotStreak &&
                isInactive == that.isInactive &&
                isVeteran == that.isVeteran &&
                leaguePoints == that.leaguePoints &&
                losses == that.losses &&
                wins == that.wins &&
                Objects.equals(division, that.division) &&
                Objects.equals(miniSeries, that.miniSeries) &&
                Objects.equals(playerOrTeamId, that.playerOrTeamId) &&
                Objects.equals(playerOrTeamName, that.playerOrTeamName) &&
                playstyle == that.playstyle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(division, isFreshBlood, isHotStreak, isInactive, isVeteran, leaguePoints, losses, miniSeries, playerOrTeamId, playerOrTeamName, playstyle, wins);
    }

    @Override
    public String toString() {
        return "LeagueEntryDto{" +
                "division='" + division + '\'' +
                ", isFreshBlood=" + isFreshBlood +
                ", isHotStreak=" + isHotStreak +
                ", isInactive=" + isInactive +
                ", isVeteran=" + isVeteran +
                ", leaguePoints=" + leaguePoints +
                ", losses=" + losses +
                ", miniSeries=" + miniSeries +
                ", playerOrTeamId='" + playerOrTeamId + '\'' +
                ", playerOrTeamName='" + playerOrTeamName + '\'' +
                ", playstyle=" + playstyle +
                ", wins=" + wins +
                '}';
    }
}
