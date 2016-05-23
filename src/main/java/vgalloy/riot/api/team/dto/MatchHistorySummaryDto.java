package vgalloy.riot.api.team.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MatchHistorySummaryDto {

    private int assists;
    private long date;
    private int deaths;
    private long gameId;
    private String gameMode;
    private boolean invalid;
    private int kills;
    private int mapId;
    private int opposingTeamKills;
    private String opposingTeamName;
    private boolean win;

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getOpposingTeamKills() {
        return opposingTeamKills;
    }

    public void setOpposingTeamKills(int opposingTeamKills) {
        this.opposingTeamKills = opposingTeamKills;
    }

    public String getOpposingTeamName() {
        return opposingTeamName;
    }

    public void setOpposingTeamName(String opposingTeamName) {
        this.opposingTeamName = opposingTeamName;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchHistorySummaryDto that = (MatchHistorySummaryDto) o;
        return assists == that.assists &&
                date == that.date &&
                deaths == that.deaths &&
                gameId == that.gameId &&
                invalid == that.invalid &&
                kills == that.kills &&
                mapId == that.mapId &&
                opposingTeamKills == that.opposingTeamKills &&
                win == that.win &&
                Objects.equals(gameMode, that.gameMode) &&
                Objects.equals(opposingTeamName, that.opposingTeamName);
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
