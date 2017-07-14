package com.vgalloy.riot.api.api.dto.currentgame;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.vgalloy.riot.api.api.constant.GameMode;
import com.vgalloy.riot.api.api.constant.PlatformId;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class CurrentGameInfo implements Serializable {

    private static final long serialVersionUID = -7522865568651909560L;

    private List<BannedChampion> bannedChampions;
    private Long gameId;
    private Long gameLength;
    private GameMode gameMode;
    private Long gameQueueConfigId;
    private Long gameStartTime;
    private String gameType;
    private Long mapId;
    private Observer observers;
    private List<CurrentGameParticipant> participants;
    private PlatformId platformId;

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public Long getGameLength() {
        return gameLength;
    }

    public void setGameLength(Long gameLength) {
        this.gameLength = gameLength;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public Long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(Long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public Long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(Long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
        this.mapId = mapId;
    }

    public Observer getObservers() {
        return observers;
    }

    public void setObservers(Observer observers) {
        this.observers = observers;
    }

    public List<CurrentGameParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<CurrentGameParticipant> participants) {
        this.participants = participants;
    }

    public PlatformId getPlatformId() {
        return platformId;
    }

    public void setPlatformId(PlatformId platformId) {
        this.platformId = platformId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CurrentGameInfo)) {
            return false;
        }
        CurrentGameInfo that = (CurrentGameInfo) o;
        return Objects.equals(bannedChampions, that.bannedChampions) &&
            Objects.equals(gameId, that.gameId) &&
            Objects.equals(gameLength, that.gameLength) &&
            gameMode == that.gameMode &&
            Objects.equals(gameQueueConfigId, that.gameQueueConfigId) &&
            Objects.equals(gameStartTime, that.gameStartTime) &&
            Objects.equals(gameType, that.gameType) &&
            Objects.equals(mapId, that.mapId) &&
            Objects.equals(observers, that.observers) &&
            Objects.equals(participants, that.participants) &&
            platformId == that.platformId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bannedChampions, gameId, gameLength, gameMode, gameQueueConfigId, gameStartTime, gameType, mapId, observers, participants, platformId);
    }

    @Override
    public String toString() {
        return "CurrentGameInfo{" +
            "bannedChampions=" + bannedChampions +
            ", gameId=" + gameId +
            ", gameLength=" + gameLength +
            ", gameMode=" + gameMode +
            ", gameQueueConfigId=" + gameQueueConfigId +
            ", gameStartTime=" + gameStartTime +
            ", gameType='" + gameType + '\'' +
            ", mapId=" + mapId +
            ", observers=" + observers +
            ", participants=" + participants +
            ", platformId=" + platformId +
            '}';
    }
}
