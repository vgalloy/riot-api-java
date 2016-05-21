package vgalloy.riot.api.dto;

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
    public String toString() {
        return "MasteryTreeListDto{" +
                "masteryId=" + masteryId +
                ", prereq='" + prereq + '\'' +
                '}';
    }
}
