package vgalloy.riot.api.team.dto;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RosterDto rosterDto = (RosterDto) o;
        return ownerId == rosterDto.ownerId &&
                Objects.equals(memberList, rosterDto.memberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberList, ownerId);
    }

    @Override
    public String toString() {
        return "RosterDto{" +
                "memberList=" + memberList +
                ", ownerId=" + ownerId +
                '}';
    }
}
