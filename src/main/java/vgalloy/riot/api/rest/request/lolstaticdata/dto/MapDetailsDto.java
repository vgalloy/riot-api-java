package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MapDetailsDto that = (MapDetailsDto) o;
        return mapId == that.mapId &&
                Objects.equals(image, that.image) &&
                Objects.equals(mapName, that.mapName) &&
                Objects.equals(unpurchasableItemList, that.unpurchasableItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, mapId, mapName, unpurchasableItemList);
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
