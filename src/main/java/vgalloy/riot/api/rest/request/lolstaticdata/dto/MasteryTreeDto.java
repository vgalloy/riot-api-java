package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryTreeDto {

    @JsonProperty("Cunning")
    private List<MasteryTreeListDto> cunning;
    @JsonProperty("Ferocity")
    private List<MasteryTreeListDto> ferocity;
    @JsonProperty("Resolve")
    private List<MasteryTreeListDto> resolve;

    public List<MasteryTreeListDto> getCunning() {
        return cunning;
    }

    public void setCunning(List<MasteryTreeListDto> cunning) {
        this.cunning = cunning;
    }

    public List<MasteryTreeListDto> getFerocity() {
        return ferocity;
    }

    public void setFerocity(List<MasteryTreeListDto> ferocity) {
        this.ferocity = ferocity;
    }

    public List<MasteryTreeListDto> getResolve() {
        return resolve;
    }

    public void setResolve(List<MasteryTreeListDto> resolve) {
        this.resolve = resolve;
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
        return Objects.equals(cunning, that.cunning) &&
                Objects.equals(ferocity, that.ferocity) &&
                Objects.equals(resolve, that.resolve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, ferocity, resolve);
    }

    @Override
    public String toString() {
        return "MasteryTreeDto{" +
                "cunning=" + cunning +
                ", ferocity=" + ferocity +
                ", resolve=" + resolve +
                '}';
    }
}
