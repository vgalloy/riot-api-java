package vgalloy.riot.api.api.dto.mach;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantTimelineData implements Serializable {

    private static final long serialVersionUID = 5796010700085387398L;

    private double tenToTwenty;
    private double thirtyToEnd;
    private double twentyToThirty;
    private double zeroToTen;

    public double getTenToTwenty() {
        return tenToTwenty;
    }

    public double getThirtyToEnd() {
        return thirtyToEnd;
    }

    public double getTwentyToThirty() {
        return twentyToThirty;
    }

    public double getZeroToTen() {
        return zeroToTen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantTimelineData that = (ParticipantTimelineData) o;
        return Double.compare(that.tenToTwenty, tenToTwenty) == 0 &&
                Double.compare(that.thirtyToEnd, thirtyToEnd) == 0 &&
                Double.compare(that.twentyToThirty, twentyToThirty) == 0 &&
                Double.compare(that.zeroToTen, zeroToTen) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenToTwenty, thirtyToEnd, twentyToThirty, zeroToTen);
    }

    @Override
    public String toString() {
        return "ParticipantTimelineData{" +
                "tenToTwenty=" + tenToTwenty +
                ", thirtyToEnd=" + thirtyToEnd +
                ", twentyToThirty=" + twentyToThirty +
                ", zeroToTen=" + zeroToTen +
                '}';
    }
}
