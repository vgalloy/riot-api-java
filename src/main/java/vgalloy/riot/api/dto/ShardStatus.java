package vgalloy.riot.api.dto;

import java.util.List;

/**
 * Created by Vincent Galloy on 21/05/16.
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
