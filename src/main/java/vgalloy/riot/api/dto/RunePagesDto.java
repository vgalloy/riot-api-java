package vgalloy.riot.api.dto;

import java.util.Objects;
import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class RunePagesDto {

    private Set<RunePageDto> pages;
    private long summonerId;

    public Set<RunePageDto> getPages() {
        return pages;
    }

    public void setPages(Set<RunePageDto> pages) {
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RunePagesDto that = (RunePagesDto) o;
        return summonerId == that.summonerId &&
                Objects.equals(pages, that.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, summonerId);
    }

    @Override
    public String toString() {
        return "RunePagesDto{" +
                "pages=" + pages +
                ", summonerId=" + summonerId +
                '}';
    }
}
