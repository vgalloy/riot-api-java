package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ImageDto implements Serializable {

    private static final long serialVersionUID = -4237476324791257314L;

    private String full;
    private String group;
    @JsonProperty("h")
    private Integer imageH;
    private String sprite;
    @JsonProperty("w")
    private Integer imageW;
    @JsonProperty("x")
    private Integer imageX;
    @JsonProperty("y")
    private Integer imageY;

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

    public Integer getImageH() {
        return imageH;
    }

    public void setImageH(Integer imageH) {
        this.imageH = imageH;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public Integer getImageW() {
        return imageW;
    }

    public void setImageW(Integer imageW) {
        this.imageW = imageW;
    }

    public Integer getImageX() {
        return imageX;
    }

    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    public Integer getImageY() {
        return imageY;
    }

    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageDto)) {
            return false;
        }
        ImageDto imageDto = (ImageDto) o;
        return Objects.equals(full, imageDto.full) &&
            Objects.equals(group, imageDto.group) &&
            Objects.equals(imageH, imageDto.imageH) &&
            Objects.equals(sprite, imageDto.sprite) &&
            Objects.equals(imageW, imageDto.imageW) &&
            Objects.equals(imageX, imageDto.imageX) &&
            Objects.equals(imageY, imageDto.imageY);
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
