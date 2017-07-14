package com.vgalloy.riot.api.internal.dto.team;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class MatchHistorySummaryDto implements Serializable {

    private static final long serialVersionUID = -8899875706150618435L;

    private Integer assists;
    private Long date;
    private Integer deaths;
    private Long gameId;
    private String gameMode;
    private Boolean invalid;
    private Integer kills;
    private Integer mapId;
    private Integer opposingTeamKills;
    private String opposingTeamName;
    private Boolean win;

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public Boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Integer getOpposingTeamKills() {
        return opposingTeamKills;
    }

    public void setOpposingTeamKills(Integer opposingTeamKills) {
        this.opposingTeamKills = opposingTeamKills;
    }

    public String getOpposingTeamName() {
        return opposingTeamName;
    }

    public void setOpposingTeamName(String opposingTeamName) {
        this.opposingTeamName = opposingTeamName;
    }

    public Boolean isWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchHistorySummaryDto)) {
            return false;
        }
        MatchHistorySummaryDto that = (MatchHistorySummaryDto) o;
        return Objects.equals(assists, that.assists) &&
            Objects.equals(date, that.date) &&
            Objects.equals(deaths, that.deaths) &&
            Objects.equals(gameId, that.gameId) &&
            Objects.equals(gameMode, that.gameMode) &&
            Objects.equals(invalid, that.invalid) &&
            Objects.equals(kills, that.kills) &&
            Objects.equals(mapId, that.mapId) &&
            Objects.equals(opposingTeamKills, that.opposingTeamKills) &&
            Objects.equals(opposingTeamName, that.opposingTeamName) &&
            Objects.equals(win, that.win);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assists, date, deaths, gameId, gameMode, invalid, kills, mapId, opposingTeamKills, opposingTeamName, win);
    }

    @Override
    public String toString() {
        return "MatchHistorySummaryDto{" +
            "assists=" + assists +
            ", date=" + date +
            ", deaths=" + deaths +
            ", gameId=" + gameId +
            ", gameMode='" + gameMode + '\'' +
            ", invalid=" + invalid +
            ", kills=" + kills +
            ", mapId=" + mapId +
            ", opposingTeamKills=" + opposingTeamKills +
            ", opposingTeamName='" + opposingTeamName + '\'' +
            ", win=" + win +
            '}';
    }
}
