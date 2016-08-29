package vgalloy.riot.api.api.dto.lolstatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shard implements Serializable {

    private static final long serialVersionUID = 1897851851401049259L;

    private String hostname;
    private List<String> locales;
    private String name;
    @JsonProperty("region_tag")
    private String regionTag;
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

    public String getRegionTag() {
        return regionTag;
    }

    public void setRegionTag(String regionTag) {
        this.regionTag = regionTag;
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
                Objects.equals(regionTag, shard.regionTag) &&
                Objects.equals(slug, shard.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, locales, name, regionTag, slug);
    }

    @Override
    public String toString() {
        return "Shard{" +
                "hostname='" + hostname + '\'' +
                ", locales=" + locales +
                ", name='" + name + '\'' +
                ", regionTag='" + regionTag + '\'' +
                ", slug='" + slug + '\'' +
                '}';
    }
}
