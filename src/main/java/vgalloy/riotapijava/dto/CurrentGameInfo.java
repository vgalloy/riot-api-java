package vgalloy.riotapijava.dto;

import java.util.List;

import vgalloy.riotapijava.dto.constant.GameMode;
import vgalloy.riotapijava.dto.constant.PlatformId;

/**
 * Created by Vincent Galloy on 19/05/16.
 */
public class CurrentGameInfo {

    private List<BannedChampion> bannedChampions;
    private long gameId;
    private long gameLength;
    private GameMode gameMode;
    private long gameQueueConfigId;
    private long gameStartTime;
    private String gameType;
    private long mapId;
    private Observer observers;
    private List<CurrentGameParticipant> participants;
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

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
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
}
