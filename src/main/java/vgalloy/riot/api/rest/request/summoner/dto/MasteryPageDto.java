package vgalloy.riot.api.rest.request.summoner.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryPageDto {

    private boolean current;
    private long id;
    private List<MasteryDto> masteries;
    private String name;

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

    public List<MasteryDto> getMasteries() {
        return masteries;
    }

    public void setMasteries(List<MasteryDto> masteries) {
        this.masteries = masteries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasteryPageDto that = (MasteryPageDto) o;
        return current == that.current &&
                id == that.id &&
                Objects.equals(masteries, that.masteries) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, id, masteries, name);
    }

    @Override
    public String toString() {
        return "MasteryPageDto{" +
                "current=" + current +
                ", id=" + id +
                ", masteries=" + masteries +
                ", name='" + name + '\'' +
                '}';
    }
}
