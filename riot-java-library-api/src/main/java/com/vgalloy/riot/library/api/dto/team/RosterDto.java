package com.vgalloy.riot.library.api.dto.team;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class RosterDto implements Serializable {

    private static final long serialVersionUID = 2222431218414997237L;

    private List<TeamMemberInfoDto> memberList;
    private Long ownerId;

    public List<TeamMemberInfoDto> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<TeamMemberInfoDto> memberList) {
        this.memberList = memberList;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RosterDto)) {
            return false;
        }
        RosterDto rosterDto = (RosterDto) o;
        return Objects.equals(memberList, rosterDto.memberList) &&
            Objects.equals(ownerId, rosterDto.ownerId);
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
