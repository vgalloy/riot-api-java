package vgalloy.riot.api.api.dto.mach;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantStats implements Serializable {

    private static final long serialVersionUID = 4247865376360704912L;

    private long assists;
    private long champLevel;
    private long combatPlayerScore;
    private long deaths;
    private long doubleKills;
    private boolean firstBloodAssist;
    private boolean firstBloodKill;
    private boolean firstInhibitorAssist;
    private boolean firstInhibitorKill;
    private boolean firstTowerAssist;
    private boolean firstTowerKill;
    private long goldEarned;
    private long goldSpent;
    private long inhibitorKills;
    private long item0;
    private long item1;
    private long item2;
    private long item3;
    private long item4;
    private long item5;
    private long item6;
    private long killingSprees;
    private long kills;
    private long largestCriticalStrike;
    private long largestKillingSpree;
    private long largestMultiKill;
    private long magicDamageDealt;
    private long magicDamageDealtToChampions;
    private long magicDamageTaken;
    private long minionsKilled;
    private long neutralMinionsKilled;
    private long neutralMinionsKilledEnemyJungle;
    private long neutralMinionsKilledTeamJungle;
    private long nodeCapture;
    private long nodeCaptureAssist;
    private long nodeNeutralize;
    private long nodeNeutralizeAssist;
    private long objectivePlayerScore;
    private long pentaKills;
    private long physicalDamageDealt;
    private long physicalDamageDealtToChampions;
    private long physicalDamageTaken;
    private long quadraKills;
    private long sightWardsBoughtInGame;
    private long teamObjective;
    private long totalDamageDealt;
    private long totalDamageDealtToChampions;
    private long totalDamageTaken;
    private long totalHeal;
    private long totalPlayerScore;
    private long totalScoreRank;
    private long totalTimeCrowdControlDealt;
    private long totalUnitsHealed;
    private long towerKills;
    private long tripleKills;
    private long trueDamageDealt;
    private long trueDamageDealtToChampions;
    private long trueDamageTaken;
    private long unrealKills;
    private long visionWardsBoughtInGame;
    private long wardsKilled;
    private long wardsPlaced;
    private boolean winner;

    public long getAssists() {
        return assists;
    }

    public void setAssists(long assists) {
        this.assists = assists;
    }

    public long getChampLevel() {
        return champLevel;
    }

    public void setChampLevel(long champLevel) {
        this.champLevel = champLevel;
    }

    public long getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(long combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(long doubleKills) {
        this.doubleKills = doubleKills;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public void setFirstBloodAssist(boolean firstBloodAssist) {
        this.firstBloodAssist = firstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public void setFirstBloodKill(boolean firstBloodKill) {
        this.firstBloodKill = firstBloodKill;
    }

    public boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public void setFirstInhibitorAssist(boolean firstInhibitorAssist) {
        this.firstInhibitorAssist = firstInhibitorAssist;
    }

    public boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public void setFirstInhibitorKill(boolean firstInhibitorKill) {
        this.firstInhibitorKill = firstInhibitorKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public void setFirstTowerAssist(boolean firstTowerAssist) {
        this.firstTowerAssist = firstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public void setFirstTowerKill(boolean firstTowerKill) {
        this.firstTowerKill = firstTowerKill;
    }

    public long getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(long goldEarned) {
        this.goldEarned = goldEarned;
    }

    public long getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(long goldSpent) {
        this.goldSpent = goldSpent;
    }

    public long getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(long inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public long getItem0() {
        return item0;
    }

    public void setItem0(long item0) {
        this.item0 = item0;
    }

    public long getItem1() {
        return item1;
    }

    public void setItem1(long item1) {
        this.item1 = item1;
    }

    public long getItem2() {
        return item2;
    }

    public void setItem2(long item2) {
        this.item2 = item2;
    }

    public long getItem3() {
        return item3;
    }

    public void setItem3(long item3) {
        this.item3 = item3;
    }

    public long getItem4() {
        return item4;
    }

    public void setItem4(long item4) {
        this.item4 = item4;
    }

    public long getItem5() {
        return item5;
    }

    public void setItem5(long item5) {
        this.item5 = item5;
    }

    public long getItem6() {
        return item6;
    }

    public void setItem6(long item6) {
        this.item6 = item6;
    }

    public long getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(long killingSprees) {
        this.killingSprees = killingSprees;
    }

    public long getKills() {
        return kills;
    }

    public void setKills(long kills) {
        this.kills = kills;
    }

    public long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(long largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(long largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public long getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(long largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public void setMagicDamageDealt(long magicDamageDealt) {
        this.magicDamageDealt = magicDamageDealt;
    }

    public long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(long magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(long magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public long getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(long minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(long neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public long getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public void setNeutralMinionsKilledEnemyJungle(long neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    public long getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    public void setNeutralMinionsKilledTeamJungle(long neutralMinionsKilledTeamJungle) {
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
    }

    public long getNodeCapture() {
        return nodeCapture;
    }

    public void setNodeCapture(long nodeCapture) {
        this.nodeCapture = nodeCapture;
    }

    public long getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    public void setNodeCaptureAssist(long nodeCaptureAssist) {
        this.nodeCaptureAssist = nodeCaptureAssist;
    }

    public long getNodeNeutralize() {
        return nodeNeutralize;
    }

    public void setNodeNeutralize(long nodeNeutralize) {
        this.nodeNeutralize = nodeNeutralize;
    }

    public long getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    public void setNodeNeutralizeAssist(long nodeNeutralizeAssist) {
        this.nodeNeutralizeAssist = nodeNeutralizeAssist;
    }

    public long getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(long objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public long getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(long pentaKills) {
        this.pentaKills = pentaKills;
    }

    public long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public void setPhysicalDamageDealt(long physicalDamageDealt) {
        this.physicalDamageDealt = physicalDamageDealt;
    }

    public long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(long physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(long physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public long getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(long quadraKills) {
        this.quadraKills = quadraKills;
    }

    public long getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public void setSightWardsBoughtInGame(long sightWardsBoughtInGame) {
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
    }

    public long getTeamObjective() {
        return teamObjective;
    }

    public void setTeamObjective(long teamObjective) {
        this.teamObjective = teamObjective;
    }

    public long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(long totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(long totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(long totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public long getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(long totalHeal) {
        this.totalHeal = totalHeal;
    }

    public long getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(long totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public long getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(long totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public long getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(long totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public long getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(long totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public long getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(long towerKills) {
        this.towerKills = towerKills;
    }

    public long getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(long tripleKills) {
        this.tripleKills = tripleKills;
    }

    public long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public void setTrueDamageDealt(long trueDamageDealt) {
        this.trueDamageDealt = trueDamageDealt;
    }

    public long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(long trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(long trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public long getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(long unrealKills) {
        this.unrealKills = unrealKills;
    }

    public long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public void setVisionWardsBoughtInGame(long visionWardsBoughtInGame) {
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
    }

    public long getWardsKilled() {
        return wardsKilled;
    }

    public void setWardsKilled(long wardsKilled) {
        this.wardsKilled = wardsKilled;
    }

    public long getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(long wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantStats that = (ParticipantStats) o;
        return assists == that.assists &&
                champLevel == that.champLevel &&
                combatPlayerScore == that.combatPlayerScore &&
                deaths == that.deaths &&
                doubleKills == that.doubleKills &&
                firstBloodAssist == that.firstBloodAssist &&
                firstBloodKill == that.firstBloodKill &&
                firstInhibitorAssist == that.firstInhibitorAssist &&
                firstInhibitorKill == that.firstInhibitorKill &&
                firstTowerAssist == that.firstTowerAssist &&
                firstTowerKill == that.firstTowerKill &&
                goldEarned == that.goldEarned &&
                goldSpent == that.goldSpent &&
                inhibitorKills == that.inhibitorKills &&
                item0 == that.item0 &&
                item1 == that.item1 &&
                item2 == that.item2 &&
                item3 == that.item3 &&
                item4 == that.item4 &&
                item5 == that.item5 &&
                item6 == that.item6 &&
                killingSprees == that.killingSprees &&
                kills == that.kills &&
                largestCriticalStrike == that.largestCriticalStrike &&
                largestKillingSpree == that.largestKillingSpree &&
                largestMultiKill == that.largestMultiKill &&
                magicDamageDealt == that.magicDamageDealt &&
                magicDamageDealtToChampions == that.magicDamageDealtToChampions &&
                magicDamageTaken == that.magicDamageTaken &&
                minionsKilled == that.minionsKilled &&
                neutralMinionsKilled == that.neutralMinionsKilled &&
                neutralMinionsKilledEnemyJungle == that.neutralMinionsKilledEnemyJungle &&
                neutralMinionsKilledTeamJungle == that.neutralMinionsKilledTeamJungle &&
                nodeCapture == that.nodeCapture &&
                nodeCaptureAssist == that.nodeCaptureAssist &&
                nodeNeutralize == that.nodeNeutralize &&
                nodeNeutralizeAssist == that.nodeNeutralizeAssist &&
                objectivePlayerScore == that.objectivePlayerScore &&
                pentaKills == that.pentaKills &&
                physicalDamageDealt == that.physicalDamageDealt &&
                physicalDamageDealtToChampions == that.physicalDamageDealtToChampions &&
                physicalDamageTaken == that.physicalDamageTaken &&
                quadraKills == that.quadraKills &&
                sightWardsBoughtInGame == that.sightWardsBoughtInGame &&
                teamObjective == that.teamObjective &&
                totalDamageDealt == that.totalDamageDealt &&
                totalDamageDealtToChampions == that.totalDamageDealtToChampions &&
                totalDamageTaken == that.totalDamageTaken &&
                totalHeal == that.totalHeal &&
                totalPlayerScore == that.totalPlayerScore &&
                totalScoreRank == that.totalScoreRank &&
                totalTimeCrowdControlDealt == that.totalTimeCrowdControlDealt &&
                totalUnitsHealed == that.totalUnitsHealed &&
                towerKills == that.towerKills &&
                tripleKills == that.tripleKills &&
                trueDamageDealt == that.trueDamageDealt &&
                trueDamageDealtToChampions == that.trueDamageDealtToChampions &&
                trueDamageTaken == that.trueDamageTaken &&
                unrealKills == that.unrealKills &&
                visionWardsBoughtInGame == that.visionWardsBoughtInGame &&
                wardsKilled == that.wardsKilled &&
                wardsPlaced == that.wardsPlaced &&
                winner == that.winner;
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