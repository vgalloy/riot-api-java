package vgalloy.riot.api.request.lolstatus.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Incident {

    private boolean active;
    private String created_at;
    private long id;
    private List<Message> updates;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Message> getUpdates() {
        return updates;
    }

    public void setUpdates(List<Message> updates) {
        this.updates = updates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Incident incident = (Incident) o;
        return active == incident.active &&
                id == incident.id &&
                Objects.equals(created_at, incident.created_at) &&
                Objects.equals(updates, incident.updates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, created_at, id, updates);
    }

    @Override
    public String toString() {
        return "Incident{" +
                "active=" + active +
                ", created_at='" + created_at + '\'' +
                ", id=" + id +
                ", updates=" + updates +
                '}';
    }
}
