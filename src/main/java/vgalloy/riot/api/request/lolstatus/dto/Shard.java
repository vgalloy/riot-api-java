package vgalloy.riot.api.request.lolstatus.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class Shard {

    private String hostname;
    private List<String> locales;
    private String name;
    private String region_tag;
    private String slug;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion_tag() {
        return region_tag;
    }

    public void setRegion_tag(String region_tag) {
        this.region_tag = region_tag;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shard shard = (Shard) o;
        return Objects.equals(hostname, shard.hostname) &&
                Objects.equals(locales, shard.locales) &&
                Objects.equals(name, shard.name) &&
                Objects.equals(region_tag, shard.region_tag) &&
                Objects.equals(slug, shard.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, locales, name, region_tag, slug);
    }

    @Override
    public String toString() {
        return "Shard{" +
                "hostname='" + hostname + '\'' +
                ", locales=" + locales +
                ", name='" + name + '\'' +
                ", region_tag='" + region_tag + '\'' +
                ", slug='" + slug + '\'' +
                '}';
    }
}
