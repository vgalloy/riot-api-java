package com.vgalloy.riot.api.internal.dto.game;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.vgalloy.riot.library.api.constant.GameMode;
import com.vgalloy.riot.library.api.constant.GameType;
import com.vgalloy.riot.library.api.constant.SupType;

/**
 * Created by Vincent Galloy on 18/05/16.
 *
 * @author Vincent Galloy
 */
public class GameDto implements Serializable {

    private static final long serialVersionUID = -4090528226769958180L;

    private Integer championId;
    private Long createDate;
    private List<PlayerDto> fellowPlayers;
    private Long gameId;
    private GameMode gameMode;
    private GameType gameType;
    private Boolean invalid;
    private Integer ipEarned;
    private Integer level;
    private Integer mapId;
    private Integer spell1;
    private Integer spell2;
    private RawStatsDto stats;
    private SupType subType;
    private Integer teamId;

    public Integer getChampionId() {
        return championId;
    }

    public void setChampionId(Integer championId) {
        this.championId = championId;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public List<PlayerDto> getFellowPlayers() {
        return fellowPlayers;
    }

    public void setFellowPlayers(List<PlayerDto> fellowPlayers) {
        this.fellowPlayers = fellowPlayers;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
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

    public Boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    public Integer getIpEarned() {
        return ipEarned;
    }

    public void setIpEarned(Integer ipEarned) {
        this.ipEarned = ipEarned;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Integer getSpell1() {
        return spell1;
    }

    public void setSpell1(Integer spell1) {
        this.spell1 = spell1;
    }

    public Integer getSpell2() {
        return spell2;
    }

    public void setSpell2(Integer spell2) {
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
        if (!(o instanceof GameDto)) {
            return false;
        }
        GameDto gameDto = (GameDto) o;
        return Objects.equals(championId, gameDto.championId) &&
            Objects.equals(createDate, gameDto.createDate) &&
            Objects.equals(fellowPlayers, gameDto.fellowPlayers) &&
            Objects.equals(gameId, gameDto.gameId) &&
            gameMode == gameDto.gameMode &&
            gameType == gameDto.gameType &&
            Objects.equals(invalid, gameDto.invalid) &&
            Objects.equals(ipEarned, gameDto.ipEarned) &&
            Objects.equals(level, gameDto.level) &&
            Objects.equals(mapId, gameDto.mapId) &&
            Objects.equals(spell1, gameDto.spell1) &&
            Objects.equals(spell2, gameDto.spell2) &&
            Objects.equals(stats, gameDto.stats) &&
            subType == gameDto.subType &&
            Objects.equals(teamId, gameDto.teamId);
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
