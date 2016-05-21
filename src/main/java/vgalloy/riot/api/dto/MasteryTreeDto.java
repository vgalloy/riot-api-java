package vgalloy.riot.api.dto;

import java.util.List;

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
    public String toString() {
        return "MasteryTreeDto{" +
                "Cunning=" + Cunning +
                ", Ferocity=" + Ferocity +
                ", Resolve=" + Resolve +
                '}';
    }
}
