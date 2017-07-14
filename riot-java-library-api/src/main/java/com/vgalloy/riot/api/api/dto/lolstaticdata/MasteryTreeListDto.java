package com.vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class MasteryTreeListDto implements Serializable {

    private static final long serialVersionUID = -8103610009865545855L;

    private Integer masteryId;
    private String prereq;

    public Integer getMasteryId() {
        return masteryId;
    }

    public void setMasteryId(Integer masteryId) {
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
        if (!(o instanceof MasteryTreeListDto)) {
            return false;
        }
        MasteryTreeListDto that = (MasteryTreeListDto) o;
        return Objects.equals(masteryId, that.masteryId) &&
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
