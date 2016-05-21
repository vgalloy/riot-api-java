package vgalloy.riot.api.dto;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 21/05/16.
 */
public class RuneDto {

    private String colloq;
    private boolean consumeOnFull;
    private boolean consumed;
    private int depth;
    private String description;
    private List<String> from;
    private String group;
    private boolean hideFromAll;
    private int id;
    private ImageDto image;
    private boolean inStore;
    private List<String> into;
    private Map<String, Boolean> maps;
    private String name;
    private String plaintext;
    private String requiredChampion;
    private MetaDataDto rune;
    private String sanitizedDescription;
    private int specialRecipe;
    private int stacks;
    private BasicDataStatsDto stats;
    private List<String> tags;

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public boolean isInStore() {
        return inStore;
    }

    public void setInStore(boolean inStore) {
        this.inStore = inStore;
    }

    public List<String> getInto() {
        return into;
    }

    public void setInto(List<String> into) {
        this.into = into;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Boolean> maps) {
        this.maps = maps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public void setRequiredChampion(String requiredChampion) {
        this.requiredChampion = requiredChampion;
    }

    public MetaDataDto getRune() {
        return rune;
    }

    public void setRune(MetaDataDto rune) {
        this.rune = rune;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(int specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public int getStacks() {
        return stacks;
    }

    public void setStacks(int stacks) {
        this.stacks = stacks;
    }

    public BasicDataStatsDto getStats() {
        return stats;
    }

    public void setStats(BasicDataStatsDto stats) {
        this.stats = stats;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RuneDto runeDto = (RuneDto) o;
        return consumeOnFull == runeDto.consumeOnFull &&
                consumed == runeDto.consumed &&
                depth == runeDto.depth &&
                hideFromAll == runeDto.hideFromAll &&
                id == runeDto.id &&
                inStore == runeDto.inStore &&
                specialRecipe == runeDto.specialRecipe &&
                stacks == runeDto.stacks &&
                Objects.equals(colloq, runeDto.colloq) &&
                Objects.equals(description, runeDto.description) &&
                Objects.equals(from, runeDto.from) &&
                Objects.equals(group, runeDto.group) &&
                Objects.equals(image, runeDto.image) &&
                Objects.equals(into, runeDto.into) &&
                Objects.equals(maps, runeDto.maps) &&
                Objects.equals(name, runeDto.name) &&
                Objects.equals(plaintext, runeDto.plaintext) &&
                Objects.equals(requiredChampion, runeDto.requiredChampion) &&
                Objects.equals(rune, runeDto.rune) &&
                Objects.equals(sanitizedDescription, runeDto.sanitizedDescription) &&
                Objects.equals(stats, runeDto.stats) &&
                Objects.equals(tags, runeDto.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colloq, consumeOnFull, consumed, depth, description, from, group, hideFromAll, id, image, inStore, into, maps, name, plaintext, requiredChampion, rune, sanitizedDescription, specialRecipe, stacks, stats, tags);
    }

    @Override
    public String toString() {
        return "RuneDto{" +
                "colloq='" + colloq + '\'' +
                ", consumeOnFull=" + consumeOnFull +
                ", consumed=" + consumed +
                ", depth=" + depth +
                ", description='" + description + '\'' +
                ", from=" + from +
                ", group='" + group + '\'' +
                ", hideFromAll=" + hideFromAll +
                ", id=" + id +
                ", image=" + image +
                ", inStore=" + inStore +
                ", into=" + into +
                ", maps=" + maps +
                ", name='" + name + '\'' +
                ", plaintext='" + plaintext + '\'' +
                ", requiredChampion='" + requiredChampion + '\'' +
                ", rune=" + rune +
                ", sanitizedDescription='" + sanitizedDescription + '\'' +
                ", specialRecipe=" + specialRecipe +
                ", stacks=" + stacks +
                ", stats=" + stats +
                ", tags=" + tags +
                '}';
    }
}
