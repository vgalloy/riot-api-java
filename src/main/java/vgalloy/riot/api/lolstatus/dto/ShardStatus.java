package vgalloy.riot.api.lolstatus.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class ShardStatus {

    private String hostname;
    private List<String> locales;
    private String name;
    private String region_tag;
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

    public String getRegion_tag() {
        return region_tag;
    }

    public void setRegion_tag(String region_tag) {
        this.region_tag = region_tag;
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
                Objects.equals(region_tag, that.region_tag) &&
                Objects.equals(services, that.services) &&
                Objects.equals(slug, that.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, locales, name, region_tag, services, slug);
    }

    @Override
    public String toString() {
        return "ShardStatus{" +
                "hostname='" + hostname + '\'' +
                ", locales=" + locales +
                ", name='" + name + '\'' +
                ", region_tag='" + region_tag + '\'' +
                ", services=" + services +
                ", slug='" + slug + '\'' +
                '}';
    }
}
