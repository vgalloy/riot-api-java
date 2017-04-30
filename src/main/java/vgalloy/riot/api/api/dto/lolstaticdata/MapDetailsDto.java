package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class MapDetailsDto implements Serializable {

    private static final long serialVersionUID = 6137329570558590577L;

    private ImageDto image;
    private Long mapId;
    private String mapName;
    private List<Long> unpurchasableItemList;

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public Long getMapId() {
        return mapId;
    }

    public void setMapId(Long mapId) {
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
        if (!(o instanceof MapDetailsDto)) {
            return false;
        }
        MapDetailsDto that = (MapDetailsDto) o;
        return Objects.equals(image, that.image) &&
            Objects.equals(mapId, that.mapId) &&
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
