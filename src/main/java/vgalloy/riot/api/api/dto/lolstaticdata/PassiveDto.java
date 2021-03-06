package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 23/05/16.
 *
 * @author Vincent Galloy
 */
public class PassiveDto implements Serializable {

    private static final long serialVersionUID = 9063337672565237156L;

    private String description;
    private ImageDto image;
    private String name;
    private String sanitizedDescription;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PassiveDto that = (PassiveDto) o;
        return Objects.equals(description, that.description) &&
            Objects.equals(image, that.image) &&
            Objects.equals(name, that.name) &&
            Objects.equals(sanitizedDescription, that.sanitizedDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, image, name, sanitizedDescription);
    }

    @Override
    public String toString() {
        return "PassiveDto{" +
            "description='" + description + '\'' +
            ", image=" + image +
            ", name='" + name + '\'' +
            ", sanitizedDescription='" + sanitizedDescription + '\'' +
            '}';
    }
}
