package vgalloy.riot.api.lolstatus.dto;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Service service = (Service) o;
        return Objects.equals(ncidents, service.ncidents) &&
                Objects.equals(name, service.name) &&
                Objects.equals(slug, service.slug) &&
                Objects.equals(status, service.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ncidents, name, slug, status);
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
