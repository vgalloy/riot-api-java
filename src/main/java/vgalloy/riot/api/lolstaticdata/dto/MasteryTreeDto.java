package vgalloy.riot.api.lolstaticdata.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class MasteryTreeDto {

    private List<MasteryTreeListDto> Cunning;
    private List<MasteryTreeListDto> Ferocity;
    private List<MasteryTreeListDto> Resolve;

    public List<MasteryTreeListDto> getCunning() {
        return Cunning;
    }

    public void setCunning(List<MasteryTreeListDto> cunning) {
        Cunning = cunning;
    }

    public List<MasteryTreeListDto> getFerocity() {
        return Ferocity;
    }

    public void setFerocity(List<MasteryTreeListDto> ferocity) {
        Ferocity = ferocity;
    }

    public List<MasteryTreeListDto> getResolve() {
        return Resolve;
    }

    public void setResolve(List<MasteryTreeListDto> resolve) {
        Resolve = resolve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasteryTreeDto that = (MasteryTreeDto) o;
        return Objects.equals(Cunning, that.Cunning) &&
                Objects.equals(Ferocity, that.Ferocity) &&
                Objects.equals(Resolve, that.Resolve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cunning, Ferocity, Resolve);
    }

    @Override
    public String toString() {
        return "MasteryTreeDto{" +
                "Cunning=" + Cunning +
                ", Ferocity=" + Ferocity +
                ", Resolve=" + Resolve +
                '}';
    }
}
