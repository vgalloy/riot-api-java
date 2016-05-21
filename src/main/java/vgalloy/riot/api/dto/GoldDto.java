package vgalloy.riot.api.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class GoldDto {

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
    public String toString() {
        return "GoldDto{" +
                "base=" + base +
                ", purchasable=" + purchasable +
                ", sell=" + sell +
                ", total=" + total +
                '}';
    }
}
