package vgalloy.riot.api.dto;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MapDetailsDto {

    private ImageDto image;
    private long mapId;
    private String mapName;
    private List<Long> unpurchasableItemList;

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public List<Long> getUnpurchasableItemList() {
        return unpurchasableItemList;
    }

    public void setUnpurchasableItemList(List<Long> unpurchasableItemList) {
        this.unpurchasableItemList = unpurchasableItemList;
    }

    @Override
    public String toString() {
        return "MapDetailsDto{" +
                "image=" + image +
                ", mapId=" + mapId +
                ", mapName='" + mapName + '\'' +
                ", unpurchasableItemList=" + unpurchasableItemList +
                '}';
    }
}
