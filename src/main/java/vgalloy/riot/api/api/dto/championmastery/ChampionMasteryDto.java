package vgalloy.riot.api.api.dto.championmastery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 20/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionMasteryDto implements Serializable {

    private static final long serialVersionUID = 5151106851729825952L;

    private Long championId;
    private Integer championLevel;
    private Integer championPoints;
    private Long championPointsSinceLastLevel;
    private Long championPointsUntilNextLevel;
    private Boolean chestGranted;
    private String highestGrade;
    private Long lastPlayTime;
    private Long playerId;
    private Long tokensEarned;

    public Long getChampionId() {
        return championId;
    }

    public void setChampionId(Long championId) {
        this.championId = championId;
    }

    public Integer getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(Integer championLevel) {
        this.championLevel = championLevel;
    }

    public Integer getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(Integer championPoints) {
        this.championPoints = championPoints;
    }

    public Long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(Long championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public Long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(Long championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public Boolean isChestGranted() {
        return chestGranted;
    }

    public void setChestGranted(Boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    public String getHighestGrade() {
        return highestGrade;
    }

    public void setHighestGrade(String highestGrade) {
        this.highestGrade = highestGrade;
    }

    public Long getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(Long lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getTokensEarned() {
        return tokensEarned;
    }

    public void setTokensEarned(Long tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChampionMasteryDto)) {
            return false;
        }
        ChampionMasteryDto that = (ChampionMasteryDto) o;
        return Objects.equals(championId, that.championId) &&
                Objects.equals(championLevel, that.championLevel) &&
                Objects.equals(championPoints, that.championPoints) &&
                Objects.equals(championPointsSinceLastLevel, that.championPointsSinceLastLevel) &&
                Objects.equals(championPointsUntilNextLevel, that.championPointsUntilNextLevel) &&
                Objects.equals(chestGranted, that.chestGranted) &&
                Objects.equals(highestGrade, that.highestGrade) &&
                Objects.equals(lastPlayTime, that.lastPlayTime) &&
                Objects.equals(playerId, that.playerId) &&
                Objects.equals(tokensEarned, that.tokensEarned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(championId, championLevel, championPoints, championPointsSinceLastLevel, championPointsUntilNextLevel, chestGranted, highestGrade, lastPlayTime, playerId, tokensEarned);
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
