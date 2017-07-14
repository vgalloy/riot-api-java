package com.vgalloy.riot.library.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 23/05/16.
 *
 * @author Vincent Galloy
 */
public class SkinDto implements Serializable {

    private static final long serialVersionUID = -351060026162787759L;

    private Integer id;
    private String name;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SkinDto)) {
            return false;
        }
        SkinDto skinDto = (SkinDto) o;
        return Objects.equals(id, skinDto.id) &&
            Objects.equals(name, skinDto.name) &&
            Objects.equals(num, skinDto.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, num);
    }

    @Override
    public String toString() {
        return "SkinDto{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", num=" + num +
            '}';
    }
}
