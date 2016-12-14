package vgalloy.riot.api.api.dto.featuredgame;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import vgalloy.riot.api.api.constant.GameMode;
import vgalloy.riot.api.api.constant.GameType;
import vgalloy.riot.api.api.constant.PlatformId;
import vgalloy.riot.api.api.dto.currentgame.Observer;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class FeaturedGameInfo implements Serializable {

    private static final long serialVersionUID = 4807872817019555988L;

    private List<BannedChampion> bannedChampions;
    private Long gameId;
    private Long gameLength;
    private GameMode gameMode;
    private Long gameQueueConfigId;
    private Long gameStartTime;
    private GameType gameType;
    private Long mapId;
    private Observer observers;
    private List<Participant> participants;
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

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
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

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
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
        if (!(o instanceof FeaturedGameInfo)) {
            return false;
        }
        FeaturedGameInfo that = (FeaturedGameInfo) o;
        return Objects.equals(bannedChampions, that.bannedChampions) &&
                Objects.equals(gameId, that.gameId) &&
                Objects.equals(gameLength, that.gameLength) &&
                gameMode == that.gameMode &&
                Objects.equals(gameQueueConfigId, that.gameQueueConfigId) &&
                Objects.equals(gameStartTime, that.gameStartTime) &&
                gameType == that.gameType &&
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
        return "FeaturedGameInfo{" +
                "bannedChampions=" + bannedChampions +
                ", gameId=" + gameId +
                ", gameLength=" + gameLength +
                ", gameMode=" + gameMode +
                ", gameQueueConfigId=" + gameQueueConfigId +
                ", gameStartTime=" + gameStartTime +
                ", gameType=" + gameType +
                ", mapId=" + mapId +
                ", observers=" + observers +
                ", participants=" + participants +
                ", platformId='" + platformId + '\'' +
                '}';
    }
}
