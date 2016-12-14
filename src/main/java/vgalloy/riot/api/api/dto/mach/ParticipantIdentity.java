package vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ParticipantIdentity implements Serializable {

    private static final long serialVersionUID = 6506843361223907817L;

    private Integer participantId;
    private Player player;

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParticipantIdentity)) {
            return false;
        }
        ParticipantIdentity that = (ParticipantIdentity) o;
        return Objects.equals(participantId, that.participantId) &&
                Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantId, player);
    }

    @Override
    public String toString() {
        return "ParticipantIdentity{" +
                "participantId=" + participantId +
                ", player=" + player +
                '}';
    }
}
