package com.vgalloy.riot.library.api.dto.league;

import java.io.Serializable;
import java.util.Objects;

import com.vgalloy.riot.library.api.constant.PlayStyle;

/**
 * Created by Vincent Galloy on 20/05/16.
 *
 * @author Vincent Galloy
 */
public class LeagueEntryDto implements Serializable {

    private static final long serialVersionUID = 2353617061845514375L;

    private String division;
    private Boolean isFreshBlood;
    private Boolean isHotStreak;
    private Boolean isInactive;
    private Boolean isVeteran;
    private Integer leaguePoints;
    private Integer losses;
    private MiniSeriesDto miniSeries;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private PlayStyle playstyle;
    private Integer wins;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Boolean isIsFreshBlood() {
        return isFreshBlood;
    }

    public void setIsFreshBlood(Boolean freshBlood) {
        isFreshBlood = freshBlood;
    }

    public Boolean isIsHotStreak() {
        return isHotStreak;
    }

    public void setIsHotStreak(Boolean hotStreak) {
        isHotStreak = hotStreak;
    }

    public Boolean isIsInactive() {
        return isInactive;
    }

    public void setIsInactive(Boolean inactive) {
        isInactive = inactive;
    }

    public Boolean isIsVeteran() {
        return isVeteran;
    }

    public void setIsVeteran(Boolean veteran) {
        isVeteran = veteran;
    }

    public Integer getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(Integer leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
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
        if (!(o instanceof LeagueEntryDto)) {
            return false;
        }
        LeagueEntryDto that = (LeagueEntryDto) o;
        return Objects.equals(division, that.division) &&
            Objects.equals(isFreshBlood, that.isFreshBlood) &&
            Objects.equals(isHotStreak, that.isHotStreak) &&
            Objects.equals(isInactive, that.isInactive) &&
            Objects.equals(isVeteran, that.isVeteran) &&
            Objects.equals(leaguePoints, that.leaguePoints) &&
            Objects.equals(losses, that.losses) &&
            Objects.equals(miniSeries, that.miniSeries) &&
            Objects.equals(playerOrTeamId, that.playerOrTeamId) &&
            Objects.equals(playerOrTeamName, that.playerOrTeamName) &&
            playstyle == that.playstyle &&
            Objects.equals(wins, that.wins);
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
