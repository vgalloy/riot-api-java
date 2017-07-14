package com.vgalloy.riot.api.api.dto.summoner;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public class RunePagesDto implements Serializable {

    private static final long serialVersionUID = 2722680848747544996L;

    private Set<RunePageDto> pages;
    private Long summonerId;

    public Set<RunePageDto> getPages() {
        return pages;
    }

    public void setPages(Set<RunePageDto> pages) {
        this.pages = pages;
    }

    public Long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(Long summonerId) {
        this.summonerId = summonerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunePagesDto)) {
            return false;
        }
        RunePagesDto that = (RunePagesDto) o;
        return Objects.equals(pages, that.pages) &&
            Objects.equals(summonerId, that.summonerId);
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
