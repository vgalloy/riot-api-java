package com.vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class Team implements Serializable {

    private static final long serialVersionUID = -8469359789874264284L;

    private List<BannedChampion> bans;
    private Integer baronKills;
    private Long dominionVictoryScore;
    private Integer dragonKills;
    private Boolean firstBaron;
    private Boolean firstBlood;
    private Boolean firstDragon;
    private Boolean firstInhibitor;
    private Boolean firstRiftHerald;
    private Boolean firstTower;
    private Integer inhibitorKills;
    private Integer riftHeraldKills;
    private Integer teamId;
    private Integer towerKills;
    private Integer vilemawKills;
    private Boolean winner;

    public List<BannedChampion> getBans() {
        return bans;
    }

    public void setBans(List<BannedChampion> bans) {
        this.bans = bans;
    }

    public Integer getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(Integer baronKills) {
        this.baronKills = baronKills;
    }

    public Long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(Long dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }

    public Integer getDragonKills() {
        return dragonKills;
    }

    public void setDragonKills(Integer dragonKills) {
        this.dragonKills = dragonKills;
    }

    public Boolean isFirstBaron() {
        return firstBaron;
    }

    public void setFirstBaron(Boolean firstBaron) {
        this.firstBaron = firstBaron;
    }

    public Boolean isFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(Boolean firstBlood) {
        this.firstBlood = firstBlood;
    }

    public Boolean isFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(Boolean firstDragon) {
        this.firstDragon = firstDragon;
    }

    public Boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(Boolean firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public Boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(Boolean firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public Boolean isFirstTower() {
        return firstTower;
    }

    public void setFirstTower(Boolean firstTower) {
        this.firstTower = firstTower;
    }

    public Integer getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(Integer inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public Integer getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(Integer riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(Integer towerKills) {
        this.towerKills = towerKills;
    }

    public Integer getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(Integer vilemawKills) {
        this.vilemawKills = vilemawKills;
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
        if (!(o instanceof Team)) {
            return false;
        }
        Team team = (Team) o;
        return Objects.equals(bans, team.bans) &&
            Objects.equals(baronKills, team.baronKills) &&
            Objects.equals(dominionVictoryScore, team.dominionVictoryScore) &&
            Objects.equals(dragonKills, team.dragonKills) &&
            Objects.equals(firstBaron, team.firstBaron) &&
            Objects.equals(firstBlood, team.firstBlood) &&
            Objects.equals(firstDragon, team.firstDragon) &&
            Objects.equals(firstInhibitor, team.firstInhibitor) &&
            Objects.equals(firstRiftHerald, team.firstRiftHerald) &&
            Objects.equals(firstTower, team.firstTower) &&
            Objects.equals(inhibitorKills, team.inhibitorKills) &&
            Objects.equals(riftHeraldKills, team.riftHeraldKills) &&
            Objects.equals(teamId, team.teamId) &&
            Objects.equals(towerKills, team.towerKills) &&
            Objects.equals(vilemawKills, team.vilemawKills) &&
            Objects.equals(winner, team.winner);
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
