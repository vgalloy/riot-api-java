package vgalloy.riot.api.dto;

import java.util.List;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
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
}
