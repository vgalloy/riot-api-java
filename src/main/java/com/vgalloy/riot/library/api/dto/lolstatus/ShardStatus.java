package com.vgalloy.riot.library.api.dto.lolstatus;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class ShardStatus implements Serializable {

    private static final long serialVersionUID = -6185986384894149507L;

    private String hostname;
    private List<String> locales;
    private String name;
    @JsonProperty("region_tag")
    private String regionTag;
    private List<Service> services;
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

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
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
        ShardStatus that = (ShardStatus) o;
        return Objects.equals(hostname, that.hostname) &&
            Objects.equals(locales, that.locales) &&
            Objects.equals(name, that.name) &&
            Objects.equals(regionTag, that.regionTag) &&
            Objects.equals(services, that.services) &&
            Objects.equals(slug, that.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, locales, name, regionTag, services, slug);
    }

    @Override
    public String toString() {
        return "ShardStatus{" +
            "hostname='" + hostname + '\'' +
            ", locales=" + locales +
            ", name='" + name + '\'' +
            ", regionTag='" + regionTag + '\'' +
            ", services=" + services +
            ", slug='" + slug + '\'' +
            '}';
    }
}
