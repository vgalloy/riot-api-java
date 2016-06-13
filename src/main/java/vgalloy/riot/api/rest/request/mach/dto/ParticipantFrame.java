package vgalloy.riot.api.rest.request.mach.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantFrame {

    private int currentGold;
    private int dominionScore;
    private int jungleMinionsKilled;
    private int level;
    private int minionsKilled;
    private int participantId;
    private Position position;
    private int teamScore;
    private int totalGold;
    private int xp;

    public int getCurrentGold() {
        return currentGold;
    }

    public void setCurrentGold(int currentGold) {
        this.currentGold = currentGold;
    }

    public int getDominionScore() {
        return dominionScore;
    }

    public void setDominionScore(int dominionScore) {
        this.dominionScore = dominionScore;
    }

    public int getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public void setJungleMinionsKilled(int jungleMinionsKilled) {
        this.jungleMinionsKilled = jungleMinionsKilled;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(int minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(int totalGold) {
        this.totalGold = totalGold;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantFrame that = (ParticipantFrame) o;
        return currentGold == that.currentGold &&
                dominionScore == that.dominionScore &&
                jungleMinionsKilled == that.jungleMinionsKilled &&
                level == that.level &&
                minionsKilled == that.minionsKilled &&
                participantId == that.participantId &&
                teamScore == that.teamScore &&
                totalGold == that.totalGold &&
                xp == that.xp &&
                Objects.equals(position, that.position);
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
