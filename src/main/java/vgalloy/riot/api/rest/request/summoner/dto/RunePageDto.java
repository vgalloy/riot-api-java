package vgalloy.riot.api.rest.request.summoner.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;
import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RunePageDto {

    private boolean current;
    private long id;
    private String name;
    private Set<RuneSlotDto> slots;

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<RuneSlotDto> getSlots() {
        return slots;
    }

    public void setSlots(Set<RuneSlotDto> slots) {
        this.slots = slots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunePageDto that = (RunePageDto) o;
        return current == that.current &&
                id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(slots, that.slots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, id, name, slots);
    }

    @Override
    public String toString() {
        return "RunePageDto{" +
                "current=" + current +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", slots=" + slots +
                '}';
    }
}
