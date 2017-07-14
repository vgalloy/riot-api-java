package com.vgalloy.riot.library.api.dto.team;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class TeamMemberInfoDto implements Serializable {

    private static final long serialVersionUID = -4653851060481456728L;

    private Long inviteDate;
    private Long joinDate;
    private Long playerId;
    private String status;

    public Long getInviteDate() {
        return inviteDate;
    }

    public void setInviteDate(Long inviteDate) {
        this.inviteDate = inviteDate;
    }

    public Long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Long joinDate) {
        this.joinDate = joinDate;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TeamMemberInfoDto)) {
            return false;
        }
        TeamMemberInfoDto that = (TeamMemberInfoDto) o;
        return Objects.equals(inviteDate, that.inviteDate) &&
            Objects.equals(joinDate, that.joinDate) &&
            Objects.equals(playerId, that.playerId) &&
            Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteDate, joinDate, playerId, status);
    }

    @Override
    public String toString() {
        return "TeamMemberInfoDto{" +
            "inviteDate=" + inviteDate +
            ", joinDate=" + joinDate +
            ", playerId=" + playerId +
            ", status='" + status + '\'' +
            '}';
    }
}
