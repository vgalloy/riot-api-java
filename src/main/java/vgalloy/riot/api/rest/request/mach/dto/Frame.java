package vgalloy.riot.api.rest.request.mach.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Frame {

    private List<Event> events;
    private Map<String, ParticipantFrame> participantFrames;
    private long timestamp;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Map<String, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public void setParticipantFrames(Map<String, ParticipantFrame> participantFrames) {
        this.participantFrames = participantFrames;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Frame frame = (Frame) o;
        return timestamp == frame.timestamp &&
                Objects.equals(events, frame.events) &&
                Objects.equals(participantFrames, frame.participantFrames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, participantFrames, timestamp);
    }

    @Override
    public String toString() {
        return "Frame{" +
                "events=" + events +
                ", participantFrames=" + participantFrames +
                ", timestamp=" + timestamp +
                '}';
    }
}
