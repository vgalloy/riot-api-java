package vgalloy.riot.api.lolstaticdata.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
public class BlockItemDto {

    private int count;
    private int id;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockItemDto that = (BlockItemDto) o;
        return count == that.count &&
                id == that.id;
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
