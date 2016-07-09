package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoldDto implements Serializable {

    private static final long serialVersionUID = -3635199494799414487L;

    private int base;
    private boolean purchasable;
    private int sell;
    private int total;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GoldDto goldDto = (GoldDto) o;
        return base == goldDto.base &&
                purchasable == goldDto.purchasable &&
                sell == goldDto.sell &&
                total == goldDto.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, purchasable, sell, total);
    }

    @Override
    public String toString() {
        return "GoldDto{" +
                "base=" + base +
                ", purchasable=" + purchasable +
                ", sell=" + sell +
                ", total=" + total +
                '}';
    }
}
