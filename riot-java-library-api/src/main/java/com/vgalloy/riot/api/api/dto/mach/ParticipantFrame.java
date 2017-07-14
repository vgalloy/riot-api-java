package com.vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ParticipantFrame implements Serializable {

    private static final long serialVersionUID = 8304241931372436426L;

    private Integer currentGold;
    private Integer dominionScore;
    private Integer jungleMinionsKilled;
    private Integer level;
    private Integer minionsKilled;
    private Integer participantId;
    private Position position;
    private Integer teamScore;
    private Integer totalGold;
    private Integer xp;

    public Integer getCurrentGold() {
        return currentGold;
    }

    public void setCurrentGold(Integer currentGold) {
        this.currentGold = currentGold;
    }

    public Integer getDominionScore() {
        return dominionScore;
    }

    public void setDominionScore(Integer dominionScore) {
        this.dominionScore = dominionScore;
    }

    public Integer getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public void setJungleMinionsKilled(Integer jungleMinionsKilled) {
        this.jungleMinionsKilled = jungleMinionsKilled;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(Integer minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Integer getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(Integer teamScore) {
        this.teamScore = teamScore;
    }

    public Integer getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(Integer totalGold) {
        this.totalGold = totalGold;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParticipantFrame)) {
            return false;
        }
        ParticipantFrame that = (ParticipantFrame) o;
        return Objects.equals(currentGold, that.currentGold) &&
            Objects.equals(dominionScore, that.dominionScore) &&
            Objects.equals(jungleMinionsKilled, that.jungleMinionsKilled) &&
            Objects.equals(level, that.level) &&
            Objects.equals(minionsKilled, that.minionsKilled) &&
            Objects.equals(participantId, that.participantId) &&
            Objects.equals(position, that.position) &&
            Objects.equals(teamScore, that.teamScore) &&
            Objects.equals(totalGold, that.totalGold) &&
            Objects.equals(xp, that.xp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentGold, dominionScore, jungleMinionsKilled, level, minionsKilled, participantId, position, teamScore, totalGold, xp);
    }

    @Override
    public String toString() {
        return "ParticipantFrame{" +
            "currentGold=" + currentGold +
            ", dominionScore=" + dominionScore +
            ", jungleMinionsKilled=" + jungleMinionsKilled +
            ", level=" + level +
            ", minionsKilled=" + minionsKilled +
            ", participantId=" + participantId +
            ", position=" + position +
            ", teamScore=" + teamScore +
            ", totalGold=" + totalGold +
            ", xp=" + xp +
            '}';
    }
}
