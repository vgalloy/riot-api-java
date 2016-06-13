package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkinDto {

    private int id;
    private String name;
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkinDto skinDto = (SkinDto) o;
        return id == skinDto.id &&
                num == skinDto.num &&
                Objects.equals(name, skinDto.name);
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
