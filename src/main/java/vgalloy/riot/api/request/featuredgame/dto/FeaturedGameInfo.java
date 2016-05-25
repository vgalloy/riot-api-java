package vgalloy.riot.api.request.featuredgame.dto;

import java.util.List;
import java.util.Objects;

import vgalloy.riot.api.constant.GameMode;
import vgalloy.riot.api.constant.GameType;
import vgalloy.riot.api.constant.PlatformId;
import vgalloy.riot.api.request.currentgame.dto.Observer;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class FeaturedGameInfo {

    private List<BannedChampion> bannedChampions;
    private long gameId;
    private long gameLength;
    private GameMode gameMode;
    private long gameQueueConfigId;
    private long gameStartTime;
    private GameType gameType;
    private long mapId;
    private Observer observers;
    private List<Participant> participants;
    private PlatformId platformId;

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public void setBannedChampions(List<BannedChampion> bannedChampions) {
        this.bannedChampions = bannedChampions;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getGameLength() {
        return gameLength;
    }

    public void setGameLength(long gameLength) {
        this.gameLength = gameLength;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public void setGameQueueConfigId(long gameQueueConfigId) {
        this.gameQueueConfigId = gameQueueConfigId;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public void setGameStartTime(long gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
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
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeaturedGameInfo that = (FeaturedGameInfo) o;
        return gameId == that.gameId &&
                gameLength == that.gameLength &&
                gameQueueConfigId == that.gameQueueConfigId &&
                gameStartTime == that.gameStartTime &&
                mapId == that.mapId &&
                Objects.equals(bannedChampions, that.bannedChampions) &&
                gameMode == that.gameMode &&
                gameType == that.gameType &&
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
