package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockItemDto implements Serializable {

    private static final long serialVersionUID = -5412979537105122217L;

    private Integer count;
    private Integer id;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockItemDto)) {
            return false;
        }
        BlockItemDto that = (BlockItemDto) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, id);
    }

    @Override
    public String toString() {
        return "BlockItemDto{" +
                "count=" + count +
                ", id=" + id +
                '}';
    }
}
