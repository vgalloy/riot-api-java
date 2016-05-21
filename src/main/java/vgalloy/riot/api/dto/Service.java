package vgalloy.riot.api.dto;

import java.util.List;

/**
 * Created by Vincent Galloy on 21/05/16.
 */
public class Service {
    private List<Incident> ncidents;
    private String name;
    private String slug;
    private String status;

    public List<Incident> getNcidents() {
        return ncidents;
    }

    public void setNcidents(List<Incident> ncidents) {
        this.ncidents = ncidents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Service{" +
                "ncidents=" + ncidents +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
