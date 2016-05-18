package vgalloy.riotapijava.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class RuneSlotDto {

    private int runeId;
    private int runeSlotId;

    public int getRuneId() {
        return runeId;
    }

    public void setRuneId(int runeId) {
        this.runeId = runeId;
    }

    public int getRuneSlotId() {
        return runeSlotId;
    }

    public void setRuneSlotId(int runeSlotId) {
        this.runeSlotId = runeSlotId;
    }

    @Override
    public String toString() {
        return "RuneSlotDto{" +
                "runeId=" + runeId +
                ", runeSlotId=" + runeSlotId +
                '}';
    }
}
