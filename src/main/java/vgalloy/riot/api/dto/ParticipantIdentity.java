package vgalloy.riot.api.dto;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public class ParticipantIdentity {
    private int participantId;
    private Player player;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "ParticipantIdentity{" +
                "participantId=" + participantId +
                ", player=" + player +
                '}';
    }
}
