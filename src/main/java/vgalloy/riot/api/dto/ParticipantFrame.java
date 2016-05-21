package vgalloy.riot.api.dto;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
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
