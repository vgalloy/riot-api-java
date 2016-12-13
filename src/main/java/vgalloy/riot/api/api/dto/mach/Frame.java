package vgalloy.riot.api.api.dto.mach;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Frame implements Serializable {

    private static final long serialVersionUID = 4733395422242449808L;

    private List<Event> events;
    private Map<String, ParticipantFrame> participantFrames;
    private Long timestamp;

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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) o;
        return Objects.equals(events, frame.events) &&
                Objects.equals(participantFrames, frame.participantFrames) &&
                Objects.equals(timestamp, frame.timestamp);
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
