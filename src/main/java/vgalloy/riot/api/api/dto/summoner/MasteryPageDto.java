package vgalloy.riot.api.api.dto.summoner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryPageDto implements Serializable {

    private static final long serialVersionUID = 8577123416649467160L;

    private Boolean current;
    private Long id;
    private List<MasteryDto> masteries;
    private String name;

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
        if (!(o instanceof MasteryPageDto)) {
            return false;
        }
        MasteryPageDto that = (MasteryPageDto) o;
        return Objects.equals(current, that.current) &&
                Objects.equals(id, that.id) &&
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
