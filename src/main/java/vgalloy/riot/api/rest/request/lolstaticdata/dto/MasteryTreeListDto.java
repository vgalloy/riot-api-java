package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MasteryTreeListDto {

    private int masteryId;
    private String prereq;

    public int getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(int masteryId) {
        this.masteryId = masteryId;
    }

    public String getPrereq() {
        return prereq;
    }

    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasteryTreeListDto that = (MasteryTreeListDto) o;
        return masteryId == that.masteryId &&
                Objects.equals(prereq, that.prereq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masteryId, prereq);
    }

    @Override
    public String toString() {
        return "MasteryTreeListDto{" +
                "masteryId=" + masteryId +
                ", prereq='" + prereq + '\'' +
                '}';
    }
}
