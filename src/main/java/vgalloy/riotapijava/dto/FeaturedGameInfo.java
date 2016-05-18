package vgalloy.riotapijava.dto;
import java.util.List;
import vgalloy.riotapijava.dto.constant.GameMode;
import vgalloy.riotapijava.dto.constant.GameType;
import vgalloy.riotapijava.dto.constant.PlatformId;

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
    // TODO enum
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
