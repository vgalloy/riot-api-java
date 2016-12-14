package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ParticipantStats implements Serializable {

    private static final long serialVersionUID = 4247865376360704912L;

    private Long assists;
    private Long champLevel;
    private Long combatPlayerScore;
    private Long deaths;
    private Long doubleKills;
    private Boolean firstBloodAssist;
    private Boolean firstBloodKill;
    private Boolean firstInhibitorAssist;
    private Boolean firstInhibitorKill;
    private Boolean firstTowerAssist;
    private Boolean firstTowerKill;
    private Long goldEarned;
    private Long goldSpent;
    private Long inhibitorKills;
    private Long item0;
    private Long item1;
    private Long item2;
    private Long item3;
    private Long item4;
    private Long item5;
    private Long item6;
    private Long killingSprees;
    private Long kills;
    private Long largestCriticalStrike;
    private Long largestKillingSpree;
    private Long largestMultiKill;
    private Long magicDamageDealt;
    private Long magicDamageDealtToChampions;
    private Long magicDamageTaken;
    private Long minionsKilled;
    private Long neutralMinionsKilled;
    private Long neutralMinionsKilledEnemyJungle;
    private Long neutralMinionsKilledTeamJungle;
    private Long nodeCapture;
    private Long nodeCaptureAssist;
    private Long nodeNeutralize;
    private Long nodeNeutralizeAssist;
    private Long objectivePlayerScore;
    private Long pentaKills;
    private Long physicalDamageDealt;
    private Long physicalDamageDealtToChampions;
    private Long physicalDamageTaken;
    private Long quadraKills;
    private Long sightWardsBoughtInGame;
    private Long teamObjective;
    private Long totalDamageDealt;
    private Long totalDamageDealtToChampions;
    private Long totalDamageTaken;
    private Long totalHeal;
    private Long totalPlayerScore;
    private Long totalScoreRank;
    private Long totalTimeCrowdControlDealt;
    private Long totalUnitsHealed;
    private Long towerKills;
    private Long tripleKills;
    private Long trueDamageDealt;
    private Long trueDamageDealtToChampions;
    private Long trueDamageTaken;
    private Long unrealKills;
    private Long visionWardsBoughtInGame;
    private Long wardsKilled;
    private Long wardsPlaced;
    private Boolean winner;

    public Long getAssists() {
        return assists;
    }

    public void setAssists(Long assists) {
        this.assists = assists;
    }

    public Long getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(Long champLevel) {
        this.champLevel = champLevel;
    }

    public Long getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(Long combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public Long getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Long doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(Boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public Boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(Boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public Boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(Boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public Boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(Boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public Boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(Boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public Boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(Boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public Long getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Long goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Long getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Long goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Long getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Long getItem0() {
        return item0;
    }

    public void setItem0(Long item0) {
        this.item0 = item0;
    }

    public Long getItem1() {
        return item1;
    }

    public void setItem1(Long item1) {
        this.item1 = item1;
    }

    public Long getItem2() {
        return item2;
    }

    public void setItem2(Long item2) {
        this.item2 = item2;
    }

    public Long getItem3() {
        return item3;
    }

    public void setItem3(Long item3) {
        this.item3 = item3;
    }

    public Long getItem4() {
        return item4;
    }

    public void setItem4(Long item4) {
        this.item4 = item4;
    }

    public Long getItem5() {
        return item5;
    }

    public void setItem5(Long item5) {
        this.item5 = item5;
    }

    public Long getItem6() {
        return item6;
    }

    public void setItem6(Long item6) {
        this.item6 = item6;
    }

    public Long getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(Long killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Long getKills() {
        return kills;
    }

    public void setKills(Long kills) {
        this.kills = kills;
    }

    public Long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(Long largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Long getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(Long largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(Long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public Long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(Long magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Long getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(Long minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public Long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Long neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Long getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public void setNeutralMinionsKilledEnemyJungle(Long neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    public Long getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    public void setNeutralMinionsKilledTeamJungle(Long neutralMinionsKilledTeamJungle) {
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
    }

    public Long getNodeCapture() {
        return nodeCapture;
    }

    public void setNodeCapture(Long nodeCapture) {
        this.nodeCapture = nodeCapture;
    }

    public Long getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    public void setNodeCaptureAssist(Long nodeCaptureAssist) {
        this.nodeCaptureAssist = nodeCaptureAssist;
    }

    public Long getNodeNeutralize() {
        return nodeNeutralize;
    }

    public void setNodeNeutralize(Long nodeNeutralize) {
        this.nodeNeutralize = nodeNeutralize;
    }

    public Long getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    public void setNodeNeutralizeAssist(Long nodeNeutralizeAssist) {
        this.nodeNeutralizeAssist = nodeNeutralizeAssist;
    }

    public Long getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(Long objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public Long getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Long pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(Long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public Long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Long getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Long quadraKills) {
        this.quadraKills = quadraKills;
    }

    public Long getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(Long sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public Long getTeamObjective() {
        return teamObjective;
    }

    public void setTeamObjective(Long teamObjective) {
        this.teamObjective = teamObjective;
    }

    public Long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Long getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(Long totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public Long getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(Long totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public Long getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(Long totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public Long getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Long totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Long getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(Long towerKills) {
        this.towerKills = towerKills;
    }

    public Long getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(Long tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(Long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public Long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Long getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(Long unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(Long visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public Long getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(Long wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public Long getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(Long wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public Boolean isWinner() {
        return winner;
    }

    public void setWinner(Boolean winner) {
        this.winner = winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParticipantStats)) {
            return false;
        }
        ParticipantStats that = (ParticipantStats) o;
        return Objects.equals(assists, that.assists) &&
                Objects.equals(champLevel, that.champLevel) &&
                Objects.equals(combatPlayerScore, that.combatPlayerScore) &&
                Objects.equals(deaths, that.deaths) &&
                Objects.equals(doubleKills, that.doubleKills) &&
                Objects.equals(firstBloodAssist, that.firstBloodAssist) &&
                Objects.equals(firstBloodKill, that.firstBloodKill) &&
                Objects.equals(firstInhibitorAssist, that.firstInhibitorAssist) &&
                Objects.equals(firstInhibitorKill, that.firstInhibitorKill) &&
                Objects.equals(firstTowerAssist, that.firstTowerAssist) &&
                Objects.equals(firstTowerKill, that.firstTowerKill) &&
                Objects.equals(goldEarned, that.goldEarned) &&
                Objects.equals(goldSpent, that.goldSpent) &&
                Objects.equals(inhibitorKills, that.inhibitorKills) &&
                Objects.equals(item0, that.item0) &&
                Objects.equals(item1, that.item1) &&
                Objects.equals(item2, that.item2) &&
                Objects.equals(item3, that.item3) &&
                Objects.equals(item4, that.item4) &&
                Objects.equals(item5, that.item5) &&
                Objects.equals(item6, that.item6) &&
                Objects.equals(killingSprees, that.killingSprees) &&
                Objects.equals(kills, that.kills) &&
                Objects.equals(largestCriticalStrike, that.largestCriticalStrike) &&
                Objects.equals(largestKillingSpree, that.largestKillingSpree) &&
                Objects.equals(largestMultiKill, that.largestMultiKill) &&
                Objects.equals(magicDamageDealt, that.magicDamageDealt) &&
                Objects.equals(magicDamageDealtToChampions, that.magicDamageDealtToChampions) &&
                Objects.equals(magicDamageTaken, that.magicDamageTaken) &&
                Objects.equals(minionsKilled, that.minionsKilled) &&
                Objects.equals(neutralMinionsKilled, that.neutralMinionsKilled) &&
                Objects.equals(neutralMinionsKilledEnemyJungle, that.neutralMinionsKilledEnemyJungle) &&
                Objects.equals(neutralMinionsKilledTeamJungle, that.neutralMinionsKilledTeamJungle) &&
                Objects.equals(nodeCapture, that.nodeCapture) &&
                Objects.equals(nodeCaptureAssist, that.nodeCaptureAssist) &&
                Objects.equals(nodeNeutralize, that.nodeNeutralize) &&
                Objects.equals(nodeNeutralizeAssist, that.nodeNeutralizeAssist) &&
                Objects.equals(objectivePlayerScore, that.objectivePlayerScore) &&
                Objects.equals(pentaKills, that.pentaKills) &&
                Objects.equals(physicalDamageDealt, that.physicalDamageDealt) &&
                Objects.equals(physicalDamageDealtToChampions, that.physicalDamageDealtToChampions) &&
                Objects.equals(physicalDamageTaken, that.physicalDamageTaken) &&
                Objects.equals(quadraKills, that.quadraKills) &&
                Objects.equals(sightWardsBoughtInGame, that.sightWardsBoughtInGame) &&
                Objects.equals(teamObjective, that.teamObjective) &&
                Objects.equals(totalDamageDealt, that.totalDamageDealt) &&
                Objects.equals(totalDamageDealtToChampions, that.totalDamageDealtToChampions) &&
                Objects.equals(totalDamageTaken, that.totalDamageTaken) &&
                Objects.equals(totalHeal, that.totalHeal) &&
                Objects.equals(totalPlayerScore, that.totalPlayerScore) &&
                Objects.equals(totalScoreRank, that.totalScoreRank) &&
                Objects.equals(totalTimeCrowdControlDealt, that.totalTimeCrowdControlDealt) &&
                Objects.equals(totalUnitsHealed, that.totalUnitsHealed) &&
                Objects.equals(towerKills, that.towerKills) &&
                Objects.equals(tripleKills, that.tripleKills) &&
                Objects.equals(trueDamageDealt, that.trueDamageDealt) &&
                Objects.equals(trueDamageDealtToChampions, that.trueDamageDealtToChampions) &&
                Objects.equals(trueDamageTaken, that.trueDamageTaken) &&
                Objects.equals(unrealKills, that.unrealKills) &&
                Objects.equals(visionWardsBoughtInGame, that.visionWardsBoughtInGame) &&
                Objects.equals(wardsKilled, that.wardsKilled) &&
                Objects.equals(wardsPlaced, that.wardsPlaced) &&
                Objects.equals(winner, that.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assists, champLevel, combatPlayerScore, deaths, doubleKills, firstBloodAssist, firstBloodKill, firstInhibitorAssist, firstInhibitorKill, firstTowerAssist, firstTowerKill, goldEarned, goldSpent, inhibitorKills, item0, item1, item2, item3, item4, item5, item6, killingSprees, kills, largestCriticalStrike, largestKillingSpree, largestMultiKill, magicDamageDealt, magicDamageDealtToChampions, magicDamageTaken, minionsKilled, neutralMinionsKilled, neutralMinionsKilledEnemyJungle, neutralMinionsKilledTeamJungle, nodeCapture, nodeCaptureAssist, nodeNeutralize, nodeNeutralizeAssist, objectivePlayerScore, pentaKills, physicalDamageDealt, physicalDamageDealtToChampions, physicalDamageTaken, quadraKills, sightWardsBoughtInGame, teamObjective, totalDamageDealt, totalDamageDealtToChampions, totalDamageTaken, totalHeal, totalPlayerScore, totalScoreRank, totalTimeCrowdControlDealt, totalUnitsHealed, towerKills, tripleKills, trueDamageDealt, trueDamageDealtToChampions, trueDamageTaken, unrealKills, visionWardsBoughtInGame, wardsKilled, wardsPlaced, winner);
    }

    @Override
    public String toString() {
        return "ParticipantStats{" +
                "assists=" + assists +
                ", champLevel=" + champLevel +
                ", combatPlayerScore=" + combatPlayerScore +
                ", deaths=" + deaths +
                ", doubleKills=" + doubleKills +
                ", firstBloodAssist=" + firstBloodAssist +
                ", firstBloodKill=" + firstBloodKill +
                ", firstInhibitorAssist=" + firstInhibitorAssist +
                ", firstInhibitorKill=" + firstInhibitorKill +
                ", firstTowerAssist=" + firstTowerAssist +
                ", firstTowerKill=" + firstTowerKill +
                ", goldEarned=" + goldEarned +
                ", goldSpent=" + goldSpent +
                ", inhibitorKills=" + inhibitorKills +
                ", item0=" + item0 +
                ", item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                ", item4=" + item4 +
                ", item5=" + item5 +
                ", item6=" + item6 +
                ", killingSprees=" + killingSprees +
                ", kills=" + kills +
                ", largestCriticalStrike=" + largestCriticalStrike +
                ", largestKillingSpree=" + largestKillingSpree +
                ", largestMultiKill=" + largestMultiKill +
                ", magicDamageDealt=" + magicDamageDealt +
                ", magicDamageDealtToChampions=" + magicDamageDealtToChampions +
                ", magicDamageTaken=" + magicDamageTaken +
                ", minionsKilled=" + minionsKilled +
                ", neutralMinionsKilled=" + neutralMinionsKilled +
                ", neutralMinionsKilledEnemyJungle=" + neutralMinionsKilledEnemyJungle +
                ", neutralMinionsKilledTeamJungle=" + neutralMinionsKilledTeamJungle +
                ", nodeCapture=" + nodeCapture +
                ", nodeCaptureAssist=" + nodeCaptureAssist +
                ", nodeNeutralize=" + nodeNeutralize +
                ", nodeNeutralizeAssist=" + nodeNeutralizeAssist +
                ", objectivePlayerScore=" + objectivePlayerScore +
                ", pentaKills=" + pentaKills +
                ", physicalDamageDealt=" + physicalDamageDealt +
                ", physicalDamageDealtToChampions=" + physicalDamageDealtToChampions +
                ", physicalDamageTaken=" + physicalDamageTaken +
                ", quadraKills=" + quadraKills +
                ", sightWardsBoughtInGame=" + sightWardsBoughtInGame +
                ", teamObjective=" + teamObjective +
                ", totalDamageDealt=" + totalDamageDealt +
                ", totalDamageDealtToChampions=" + totalDamageDealtToChampions +
                ", totalDamageTaken=" + totalDamageTaken +
                ", totalHeal=" + totalHeal +
                ", totalPlayerScore=" + totalPlayerScore +
                ", totalScoreRank=" + totalScoreRank +
                ", totalTimeCrowdControlDealt=" + totalTimeCrowdControlDealt +
                ", totalUnitsHealed=" + totalUnitsHealed +
                ", towerKills=" + towerKills +
                ", tripleKills=" + tripleKills +
                ", trueDamageDealt=" + trueDamageDealt +
                ", trueDamageDealtToChampions=" + trueDamageDealtToChampions +
                ", trueDamageTaken=" + trueDamageTaken +
                ", unrealKills=" + unrealKills +
                ", visionWardsBoughtInGame=" + visionWardsBoughtInGame +
                ", wardsKilled=" + wardsKilled +
                ", wardsPlaced=" + wardsPlaced +
                ", winner=" + winner +
                '}';
    }
}
