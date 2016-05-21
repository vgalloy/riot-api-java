package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ImageDto {

    private String full;
    private String group;
    private int h;
    private String sprite;
    private int w;
    private int x;
    private int y;

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

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ImageDto{" +
                "full='" + full + '\'' +
                ", group='" + group + '\'' +
                ", h=" + h +
                ", sprite='" + sprite + '\'' +
                ", w=" + w +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
