package vgalloy.riot.api.rest.request.mach.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

    private List<BannedChampion> bans;
    private int baronKills;
    private long dominionVictoryScore;
    private int dragonKills;
    private boolean firstBaron;
    private boolean firstBlood;
    private boolean firstDragon;
    private boolean firstInhibitor;
    private boolean firstRiftHerald;
    private boolean firstTower;
    private int inhibitorKills;
    private int riftHeraldKills;
    private int teamId;
    private int towerKills;
    private int vilemawKills;
    private boolean winner;

    public List<BannedChampion> getBans() {
        return bans;
    }

    public void setBans(List<BannedChampion> bans) {
        this.bans = bans;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(int baronKills) {
        this.baronKills = baronKills;
    }

    public long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(long dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(int dragonKills) {
        this.dragonKills = dragonKills;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public void setFirstTower(boolean firstTower) {
        this.firstTower = firstTower;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(int inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(int riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(int towerKills) {
        this.towerKills = towerKills;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(int vilemawKills) {
        this.vilemawKills = vilemawKills;
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
        Team team = (Team) o;
        return baronKills == team.baronKills &&
                dominionVictoryScore == team.dominionVictoryScore &&
                dragonKills == team.dragonKills &&
                firstBaron == team.firstBaron &&
                firstBlood == team.firstBlood &&
                firstDragon == team.firstDragon &&
                firstInhibitor == team.firstInhibitor &&
                firstRiftHerald == team.firstRiftHerald &&
                firstTower == team.firstTower &&
                inhibitorKills == team.inhibitorKills &&
                riftHeraldKills == team.riftHeraldKills &&
                teamId == team.teamId &&
                towerKills == team.towerKills &&
                vilemawKills == team.vilemawKills &&
                winner == team.winner &&
                Objects.equals(bans, team.bans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bans, baronKills, dominionVictoryScore, dragonKills, firstBaron, firstBlood, firstDragon, firstInhibitor, firstRiftHerald, firstTower, inhibitorKills, riftHeraldKills, teamId, towerKills, vilemawKills, winner);
    }

    @Override
    public String toString() {
        return "Team{" +
                "bans=" + bans +
                ", baronKills=" + baronKills +
                ", dominionVictoryScore=" + dominionVictoryScore +
                ", dragonKills=" + dragonKills +
                ", firstBaron=" + firstBaron +
                ", firstBlood=" + firstBlood +
                ", firstDragon=" + firstDragon +
                ", firstInhibitor=" + firstInhibitor +
                ", firstRiftHerald=" + firstRiftHerald +
                ", firstTower=" + firstTower +
                ", inhibitorKills=" + inhibitorKills +
                ", riftHeraldKills=" + riftHeraldKills +
                ", teamId=" + teamId +
                ", towerKills=" + towerKills +
                ", vilemawKills=" + vilemawKills +
                ", winner=" + winner +
                '}';
    }
}
