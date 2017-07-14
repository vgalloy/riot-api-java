package com.vgalloy.riot.api.api.dto.summoner;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class RunePageDto implements Serializable {

    private static final long serialVersionUID = -3837915945185089573L;

    private Boolean current;
    private Long id;
    private String name;
    private Set<RuneSlotDto> slots;

    public Boolean isCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(o instanceof RunePageDto)) {
            return false;
        }
        RunePageDto that = (RunePageDto) o;
        return Objects.equals(current, that.current) &&
            Objects.equals(id, that.id) &&
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
