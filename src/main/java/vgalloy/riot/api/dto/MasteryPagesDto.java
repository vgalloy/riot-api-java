package vgalloy.riot.api.dto;

import java.util.Set;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
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
    public String toString() {
        return "MasteryPagesDto{" +
                "pages=" + pages +
                ", summonerId=" + summonerId +
                '}';
    }
}
