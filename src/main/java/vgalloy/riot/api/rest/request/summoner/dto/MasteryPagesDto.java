package vgalloy.riot.api.rest.request.summoner.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;
import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasteryPagesDto {

    private Set<MasteryPageDto> pages;
    private long summonerId;

    public Set<MasteryPageDto> getPages() {
        return pages;
    }

    public void setPages(Set<MasteryPageDto> pages) {
        this.pages = pages;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasteryPagesDto that = (MasteryPagesDto) o;
        return summonerId == that.summonerId &&
                Objects.equals(pages, that.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, summonerId);
    }

    @Override
    public String toString() {
        return "MasteryPagesDto{" +
                "pages=" + pages +
                ", summonerId=" + summonerId +
                '}';
    }
}
