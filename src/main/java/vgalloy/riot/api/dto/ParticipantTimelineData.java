package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ParticipantTimelineData {

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
    public String toString() {
        return "ParticipantTimelineData{" +
                "tenToTwenty=" + tenToTwenty +
                ", thirtyToEnd=" + thirtyToEnd +
                ", twentyToThirty=" + twentyToThirty +
                ", zeroToTen=" + zeroToTen +
                '}';
    }
}
