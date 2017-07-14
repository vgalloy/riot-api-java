package com.vgalloy.riot.library.api.dto.stats;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class AggregatedStatsDto implements Serializable {

    private static final long serialVersionUID = 3499552444965985189L;

    private Integer averageAssists;
    private Integer averageChampionsKilled;
    private Integer averageCombatPlayerScore;
    private Integer averageNodeCapture;
    private Integer averageNodeCaptureAssist;
    private Integer averageNodeNeutralize;
    private Integer averageNodeNeutralizeAssist;
    private Integer averageNumDeaths;
    private Integer averageObjectivePlayerScore;
    private Integer averageTeamObjective;
    private Integer averageTotalPlayerScore;
    private Integer botGamesPlayed;
    private Integer killingSpree;
    private Integer maxAssists;
    private Integer maxChampionsKilled;
    private Integer maxCombatPlayerScore;
    private Integer maxLargestCriticalStrike;
    private Integer maxLargestKillingSpree;
    private Integer maxNodeCapture;
    private Integer maxNodeCaptureAssist;
    private Integer maxNodeNeutralize;
    private Integer maxNodeNeutralizeAssist;
    private Integer maxNumDeaths;
    private Integer maxObjectivePlayerScore;
    private Integer maxTeamObjective;
    private Integer maxTimePlayed;
    private Integer maxTimeSpentLiving;
    private Integer maxTotalPlayerScore;
    private Integer mostChampionKillsPerSession;
    private Integer mostSpellsCast;
    private Integer normalGamesPlayed;
    private Integer rankedPremadeGamesPlayed;
    private Integer rankedSoloGamesPlayed;
    private Integer totalAssists;
    private Integer totalChampionKills;
    private Integer totalDamageDealt;
    private Integer totalDamageTaken;
    private Integer totalDeathsPerSession;
    private Integer totalDoubleKills;
    private Integer totalFirstBlood;
    private Integer totalGoldEarned;
    private Integer totalHeal;
    private Integer totalMagicDamageDealt;
    private Integer totalMinionKills;
    private Integer totalNeutralMinionsKilled;
    private Integer totalNodeCapture;
    private Integer totalNodeNeutralize;
    private Integer totalPentaKills;
    private Integer totalPhysicalDamageDealt;
    private Integer totalQuadraKills;
    private Integer totalSessionsLost;
    private Integer totalSessionsPlayed;
    private Integer totalSessionsWon;
    private Integer totalTripleKills;
    private Integer totalTurretsKilled;
    private Integer totalUnrealKills;

    public Integer getAverageAssists() {
        return averageAssists;
    }

    public void setAverageAssists(Integer averageAssists) {
        this.averageAssists = averageAssists;
    }

    public Integer getAverageChampionsKilled() {
        return averageChampionsKilled;
    }

    public void setAverageChampionsKilled(Integer averageChampionsKilled) {
        this.averageChampionsKilled = averageChampionsKilled;
    }

    public Integer getAverageCombatPlayerScore() {
        return averageCombatPlayerScore;
    }

    public void setAverageCombatPlayerScore(Integer averageCombatPlayerScore) {
        this.averageCombatPlayerScore = averageCombatPlayerScore;
    }

    public Integer getAverageNodeCapture() {
        return averageNodeCapture;
    }

    public void setAverageNodeCapture(Integer averageNodeCapture) {
        this.averageNodeCapture = averageNodeCapture;
    }

    public Integer getAverageNodeCaptureAssist() {
        return averageNodeCaptureAssist;
    }

    public void setAverageNodeCaptureAssist(Integer averageNodeCaptureAssist) {
        this.averageNodeCaptureAssist = averageNodeCaptureAssist;
    }

    public Integer getAverageNodeNeutralize() {
        return averageNodeNeutralize;
    }

    public void setAverageNodeNeutralize(Integer averageNodeNeutralize) {
        this.averageNodeNeutralize = averageNodeNeutralize;
    }

    public Integer getAverageNodeNeutralizeAssist() {
        return averageNodeNeutralizeAssist;
    }

    public void setAverageNodeNeutralizeAssist(Integer averageNodeNeutralizeAssist) {
        this.averageNodeNeutralizeAssist = averageNodeNeutralizeAssist;
    }

    public Integer getAverageNumDeaths() {
        return averageNumDeaths;
    }

    public void setAverageNumDeaths(Integer averageNumDeaths) {
        this.averageNumDeaths = averageNumDeaths;
    }

    public Integer getAverageObjectivePlayerScore() {
        return averageObjectivePlayerScore;
    }

    public void setAverageObjectivePlayerScore(Integer averageObjectivePlayerScore) {
        this.averageObjectivePlayerScore = averageObjectivePlayerScore;
    }

    public Integer getAverageTeamObjective() {
        return averageTeamObjective;
    }

    public void setAverageTeamObjective(Integer averageTeamObjective) {
        this.averageTeamObjective = averageTeamObjective;
    }

    public Integer getAverageTotalPlayerScore() {
        return averageTotalPlayerScore;
    }

    public void setAverageTotalPlayerScore(Integer averageTotalPlayerScore) {
        this.averageTotalPlayerScore = averageTotalPlayerScore;
    }

    public Integer getBotGamesPlayed() {
        return botGamesPlayed;
    }

    public void setBotGamesPlayed(Integer botGamesPlayed) {
        this.botGamesPlayed = botGamesPlayed;
    }

    public Integer getKillingSpree() {
        return killingSpree;
    }

    public void setKillingSpree(Integer killingSpree) {
        this.killingSpree = killingSpree;
    }

    public Integer getMaxAssists() {
        return maxAssists;
    }

    public void setMaxAssists(Integer maxAssists) {
        this.maxAssists = maxAssists;
    }

    public Integer getMaxChampionsKilled() {
        return maxChampionsKilled;
    }

    public void setMaxChampionsKilled(Integer maxChampionsKilled) {
        this.maxChampionsKilled = maxChampionsKilled;
    }

    public Integer getMaxCombatPlayerScore() {
        return maxCombatPlayerScore;
    }

    public void setMaxCombatPlayerScore(Integer maxCombatPlayerScore) {
        this.maxCombatPlayerScore = maxCombatPlayerScore;
    }

    public Integer getMaxLargestCriticalStrike() {
        return maxLargestCriticalStrike;
    }

    public void setMaxLargestCriticalStrike(Integer maxLargestCriticalStrike) {
        this.maxLargestCriticalStrike = maxLargestCriticalStrike;
    }

    public Integer getMaxLargestKillingSpree() {
        return maxLargestKillingSpree;
    }

    public void setMaxLargestKillingSpree(Integer maxLargestKillingSpree) {
        this.maxLargestKillingSpree = maxLargestKillingSpree;
    }

    public Integer getMaxNodeCapture() {
        return maxNodeCapture;
    }

    public void setMaxNodeCapture(Integer maxNodeCapture) {
        this.maxNodeCapture = maxNodeCapture;
    }

    public Integer getMaxNodeCaptureAssist() {
        return maxNodeCaptureAssist;
    }

    public void setMaxNodeCaptureAssist(Integer maxNodeCaptureAssist) {
        this.maxNodeCaptureAssist = maxNodeCaptureAssist;
    }

    public Integer getMaxNodeNeutralize() {
        return maxNodeNeutralize;
    }

    public void setMaxNodeNeutralize(Integer maxNodeNeutralize) {
        this.maxNodeNeutralize = maxNodeNeutralize;
    }

    public Integer getMaxNodeNeutralizeAssist() {
        return maxNodeNeutralizeAssist;
    }

    public void setMaxNodeNeutralizeAssist(Integer maxNodeNeutralizeAssist) {
        this.maxNodeNeutralizeAssist = maxNodeNeutralizeAssist;
    }

    public Integer getMaxNumDeaths() {
        return maxNumDeaths;
    }

    public void setMaxNumDeaths(Integer maxNumDeaths) {
        this.maxNumDeaths = maxNumDeaths;
    }

    public Integer getMaxObjectivePlayerScore() {
        return maxObjectivePlayerScore;
    }

    public void setMaxObjectivePlayerScore(Integer maxObjectivePlayerScore) {
        this.maxObjectivePlayerScore = maxObjectivePlayerScore;
    }

    public Integer getMaxTeamObjective() {
        return maxTeamObjective;
    }

    public void setMaxTeamObjective(Integer maxTeamObjective) {
        this.maxTeamObjective = maxTeamObjective;
    }

    public Integer getMaxTimePlayed() {
        return maxTimePlayed;
    }

    public void setMaxTimePlayed(Integer maxTimePlayed) {
        this.maxTimePlayed = maxTimePlayed;
    }

    public Integer getMaxTimeSpentLiving() {
        return maxTimeSpentLiving;
    }

    public void setMaxTimeSpentLiving(Integer maxTimeSpentLiving) {
        this.maxTimeSpentLiving = maxTimeSpentLiving;
    }

    public Integer getMaxTotalPlayerScore() {
        return maxTotalPlayerScore;
    }

    public void setMaxTotalPlayerScore(Integer maxTotalPlayerScore) {
        this.maxTotalPlayerScore = maxTotalPlayerScore;
    }

    public Integer getMostChampionKillsPerSession() {
        return mostChampionKillsPerSession;
    }

    public void setMostChampionKillsPerSession(Integer mostChampionKillsPerSession) {
        this.mostChampionKillsPerSession = mostChampionKillsPerSession;
    }

    public Integer getMostSpellsCast() {
        return mostSpellsCast;
    }

    public void setMostSpellsCast(Integer mostSpellsCast) {
        this.mostSpellsCast = mostSpellsCast;
    }

    public Integer getNormalGamesPlayed() {
        return normalGamesPlayed;
    }

    public void setNormalGamesPlayed(Integer normalGamesPlayed) {
        this.normalGamesPlayed = normalGamesPlayed;
    }

    public Integer getRankedPremadeGamesPlayed() {
        return rankedPremadeGamesPlayed;
    }

    public void setRankedPremadeGamesPlayed(Integer rankedPremadeGamesPlayed) {
        this.rankedPremadeGamesPlayed = rankedPremadeGamesPlayed;
    }

    public Integer getRankedSoloGamesPlayed() {
        return rankedSoloGamesPlayed;
    }

    public void setRankedSoloGamesPlayed(Integer rankedSoloGamesPlayed) {
        this.rankedSoloGamesPlayed = rankedSoloGamesPlayed;
    }

    public Integer getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(Integer totalAssists) {
        this.totalAssists = totalAssists;
    }

    public Integer getTotalChampionKills() {
        return totalChampionKills;
    }

    public void setTotalChampionKills(Integer totalChampionKills) {
        this.totalChampionKills = totalChampionKills;
    }

    public Integer getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Integer getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getTotalDeathsPerSession() {
        return totalDeathsPerSession;
    }

    public void setTotalDeathsPerSession(Integer totalDeathsPerSession) {
        this.totalDeathsPerSession = totalDeathsPerSession;
    }

    public Integer getTotalDoubleKills() {
        return totalDoubleKills;
    }

    public void setTotalDoubleKills(Integer totalDoubleKills) {
        this.totalDoubleKills = totalDoubleKills;
    }

    public Integer getTotalFirstBlood() {
        return totalFirstBlood;
    }

    public void setTotalFirstBlood(Integer totalFirstBlood) {
        this.totalFirstBlood = totalFirstBlood;
    }

    public Integer getTotalGoldEarned() {
        return totalGoldEarned;
    }

    public void setTotalGoldEarned(Integer totalGoldEarned) {
        this.totalGoldEarned = totalGoldEarned;
    }

    public Integer getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalMagicDamageDealt() {
        return totalMagicDamageDealt;
    }

    public void setTotalMagicDamageDealt(Integer totalMagicDamageDealt) {
        this.totalMagicDamageDealt = totalMagicDamageDealt;
    }

    public Integer getTotalMinionKills() {
        return totalMinionKills;
    }

    public void setTotalMinionKills(Integer totalMinionKills) {
        this.totalMinionKills = totalMinionKills;
    }

    public Integer getTotalNeutralMinionsKilled() {
        return totalNeutralMinionsKilled;
    }

    public void setTotalNeutralMinionsKilled(Integer totalNeutralMinionsKilled) {
        this.totalNeutralMinionsKilled = totalNeutralMinionsKilled;
    }

    public Integer getTotalNodeCapture() {
        return totalNodeCapture;
    }

    public void setTotalNodeCapture(Integer totalNodeCapture) {
        this.totalNodeCapture = totalNodeCapture;
    }

    public Integer getTotalNodeNeutralize() {
        return totalNodeNeutralize;
    }

    public void setTotalNodeNeutralize(Integer totalNodeNeutralize) {
        this.totalNodeNeutralize = totalNodeNeutralize;
    }

    public Integer getTotalPentaKills() {
        return totalPentaKills;
    }

    public void setTotalPentaKills(Integer totalPentaKills) {
        this.totalPentaKills = totalPentaKills;
    }

    public Integer getTotalPhysicalDamageDealt() {
        return totalPhysicalDamageDealt;
    }

    public void setTotalPhysicalDamageDealt(Integer totalPhysicalDamageDealt) {
        this.totalPhysicalDamageDealt = totalPhysicalDamageDealt;
    }

    public Integer getTotalQuadraKills() {
        return totalQuadraKills;
    }

    public void setTotalQuadraKills(Integer totalQuadraKills) {
        this.totalQuadraKills = totalQuadraKills;
    }

    public Integer getTotalSessionsLost() {
        return totalSessionsLost;
    }

    public void setTotalSessionsLost(Integer totalSessionsLost) {
        this.totalSessionsLost = totalSessionsLost;
    }

    public Integer getTotalSessionsPlayed() {
        return totalSessionsPlayed;
    }

    public void setTotalSessionsPlayed(Integer totalSessionsPlayed) {
        this.totalSessionsPlayed = totalSessionsPlayed;
    }

    public Integer getTotalSessionsWon() {
        return totalSessionsWon;
    }

    public void setTotalSessionsWon(Integer totalSessionsWon) {
        this.totalSessionsWon = totalSessionsWon;
    }

    public Integer getTotalTripleKills() {
        return totalTripleKills;
    }

    public void setTotalTripleKills(Integer totalTripleKills) {
        this.totalTripleKills = totalTripleKills;
    }

    public Integer getTotalTurretsKilled() {
        return totalTurretsKilled;
    }

    public void setTotalTurretsKilled(Integer totalTurretsKilled) {
        this.totalTurretsKilled = totalTurretsKilled;
    }

    public Integer getTotalUnrealKills() {
        return totalUnrealKills;
    }

    public void setTotalUnrealKills(Integer totalUnrealKills) {
        this.totalUnrealKills = totalUnrealKills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregatedStatsDto)) {
            return false;
        }
        AggregatedStatsDto that = (AggregatedStatsDto) o;
        return Objects.equals(averageAssists, that.averageAssists) &&
            Objects.equals(averageChampionsKilled, that.averageChampionsKilled) &&
            Objects.equals(averageCombatPlayerScore, that.averageCombatPlayerScore) &&
            Objects.equals(averageNodeCapture, that.averageNodeCapture) &&
            Objects.equals(averageNodeCaptureAssist, that.averageNodeCaptureAssist) &&
            Objects.equals(averageNodeNeutralize, that.averageNodeNeutralize) &&
            Objects.equals(averageNodeNeutralizeAssist, that.averageNodeNeutralizeAssist) &&
            Objects.equals(averageNumDeaths, that.averageNumDeaths) &&
            Objects.equals(averageObjectivePlayerScore, that.averageObjectivePlayerScore) &&
            Objects.equals(averageTeamObjective, that.averageTeamObjective) &&
            Objects.equals(averageTotalPlayerScore, that.averageTotalPlayerScore) &&
            Objects.equals(botGamesPlayed, that.botGamesPlayed) &&
            Objects.equals(killingSpree, that.killingSpree) &&
            Objects.equals(maxAssists, that.maxAssists) &&
            Objects.equals(maxChampionsKilled, that.maxChampionsKilled) &&
            Objects.equals(maxCombatPlayerScore, that.maxCombatPlayerScore) &&
            Objects.equals(maxLargestCriticalStrike, that.maxLargestCriticalStrike) &&
            Objects.equals(maxLargestKillingSpree, that.maxLargestKillingSpree) &&
            Objects.equals(maxNodeCapture, that.maxNodeCapture) &&
            Objects.equals(maxNodeCaptureAssist, that.maxNodeCaptureAssist) &&
            Objects.equals(maxNodeNeutralize, that.maxNodeNeutralize) &&
            Objects.equals(maxNodeNeutralizeAssist, that.maxNodeNeutralizeAssist) &&
            Objects.equals(maxNumDeaths, that.maxNumDeaths) &&
            Objects.equals(maxObjectivePlayerScore, that.maxObjectivePlayerScore) &&
            Objects.equals(maxTeamObjective, that.maxTeamObjective) &&
            Objects.equals(maxTimePlayed, that.maxTimePlayed) &&
            Objects.equals(maxTimeSpentLiving, that.maxTimeSpentLiving) &&
            Objects.equals(maxTotalPlayerScore, that.maxTotalPlayerScore) &&
            Objects.equals(mostChampionKillsPerSession, that.mostChampionKillsPerSession) &&
            Objects.equals(mostSpellsCast, that.mostSpellsCast) &&
            Objects.equals(normalGamesPlayed, that.normalGamesPlayed) &&
            Objects.equals(rankedPremadeGamesPlayed, that.rankedPremadeGamesPlayed) &&
            Objects.equals(rankedSoloGamesPlayed, that.rankedSoloGamesPlayed) &&
            Objects.equals(totalAssists, that.totalAssists) &&
            Objects.equals(totalChampionKills, that.totalChampionKills) &&
            Objects.equals(totalDamageDealt, that.totalDamageDealt) &&
            Objects.equals(totalDamageTaken, that.totalDamageTaken) &&
            Objects.equals(totalDeathsPerSession, that.totalDeathsPerSession) &&
            Objects.equals(totalDoubleKills, that.totalDoubleKills) &&
            Objects.equals(totalFirstBlood, that.totalFirstBlood) &&
            Objects.equals(totalGoldEarned, that.totalGoldEarned) &&
            Objects.equals(totalHeal, that.totalHeal) &&
            Objects.equals(totalMagicDamageDealt, that.totalMagicDamageDealt) &&
            Objects.equals(totalMinionKills, that.totalMinionKills) &&
            Objects.equals(totalNeutralMinionsKilled, that.totalNeutralMinionsKilled) &&
            Objects.equals(totalNodeCapture, that.totalNodeCapture) &&
            Objects.equals(totalNodeNeutralize, that.totalNodeNeutralize) &&
            Objects.equals(totalPentaKills, that.totalPentaKills) &&
            Objects.equals(totalPhysicalDamageDealt, that.totalPhysicalDamageDealt) &&
            Objects.equals(totalQuadraKills, that.totalQuadraKills) &&
            Objects.equals(totalSessionsLost, that.totalSessionsLost) &&
            Objects.equals(totalSessionsPlayed, that.totalSessionsPlayed) &&
            Objects.equals(totalSessionsWon, that.totalSessionsWon) &&
            Objects.equals(totalTripleKills, that.totalTripleKills) &&
            Objects.equals(totalTurretsKilled, that.totalTurretsKilled) &&
            Objects.equals(totalUnrealKills, that.totalUnrealKills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageAssists, averageChampionsKilled, averageCombatPlayerScore, averageNodeCapture, averageNodeCaptureAssist, averageNodeNeutralize, averageNodeNeutralizeAssist, averageNumDeaths, averageObjectivePlayerScore, averageTeamObjective, averageTotalPlayerScore, botGamesPlayed, killingSpree, maxAssists, maxChampionsKilled, maxCombatPlayerScore, maxLargestCriticalStrike, maxLargestKillingSpree, maxNodeCapture, maxNodeCaptureAssist, maxNodeNeutralize, maxNodeNeutralizeAssist, maxNumDeaths, maxObjectivePlayerScore, maxTeamObjective, maxTimePlayed, maxTimeSpentLiving, maxTotalPlayerScore, mostChampionKillsPerSession, mostSpellsCast, normalGamesPlayed, rankedPremadeGamesPlayed, rankedSoloGamesPlayed, totalAssists, totalChampionKills, totalDamageDealt, totalDamageTaken, totalDeathsPerSession, totalDoubleKills, totalFirstBlood, totalGoldEarned, totalHeal, totalMagicDamageDealt, totalMinionKills, totalNeutralMinionsKilled, totalNodeCapture, totalNodeNeutralize, totalPentaKills, totalPhysicalDamageDealt, totalQuadraKills, totalSessionsLost, totalSessionsPlayed, totalSessionsWon, totalTripleKills, totalTurretsKilled, totalUnrealKills);
    }

    @Override
    public String toString() {
        return "AggregatedStatsDto{" +
            "averageAssists=" + averageAssists +
            ", averageChampionsKilled=" + averageChampionsKilled +
            ", averageCombatPlayerScore=" + averageCombatPlayerScore +
            ", averageNodeCapture=" + averageNodeCapture +
            ", averageNodeCaptureAssist=" + averageNodeCaptureAssist +
            ", averageNodeNeutralize=" + averageNodeNeutralize +
            ", averageNodeNeutralizeAssist=" + averageNodeNeutralizeAssist +
            ", averageNumDeaths=" + averageNumDeaths +
            ", averageObjectivePlayerScore=" + averageObjectivePlayerScore +
            ", averageTeamObjective=" + averageTeamObjective +
            ", averageTotalPlayerScore=" + averageTotalPlayerScore +
            ", botGamesPlayed=" + botGamesPlayed +
            ", killingSpree=" + killingSpree +
            ", maxAssists=" + maxAssists +
            ", maxChampionsKilled=" + maxChampionsKilled +
            ", maxCombatPlayerScore=" + maxCombatPlayerScore +
            ", maxLargestCriticalStrike=" + maxLargestCriticalStrike +
            ", maxLargestKillingSpree=" + maxLargestKillingSpree +
            ", maxNodeCapture=" + maxNodeCapture +
            ", maxNodeCaptureAssist=" + maxNodeCaptureAssist +
            ", maxNodeNeutralize=" + maxNodeNeutralize +
            ", maxNodeNeutralizeAssist=" + maxNodeNeutralizeAssist +
            ", maxNumDeaths=" + maxNumDeaths +
            ", maxObjectivePlayerScore=" + maxObjectivePlayerScore +
            ", maxTeamObjective=" + maxTeamObjective +
            ", maxTimePlayed=" + maxTimePlayed +
            ", maxTimeSpentLiving=" + maxTimeSpentLiving +
            ", maxTotalPlayerScore=" + maxTotalPlayerScore +
            ", mostChampionKillsPerSession=" + mostChampionKillsPerSession +
            ", mostSpellsCast=" + mostSpellsCast +
            ", normalGamesPlayed=" + normalGamesPlayed +
            ", rankedPremadeGamesPlayed=" + rankedPremadeGamesPlayed +
            ", rankedSoloGamesPlayed=" + rankedSoloGamesPlayed +
            ", totalAssists=" + totalAssists +
            ", totalChampionKills=" + totalChampionKills +
            ", totalDamageDealt=" + totalDamageDealt +
            ", totalDamageTaken=" + totalDamageTaken +
            ", totalDeathsPerSession=" + totalDeathsPerSession +
            ", totalDoubleKills=" + totalDoubleKills +
            ", totalFirstBlood=" + totalFirstBlood +
            ", totalGoldEarned=" + totalGoldEarned +
            ", totalHeal=" + totalHeal +
            ", totalMagicDamageDealt=" + totalMagicDamageDealt +
            ", totalMinionKills=" + totalMinionKills +
            ", totalNeutralMinionsKilled=" + totalNeutralMinionsKilled +
            ", totalNodeCapture=" + totalNodeCapture +
            ", totalNodeNeutralize=" + totalNodeNeutralize +
            ", totalPentaKills=" + totalPentaKills +
            ", totalPhysicalDamageDealt=" + totalPhysicalDamageDealt +
            ", totalQuadraKills=" + totalQuadraKills +
            ", totalSessionsLost=" + totalSessionsLost +
            ", totalSessionsPlayed=" + totalSessionsPlayed +
            ", totalSessionsWon=" + totalSessionsWon +
            ", totalTripleKills=" + totalTripleKills +
            ", totalTurretsKilled=" + totalTurretsKilled +
            ", totalUnrealKills=" + totalUnrealKills +
            '}';
    }
}
