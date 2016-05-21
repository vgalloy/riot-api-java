package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class TeamMemberInfoDto {

    private long inviteDate;
    private long joinDate;
    private long playerId;
    private String status;

    public long getInviteDate() {
        return inviteDate;
    }

    public void setInviteDate(long inviteDate) {
        this.inviteDate = inviteDate;
    }

    public long getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(long joinDate) {
        this.joinDate = joinDate;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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