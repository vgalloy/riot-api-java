package vgalloy.riot.api.api.dto.lolstatus;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Incident implements Serializable {

    private static final long serialVersionUID = -5257840714083484515L;

    private Boolean active;
    @JsonProperty("created_at")
    private String createdAt;
    private Long id;
    private List<Message> updates;

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(o instanceof Incident)) {
            return false;
        }
        Incident incident = (Incident) o;
        return Objects.equals(active, incident.active) &&
                Objects.equals(createdAt, incident.createdAt) &&
                Objects.equals(id, incident.id) &&
                Objects.equals(updates, incident.updates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, createdAt, id, updates);
    }

    @Override
    public String toString() {
        return "Incident{" +
                "active=" + active +
                ", createdAt='" + createdAt + '\'' +
                ", id=" + id +
                ", updates=" + updates +
                '}';
    }
}
