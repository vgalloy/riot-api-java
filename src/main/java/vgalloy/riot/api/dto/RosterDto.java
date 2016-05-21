package vgalloy.riot.api.dto;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class RosterDto {

    private List<TeamMemberInfoDto> memberList;
    private long ownerId;

    public List<TeamMemberInfoDto> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<TeamMemberInfoDto> memberList) {
        this.memberList = memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "RosterDto{" +
                "memberList=" + memberList +
                ", ownerId=" + ownerId +
                '}';
    }
}
