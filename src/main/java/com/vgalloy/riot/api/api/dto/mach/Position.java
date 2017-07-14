package com.vgalloy.riot.api.api.dto.mach;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class Position implements Serializable {

    private static final long serialVersionUID = 1430689349348718279L;
    @JsonProperty("x")
    private Integer positionX;
    @JsonProperty("y")
    private Integer positionY;

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(positionX, position.positionX) &&
            Objects.equals(positionY, position.positionY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY);
    }

    @Override
    public String toString() {
        return "Position{" +
            "positionX=" + positionX +
            ", positionY=" + positionY +
            '}';
    }
}
