package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageDto implements Serializable {

    private static final long serialVersionUID = -4237476324791257314L;

    private String full;
    private String group;
    @JsonProperty("h")
    private int imageH;
    private String sprite;
    @JsonProperty("w")
    private int imageW;
    @JsonProperty("x")
    private int imageX;
    @JsonProperty("y")
    private int imageY;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getImageH() {
        return imageH;
    }

    public void setImageH(int imageH) {
        this.imageH = imageH;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getImageW() {
        return imageW;
    }

    public void setImageW(int imageW) {
        this.imageW = imageW;
    }

    public int getImageX() {
        return imageX;
    }

    public void setImageX(int imageX) {
        this.imageX = imageX;
    }

    public int getImageY() {
        return imageY;
    }

    public void setImageY(int imageY) {
        this.imageY = imageY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDto imageDto = (ImageDto) o;
        return imageH == imageDto.imageH &&
                imageW == imageDto.imageW &&
                imageX == imageDto.imageX &&
                imageY == imageDto.imageY &&
                Objects.equals(full, imageDto.full) &&
                Objects.equals(group, imageDto.group) &&
                Objects.equals(sprite, imageDto.sprite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(full, group, imageH, sprite, imageW, imageX, imageY);
    }

    @Override
    public String toString() {
        return "ImageDto{" +
                "full='" + full + '\'' +
                ", group='" + group + '\'' +
                ", imageH=" + imageH +
                ", sprite='" + sprite + '\'' +
                ", imageW=" + imageW +
                ", imageX=" + imageX +
                ", imageY=" + imageY +
                '}';
    }
}
