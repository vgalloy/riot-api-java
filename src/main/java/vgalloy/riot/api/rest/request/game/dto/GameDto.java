package vgalloy.riot.api.rest.request.game.dto;

import java.util.List;
import java.util.Objects;

import vgalloy.riot.api.rest.constant.SupType;
import vgalloy.riot.api.rest.constant.GameMode;
import vgalloy.riot.api.rest.constant.GameType;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class GameDto {

    private int championId;
    private long createDate;
    private List<PlayerDto> fellowPlayers;
    private long gameId;
    private GameMode gameMode;
    private GameType gameType;
    private boolean invalid;
    private int ipEarned;
    private int level;
    private int mapId;
    private int spell1;
    private int spell2;
    private RawStatsDto stats;
    private SupType subType;
    private int teamId;

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public List<PlayerDto> getFellowPlayers() {
        return fellowPlayers;
    }

    public void setFellowPlayers(List<PlayerDto> fellowPlayers) {
        this.fellowPlayers = fellowPlayers;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public int getIpEarned() {
        return ipEarned;
    }

    public void setIpEarned(int ipEarned) {
        this.ipEarned = ipEarned;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getSpell1() {
        return spell1;
    }

    public void setSpell1(int spell1) {
        this.spell1 = spell1;
    }

    public int getSpell2() {
        return spell2;
    }

    public void setSpell2(int spell2) {
        this.spell2 = spell2;
    }

    public RawStatsDto getStats() {
        return stats;
    }

    public void setStats(RawStatsDto stats) {
        this.stats = stats;
    }

    public SupType getSubType() {
        return subType;
    }

    public void setSubType(SupType subType) {
        this.subType = subType;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameDto gameDto = (GameDto) o;
        return championId == gameDto.championId &&
                createDate == gameDto.createDate &&
                gameId == gameDto.gameId &&
                invalid == gameDto.invalid &&
                ipEarned == gameDto.ipEarned &&
                level == gameDto.level &&
                mapId == gameDto.mapId &&
                spell1 == gameDto.spell1 &&
                spell2 == gameDto.spell2 &&
                teamId == gameDto.teamId &&
                Objects.equals(fellowPlayers, gameDto.fellowPlayers) &&
                gameMode == gameDto.gameMode &&
                gameType == gameDto.gameType &&
                Objects.equals(stats, gameDto.stats) &&
                subType == gameDto.subType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId, createDate, fellowPlayers, gameId, gameMode, gameType, invalid, ipEarned, level, mapId, spell1, spell2, stats, subType, teamId);
    }

    @Override
    public String toString() {
        return "GameDto{" +
                "championId=" + championId +
                ", createDate=" + createDate +
                ", fellowPlayers=" + fellowPlayers +
                ", gameId=" + gameId +
                ", gameMode='" + gameMode + '\'' +
                ", gameType='" + gameType + '\'' +
                ", invalid=" + invalid +
                ", ipEarned=" + ipEarned +
                ", level=" + level +
                ", mapId=" + mapId +
                ", spell1=" + spell1 +
                ", spell2=" + spell2 +
                ", stats=" + stats +
                ", subType='" + subType + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
