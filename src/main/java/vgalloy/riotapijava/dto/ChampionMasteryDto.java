package vgalloy.riotapijava.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
public class ChampionMasteryDto {

    private long championId;
    private int championLevel;
    private int championPoints;
    private long championPointsSinceLastLevel;
    private long championPointsUntilNextLevel;
    private boolean chestGranted;
    private String highestGrade;
    private long lastPlayTime;
    private long playerId;
    private long tokensEarned;

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public int getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(int championLevel) {
        this.championLevel = championLevel;
    }

    public int getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(int championPoints) {
        this.championPoints = championPoints;
    }

    public long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public boolean isChestGranted() {
        return chestGranted;
    }

    public void setChestGranted(boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    public String getHighestGrade() {
        return highestGrade;
    }

    public void setHighestGrade(String highestGrade) {
        this.highestGrade = highestGrade;
    }

    public long getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(long lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public long getTokensEarned() {
        return tokensEarned;
    }

    public void setTokensEarned(long tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    @Override
    public String toString() {
        return "ChampionMasteryDTO{" +
                "championId=" + championId +
                ", championLevel=" + championLevel +
                ", championPoints=" + championPoints +
                ", championPointsSinceLastLevel=" + championPointsSinceLastLevel +
                ", championPointsUntilNextLevel=" + championPointsUntilNextLevel +
                ", chestGranted=" + chestGranted +
                ", highestGrade='" + highestGrade + '\'' +
                ", lastPlayTime=" + lastPlayTime +
                ", playerId=" + playerId +
                ", tokensEarned=" + tokensEarned +
                '}';
    }
}
