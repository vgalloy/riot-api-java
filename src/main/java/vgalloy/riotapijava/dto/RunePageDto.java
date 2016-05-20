package vgalloy.riotapijava.dto;

import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
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
    public String toString() {
        return "RunePageDto{" +
                "current=" + current +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", slots=" + slots +
                '}';
    }
}
