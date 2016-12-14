package vgalloy.riot.api.api.dto.game;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class RawStatsDto implements Serializable {

    private static final long serialVersionUID = 4329512156651818535L;

    private Integer assists;
    private Integer barracksKilled;
    private Integer bountyLevel;
    private Integer championsKilled;
    private Integer combatPlayerScore;
    private Integer consumablesPurchased;
    private Integer damageDealtPlayer;
    private Integer doubleKills;
    private Integer firstBlood;
    private Integer gold;
    private Integer goldEarned;
    private Integer goldSpent;
    private Integer item0;
    private Integer item1;
    private Integer item2;
    private Integer item3;
    private Integer item4;
    private Integer item5;
    private Integer item6;
    private Integer itemsPurchased;
    private Integer killingSprees;
    private Integer largestCriticalStrike;
    private Integer largestKillingSpree;
    private Integer largestMultiKill;
    private Integer legendaryItemsCreated;
    private Integer level;
    private Integer magicDamageDealtPlayer;
    private Integer magicDamageDealtToChampions;
    private Integer magicDamageTaken;
    private Integer minionsDenied;
    private Integer minionsKilled;
    private Integer neutralMinionsKilled;
    private Integer neutralMinionsKilledEnemyJungle;
    private Integer neutralMinionsKilledYourJungle;
    private Boolean nexusKilled;
    private Integer nodeCapture;
    private Integer nodeCaptureAssist;
    private Integer nodeNeutralize;
    private Integer nodeNeutralizeAssist;
    private Integer numDeaths;
    private Integer numItemsBought;
    private Integer objectivePlayerScore;
    private Integer pentaKills;
    private Integer physicalDamageDealtPlayer;
    private Integer physicalDamageDealtToChampions;
    private Integer physicalDamageTaken;
    private Integer playerPosition;
    private Integer playerRole;
    private Integer playerScore0;
    private Integer playerScore1;
    private Integer playerScore2;
    private Integer playerScore3;
    private Integer playerScore4;
    private Integer playerScore5;
    private Integer playerScore6;
    private Integer playerScore7;
    private Integer playerScore8;
    private Integer playerScore9;
    private Integer quadraKills;
    private Integer sightWardsBought;
    private Integer spell1Cast;
    private Integer spell2Cast;
    private Integer spell3Cast;
    private Integer spell4Cast;
    private Integer summonSpell1Cast;
    private Integer summonSpell2Cast;
    private Integer superMonsterKilled;
    private Integer team;
    private Integer teamObjective;
    private Integer timePlayed;
    private Integer totalDamageDealt;
    private Integer totalDamageDealtToBuildings;
    private Integer totalDamageDealtToChampions;
    private Integer totalDamageTaken;
    private Integer totalHeal;
    private Integer totalPlayerScore;
    private Integer totalScoreRank;
    private Integer totalTimeCrowdControlDealt;
    private Integer totalUnitsHealed;
    private Integer tripleKills;
    private Integer trueDamageDealtPlayer;
    private Integer trueDamageDealtToChampions;
    private Integer trueDamageTaken;
    private Integer turretsKilled;
    private Integer unrealKills;
    private Integer victoryPointTotal;
    private Integer visionWardsBought;
    private Integer wardKilled;
    private Integer wardPlaced;
    private Boolean win;

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getBarracksKilled() {
        return barracksKilled;
    }

    public void setBarracksKilled(Integer barracksKilled) {
        this.barracksKilled = barracksKilled;
    }

    public Integer getBountyLevel() {
        return bountyLevel;
    }

    public void setBountyLevel(Integer bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    public Integer getChampionsKilled() {
        return championsKilled;
    }

    public void setChampionsKilled(Integer championsKilled) {
        this.championsKilled = championsKilled;
    }

    public Integer getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public void setCombatPlayerScore(Integer combatPlayerScore) {
        this.combatPlayerScore = combatPlayerScore;
    }

    public Integer getConsumablesPurchased() {
        return consumablesPurchased;
    }

    public void setConsumablesPurchased(Integer consumablesPurchased) {
        this.consumablesPurchased = consumablesPurchased;
    }

    public Integer getDamageDealtPlayer() {
        return damageDealtPlayer;
    }

    public void setDamageDealtPlayer(Integer damageDealtPlayer) {
        this.damageDealtPlayer = damageDealtPlayer;
    }

    public Integer getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Integer getFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(Integer firstBlood) {
        this.firstBlood = firstBlood;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Integer getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

    public Integer getItem0() {
        return item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public Integer getItem6() {
        return item6;
    }

    public void setItem6(Integer item6) {
        this.item6 = item6;
    }

    public Integer getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(Integer itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public Integer getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(Integer killingSprees) {
        this.killingSprees = killingSprees;
    }

    public Integer getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(Integer largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public Integer getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public void setLargestKillingSpree(Integer largestKillingSpree) {
        this.largestKillingSpree = largestKillingSpree;
    }

    public Integer getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(Integer largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public Integer getLegendaryItemsCreated() {
        return legendaryItemsCreated;
    }

    public void setLegendaryItemsCreated(Integer legendaryItemsCreated) {
        this.legendaryItemsCreated = legendaryItemsCreated;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMagicDamageDealtPlayer() {
        return magicDamageDealtPlayer;
    }

    public void setMagicDamageDealtPlayer(Integer magicDamageDealtPlayer) {
        this.magicDamageDealtPlayer = magicDamageDealtPlayer;
    }

    public Integer getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(Integer magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public Integer getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(Integer magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public Integer getMinionsDenied() {
        return minionsDenied;
    }

    public void setMinionsDenied(Integer minionsDenied) {
        this.minionsDenied = minionsDenied;
    }

    public Integer getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(Integer minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public Integer getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(Integer neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public Integer getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public void setNeutralMinionsKilledEnemyJungle(Integer neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    public Integer getNeutralMinionsKilledYourJungle() {
        return neutralMinionsKilledYourJungle;
    }

    public void setNeutralMinionsKilledYourJungle(Integer neutralMinionsKilledYourJungle) {
        this.neutralMinionsKilledYourJungle = neutralMinionsKilledYourJungle;
    }

    public Boolean isNexusKilled() {
        return nexusKilled;
    }

    public void setNexusKilled(Boolean nexusKilled) {
        this.nexusKilled = nexusKilled;
    }

    public Integer getNodeCapture() {
        return nodeCapture;
    }

    public void setNodeCapture(Integer nodeCapture) {
        this.nodeCapture = nodeCapture;
    }

    public Integer getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    public void setNodeCaptureAssist(Integer nodeCaptureAssist) {
        this.nodeCaptureAssist = nodeCaptureAssist;
    }

    public Integer getNodeNeutralize() {
        return nodeNeutralize;
    }

    public void setNodeNeutralize(Integer nodeNeutralize) {
        this.nodeNeutralize = nodeNeutralize;
    }

    public Integer getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    public void setNodeNeutralizeAssist(Integer nodeNeutralizeAssist) {
        this.nodeNeutralizeAssist = nodeNeutralizeAssist;
    }

    public Integer getNumDeaths() {
        return numDeaths;
    }

    public void setNumDeaths(Integer numDeaths) {
        this.numDeaths = numDeaths;
    }

    public Integer getNumItemsBought() {
        return numItemsBought;
    }

    public void setNumItemsBought(Integer numItemsBought) {
        this.numItemsBought = numItemsBought;
    }

    public Integer getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public void setObjectivePlayerScore(Integer objectivePlayerScore) {
        this.objectivePlayerScore = objectivePlayerScore;
    }

    public Integer getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Integer getPhysicalDamageDealtPlayer() {
        return physicalDamageDealtPlayer;
    }

    public void setPhysicalDamageDealtPlayer(Integer physicalDamageDealtPlayer) {
        this.physicalDamageDealtPlayer = physicalDamageDealtPlayer;
    }

    public Integer getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(Integer physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public Integer getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Integer getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Integer playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Integer getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(Integer playerRole) {
        this.playerRole = playerRole;
    }

    public Integer getPlayerScore0() {
        return playerScore0;
    }

    public void setPlayerScore0(Integer playerScore0) {
        this.playerScore0 = playerScore0;
    }

    public Integer getPlayerScore1() {
        return playerScore1;
    }

    public void setPlayerScore1(Integer playerScore1) {
        this.playerScore1 = playerScore1;
    }

    public Integer getPlayerScore2() {
        return playerScore2;
    }

    public void setPlayerScore2(Integer playerScore2) {
        this.playerScore2 = playerScore2;
    }

    public Integer getPlayerScore3() {
        return playerScore3;
    }

    public void setPlayerScore3(Integer playerScore3) {
        this.playerScore3 = playerScore3;
    }

    public Integer getPlayerScore4() {
        return playerScore4;
    }

    public void setPlayerScore4(Integer playerScore4) {
        this.playerScore4 = playerScore4;
    }

    public Integer getPlayerScore5() {
        return playerScore5;
    }

    public void setPlayerScore5(Integer playerScore5) {
        this.playerScore5 = playerScore5;
    }

    public Integer getPlayerScore6() {
        return playerScore6;
    }

    public void setPlayerScore6(Integer playerScore6) {
        this.playerScore6 = playerScore6;
    }

    public Integer getPlayerScore7() {
        return playerScore7;
    }

    public void setPlayerScore7(Integer playerScore7) {
        this.playerScore7 = playerScore7;
    }

    public Integer getPlayerScore8() {
        return playerScore8;
    }

    public void setPlayerScore8(Integer playerScore8) {
        this.playerScore8 = playerScore8;
    }

    public Integer getPlayerScore9() {
        return playerScore9;
    }

    public void setPlayerScore9(Integer playerScore9) {
        this.playerScore9 = playerScore9;
    }

    public Integer getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    public Integer getSightWardsBought() {
        return sightWardsBought;
    }

    public void setSightWardsBought(Integer sightWardsBought) {
        this.sightWardsBought = sightWardsBought;
    }

    public Integer getSpell1Cast() {
        return spell1Cast;
    }

    public void setSpell1Cast(Integer spell1Cast) {
        this.spell1Cast = spell1Cast;
    }

    public Integer getSpell2Cast() {
        return spell2Cast;
    }

    public void setSpell2Cast(Integer spell2Cast) {
        this.spell2Cast = spell2Cast;
    }

    public Integer getSpell3Cast() {
        return spell3Cast;
    }

    public void setSpell3Cast(Integer spell3Cast) {
        this.spell3Cast = spell3Cast;
    }

    public Integer getSpell4Cast() {
        return spell4Cast;
    }

    public void setSpell4Cast(Integer spell4Cast) {
        this.spell4Cast = spell4Cast;
    }

    public Integer getSummonSpell1Cast() {
        return summonSpell1Cast;
    }

    public void setSummonSpell1Cast(Integer summonSpell1Cast) {
        this.summonSpell1Cast = summonSpell1Cast;
    }

    public Integer getSummonSpell2Cast() {
        return summonSpell2Cast;
    }

    public void setSummonSpell2Cast(Integer summonSpell2Cast) {
        this.summonSpell2Cast = summonSpell2Cast;
    }

    public Integer getSuperMonsterKilled() {
        return superMonsterKilled;
    }

    public void setSuperMonsterKilled(Integer superMonsterKilled) {
        this.superMonsterKilled = superMonsterKilled;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public Integer getTeamObjective() {
        return teamObjective;
    }

    public void setTeamObjective(Integer teamObjective) {
        this.teamObjective = teamObjective;
    }

    public Integer getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Integer getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(Integer totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public Integer getTotalDamageDealtToBuildings() {
        return totalDamageDealtToBuildings;
    }

    public void setTotalDamageDealtToBuildings(Integer totalDamageDealtToBuildings) {
        this.totalDamageDealtToBuildings = totalDamageDealtToBuildings;
    }

    public Integer getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(Integer totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public Integer getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(Integer totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public Integer getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(Integer totalHeal) {
        this.totalHeal = totalHeal;
    }

    public Integer getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public void setTotalPlayerScore(Integer totalPlayerScore) {
        this.totalPlayerScore = totalPlayerScore;
    }

    public Integer getTotalScoreRank() {
        return totalScoreRank;
    }

    public void setTotalScoreRank(Integer totalScoreRank) {
        this.totalScoreRank = totalScoreRank;
    }

    public Integer getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(Integer totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public Integer getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(Integer totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public Integer getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(Integer tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Integer getTrueDamageDealtPlayer() {
        return trueDamageDealtPlayer;
    }

    public void setTrueDamageDealtPlayer(Integer trueDamageDealtPlayer) {
        this.trueDamageDealtPlayer = trueDamageDealtPlayer;
    }

    public Integer getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(Integer trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public Integer getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(Integer trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public Integer getTurretsKilled() {
        return turretsKilled;
    }

    public void setTurretsKilled(Integer turretsKilled) {
        this.turretsKilled = turretsKilled;
    }

    public Integer getUnrealKills() {
        return unrealKills;
    }

    public void setUnrealKills(Integer unrealKills) {
        this.unrealKills = unrealKills;
    }

    public Integer getVictoryPointTotal() {
        return victoryPointTotal;
    }

    public void setVictoryPointTotal(Integer victoryPointTotal) {
        this.victoryPointTotal = victoryPointTotal;
    }

    public Integer getVisionWardsBought() {
        return visionWardsBought;
    }

    public void setVisionWardsBought(Integer visionWardsBought) {
        this.visionWardsBought = visionWardsBought;
    }

    public Integer getWardKilled() {
        return wardKilled;
    }

    public void setWardKilled(Integer wardKilled) {
        this.wardKilled = wardKilled;
    }

    public Integer getWardPlaced() {
        return wardPlaced;
    }

    public void setWardPlaced(Integer wardPlaced) {
        this.wardPlaced = wardPlaced;
    }

    public Boolean isWin() {
        return win;
    }

    public void setWin(Boolean win) {
        this.win = win;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RawStatsDto)) {
            return false;
        }
        RawStatsDto that = (RawStatsDto) o;
        return Objects.equals(assists, that.assists) &&
                Objects.equals(barracksKilled, that.barracksKilled) &&
                Objects.equals(bountyLevel, that.bountyLevel) &&
                Objects.equals(championsKilled, that.championsKilled) &&
                Objects.equals(combatPlayerScore, that.combatPlayerScore) &&
                Objects.equals(consumablesPurchased, that.consumablesPurchased) &&
                Objects.equals(damageDealtPlayer, that.damageDealtPlayer) &&
                Objects.equals(doubleKills, that.doubleKills) &&
                Objects.equals(firstBlood, that.firstBlood) &&
                Objects.equals(gold, that.gold) &&
                Objects.equals(goldEarned, that.goldEarned) &&
                Objects.equals(goldSpent, that.goldSpent) &&
                Objects.equals(item0, that.item0) &&
                Objects.equals(item1, that.item1) &&
                Objects.equals(item2, that.item2) &&
                Objects.equals(item3, that.item3) &&
                Objects.equals(item4, that.item4) &&
                Objects.equals(item5, that.item5) &&
                Objects.equals(item6, that.item6) &&
                Objects.equals(itemsPurchased, that.itemsPurchased) &&
                Objects.equals(killingSprees, that.killingSprees) &&
                Objects.equals(largestCriticalStrike, that.largestCriticalStrike) &&
                Objects.equals(largestKillingSpree, that.largestKillingSpree) &&
                Objects.equals(largestMultiKill, that.largestMultiKill) &&
                Objects.equals(legendaryItemsCreated, that.legendaryItemsCreated) &&
                Objects.equals(level, that.level) &&
                Objects.equals(magicDamageDealtPlayer, that.magicDamageDealtPlayer) &&
                Objects.equals(magicDamageDealtToChampions, that.magicDamageDealtToChampions) &&
                Objects.equals(magicDamageTaken, that.magicDamageTaken) &&
                Objects.equals(minionsDenied, that.minionsDenied) &&
                Objects.equals(minionsKilled, that.minionsKilled) &&
                Objects.equals(neutralMinionsKilled, that.neutralMinionsKilled) &&
                Objects.equals(neutralMinionsKilledEnemyJungle, that.neutralMinionsKilledEnemyJungle) &&
                Objects.equals(neutralMinionsKilledYourJungle, that.neutralMinionsKilledYourJungle) &&
                Objects.equals(nexusKilled, that.nexusKilled) &&
                Objects.equals(nodeCapture, that.nodeCapture) &&
                Objects.equals(nodeCaptureAssist, that.nodeCaptureAssist) &&
                Objects.equals(nodeNeutralize, that.nodeNeutralize) &&
                Objects.equals(nodeNeutralizeAssist, that.nodeNeutralizeAssist) &&
                Objects.equals(numDeaths, that.numDeaths) &&
                Objects.equals(numItemsBought, that.numItemsBought) &&
                Objects.equals(objectivePlayerScore, that.objectivePlayerScore) &&
                Objects.equals(pentaKills, that.pentaKills) &&
                Objects.equals(physicalDamageDealtPlayer, that.physicalDamageDealtPlayer) &&
                Objects.equals(physicalDamageDealtToChampions, that.physicalDamageDealtToChampions) &&
                Objects.equals(physicalDamageTaken, that.physicalDamageTaken) &&
                Objects.equals(playerPosition, that.playerPosition) &&
                Objects.equals(playerRole, that.playerRole) &&
                Objects.equals(playerScore0, that.playerScore0) &&
                Objects.equals(playerScore1, that.playerScore1) &&
                Objects.equals(playerScore2, that.playerScore2) &&
                Objects.equals(playerScore3, that.playerScore3) &&
                Objects.equals(playerScore4, that.playerScore4) &&
                Objects.equals(playerScore5, that.playerScore5) &&
                Objects.equals(playerScore6, that.playerScore6) &&
                Objects.equals(playerScore7, that.playerScore7) &&
                Objects.equals(playerScore8, that.playerScore8) &&
                Objects.equals(playerScore9, that.playerScore9) &&
                Objects.equals(quadraKills, that.quadraKills) &&
                Objects.equals(sightWardsBought, that.sightWardsBought) &&
                Objects.equals(spell1Cast, that.spell1Cast) &&
                Objects.equals(spell2Cast, that.spell2Cast) &&
                Objects.equals(spell3Cast, that.spell3Cast) &&
                Objects.equals(spell4Cast, that.spell4Cast) &&
                Objects.equals(summonSpell1Cast, that.summonSpell1Cast) &&
                Objects.equals(summonSpell2Cast, that.summonSpell2Cast) &&
                Objects.equals(superMonsterKilled, that.superMonsterKilled) &&
                Objects.equals(team, that.team) &&
                Objects.equals(teamObjective, that.teamObjective) &&
                Objects.equals(timePlayed, that.timePlayed) &&
                Objects.equals(totalDamageDealt, that.totalDamageDealt) &&
                Objects.equals(totalDamageDealtToBuildings, that.totalDamageDealtToBuildings) &&
                Objects.equals(totalDamageDealtToChampions, that.totalDamageDealtToChampions) &&
                Objects.equals(totalDamageTaken, that.totalDamageTaken) &&
                Objects.equals(totalHeal, that.totalHeal) &&
                Objects.equals(totalPlayerScore, that.totalPlayerScore) &&
                Objects.equals(totalScoreRank, that.totalScoreRank) &&
                Objects.equals(totalTimeCrowdControlDealt, that.totalTimeCrowdControlDealt) &&
                Objects.equals(totalUnitsHealed, that.totalUnitsHealed) &&
                Objects.equals(tripleKills, that.tripleKills) &&
                Objects.equals(trueDamageDealtPlayer, that.trueDamageDealtPlayer) &&
                Objects.equals(trueDamageDealtToChampions, that.trueDamageDealtToChampions) &&
                Objects.equals(trueDamageTaken, that.trueDamageTaken) &&
                Objects.equals(turretsKilled, that.turretsKilled) &&
                Objects.equals(unrealKills, that.unrealKills) &&
                Objects.equals(victoryPointTotal, that.victoryPointTotal) &&
                Objects.equals(visionWardsBought, that.visionWardsBought) &&
                Objects.equals(wardKilled, that.wardKilled) &&
                Objects.equals(wardPlaced, that.wardPlaced) &&
                Objects.equals(win, that.win);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assists, barracksKilled, bountyLevel, championsKilled, combatPlayerScore, consumablesPurchased, damageDealtPlayer, doubleKills, firstBlood, gold, goldEarned, goldSpent, item0, item1, item2, item3, item4, item5, item6, itemsPurchased, killingSprees, largestCriticalStrike, largestKillingSpree, largestMultiKill, legendaryItemsCreated, level, magicDamageDealtPlayer, magicDamageDealtToChampions, magicDamageTaken, minionsDenied, minionsKilled, neutralMinionsKilled, neutralMinionsKilledEnemyJungle, neutralMinionsKilledYourJungle, nexusKilled, nodeCapture, nodeCaptureAssist, nodeNeutralize, nodeNeutralizeAssist, numDeaths, numItemsBought, objectivePlayerScore, pentaKills, physicalDamageDealtPlayer, physicalDamageDealtToChampions, physicalDamageTaken, playerPosition, playerRole, playerScore0, playerScore1, playerScore2, playerScore3, playerScore4, playerScore5, playerScore6, playerScore7, playerScore8, playerScore9, quadraKills, sightWardsBought, spell1Cast, spell2Cast, spell3Cast, spell4Cast, summonSpell1Cast, summonSpell2Cast, superMonsterKilled, team, teamObjective, timePlayed, totalDamageDealt, totalDamageDealtToBuildings, totalDamageDealtToChampions, totalDamageTaken, totalHeal, totalPlayerScore, totalScoreRank, totalTimeCrowdControlDealt, totalUnitsHealed, tripleKills, trueDamageDealtPlayer, trueDamageDealtToChampions, trueDamageTaken, turretsKilled, unrealKills, victoryPointTotal, visionWardsBought, wardKilled, wardPlaced, win);
    }

    @Override
    public String toString() {
        return "RawStatsDto{" +
                "assists=" + assists +
                ", barracksKilled=" + barracksKilled +
                ", bountyLevel=" + bountyLevel +
                ", championsKilled=" + championsKilled +
                ", combatPlayerScore=" + combatPlayerScore +
                ", consumablesPurchased=" + consumablesPurchased +
                ", damageDealtPlayer=" + damageDealtPlayer +
                ", doubleKills=" + doubleKills +
                ", firstBlood=" + firstBlood +
                ", gold=" + gold +
                ", goldEarned=" + goldEarned +
                ", goldSpent=" + goldSpent +
                ", item0=" + item0 +
                ", item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                ", item4=" + item4 +
                ", item5=" + item5 +
                ", item6=" + item6 +
                ", itemsPurchased=" + itemsPurchased +
                ", killingSprees=" + killingSprees +
                ", largestCriticalStrike=" + largestCriticalStrike +
                ", largestKillingSpree=" + largestKillingSpree +
                ", largestMultiKill=" + largestMultiKill +
                ", legendaryItemsCreated=" + legendaryItemsCreated +
                ", level=" + level +
                ", magicDamageDealtPlayer=" + magicDamageDealtPlayer +
                ", magicDamageDealtToChampions=" + magicDamageDealtToChampions +
                ", magicDamageTaken=" + magicDamageTaken +
                ", minionsDenied=" + minionsDenied +
                ", minionsKilled=" + minionsKilled +
                ", neutralMinionsKilled=" + neutralMinionsKilled +
                ", neutralMinionsKilledEnemyJungle=" + neutralMinionsKilledEnemyJungle +
                ", neutralMinionsKilledYourJungle=" + neutralMinionsKilledYourJungle +
                ", nexusKilled=" + nexusKilled +
                ", nodeCapture=" + nodeCapture +
                ", nodeCaptureAssist=" + nodeCaptureAssist +
                ", nodeNeutralize=" + nodeNeutralize +
                ", nodeNeutralizeAssist=" + nodeNeutralizeAssist +
                ", numDeaths=" + numDeaths +
                ", numItemsBought=" + numItemsBought +
                ", objectivePlayerScore=" + objectivePlayerScore +
                ", pentaKills=" + pentaKills +
                ", physicalDamageDealtPlayer=" + physicalDamageDealtPlayer +
                ", physicalDamageDealtToChampions=" + physicalDamageDealtToChampions +
                ", physicalDamageTaken=" + physicalDamageTaken +
                ", playerPosition=" + playerPosition +
                ", playerRole=" + playerRole +
                ", playerScore0=" + playerScore0 +
                ", playerScore1=" + playerScore1 +
                ", playerScore2=" + playerScore2 +
                ", playerScore3=" + playerScore3 +
                ", playerScore4=" + playerScore4 +
                ", playerScore5=" + playerScore5 +
                ", playerScore6=" + playerScore6 +
                ", playerScore7=" + playerScore7 +
                ", playerScore8=" + playerScore8 +
                ", playerScore9=" + playerScore9 +
                ", quadraKills=" + quadraKills +
                ", sightWardsBought=" + sightWardsBought +
                ", spell1Cast=" + spell1Cast +
                ", spell2Cast=" + spell2Cast +
                ", spell3Cast=" + spell3Cast +
                ", spell4Cast=" + spell4Cast +
                ", summonSpell1Cast=" + summonSpell1Cast +
                ", summonSpell2Cast=" + summonSpell2Cast +
                ", superMonsterKilled=" + superMonsterKilled +
                ", team=" + team +
                ", teamObjective=" + teamObjective +
                ", timePlayed=" + timePlayed +
                ", totalDamageDealt=" + totalDamageDealt +
                ", totalDamageDealtToBuildings=" + totalDamageDealtToBuildings +
                ", totalDamageDealtToChampions=" + totalDamageDealtToChampions +
                ", totalDamageTaken=" + totalDamageTaken +
                ", totalHeal=" + totalHeal +
                ", totalPlayerScore=" + totalPlayerScore +
                ", totalScoreRank=" + totalScoreRank +
                ", totalTimeCrowdControlDealt=" + totalTimeCrowdControlDealt +
                ", totalUnitsHealed=" + totalUnitsHealed +
                ", tripleKills=" + tripleKills +
                ", trueDamageDealtPlayer=" + trueDamageDealtPlayer +
                ", trueDamageDealtToChampions=" + trueDamageDealtToChampions +
                ", trueDamageTaken=" + trueDamageTaken +
                ", turretsKilled=" + turretsKilled +
                ", unrealKills=" + unrealKills +
                ", victoryPointTotal=" + victoryPointTotal +
                ", visionWardsBought=" + visionWardsBought +
                ", wardKilled=" + wardKilled +
                ", wardPlaced=" + wardPlaced +
                ", win=" + win +
                '}';
    }
}
