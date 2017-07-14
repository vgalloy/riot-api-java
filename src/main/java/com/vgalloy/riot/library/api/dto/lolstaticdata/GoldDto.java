package com.vgalloy.riot.library.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class GoldDto implements Serializable {

    private static final long serialVersionUID = -3635199494799414487L;

    private Integer base;
    private Boolean purchasable;
    private Integer sell;
    private Integer total;

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Boolean purchasable) {
        this.purchasable = purchasable;
    }

    public Integer getSell() {
        return sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoldDto)) {
            return false;
        }
        GoldDto goldDto = (GoldDto) o;
        return Objects.equals(base, goldDto.base) &&
            Objects.equals(purchasable, goldDto.purchasable) &&
            Objects.equals(sell, goldDto.sell) &&
            Objects.equals(total, goldDto.total);
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
