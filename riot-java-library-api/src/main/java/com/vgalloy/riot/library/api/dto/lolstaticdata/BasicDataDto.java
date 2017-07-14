package com.vgalloy.riot.library.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 21/05/16.
 *
 * @author Vincent Galloy
 */
public class BasicDataDto implements Serializable {

    private static final long serialVersionUID = -2364330840093235732L;

    private String colloq;
    private Boolean consumeOnFull;
    private Boolean consumed;
    private Integer depth;
    private String description;
    private List<String> from;
    private GoldDto gold;
    private String group;
    private Boolean hideFromAll;
    private Integer id;
    private ImageDto image;
    private Boolean inStore;
    private List<String> into;
    private Map<String, Boolean> maps;
    private String name;
    private String plaintext;
    private String requiredChampion;
    private MetaDataDto rune;
    private String sanitizedDescription;
    private Integer specialRecipe;
    private Integer stacks;
    private BasicDataStatsDto stats;
    private List<String> tags;

    public String getColloq() {
        return colloq;
    }

    public void setColloq(String colloq) {
        this.colloq = colloq;
    }

    public Boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public void setConsumeOnFull(Boolean consumeOnFull) {
        this.consumeOnFull = consumeOnFull;
    }

    public Boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
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

    public GoldDto getGold() {
        return gold;
    }

    public void setGold(GoldDto gold) {
        this.gold = gold;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean isHideFromAll() {
        return hideFromAll;
    }

    public void setHideFromAll(Boolean hideFromAll) {
        this.hideFromAll = hideFromAll;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public Boolean isInStore() {
        return inStore;
    }

    public void setInStore(Boolean inStore) {
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

    public Integer getSpecialRecipe() {
        return specialRecipe;
    }

    public void setSpecialRecipe(Integer specialRecipe) {
        this.specialRecipe = specialRecipe;
    }

    public Integer getStacks() {
        return stacks;
    }

    public void setStacks(Integer stacks) {
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasicDataDto)) {
            return false;
        }
        BasicDataDto that = (BasicDataDto) o;
        return Objects.equals(colloq, that.colloq) &&
            Objects.equals(consumeOnFull, that.consumeOnFull) &&
            Objects.equals(consumed, that.consumed) &&
            Objects.equals(depth, that.depth) &&
            Objects.equals(description, that.description) &&
            Objects.equals(from, that.from) &&
            Objects.equals(gold, that.gold) &&
            Objects.equals(group, that.group) &&
            Objects.equals(hideFromAll, that.hideFromAll) &&
            Objects.equals(id, that.id) &&
            Objects.equals(image, that.image) &&
            Objects.equals(inStore, that.inStore) &&
            Objects.equals(into, that.into) &&
            Objects.equals(maps, that.maps) &&
            Objects.equals(name, that.name) &&
            Objects.equals(plaintext, that.plaintext) &&
            Objects.equals(requiredChampion, that.requiredChampion) &&
            Objects.equals(rune, that.rune) &&
            Objects.equals(sanitizedDescription, that.sanitizedDescription) &&
            Objects.equals(specialRecipe, that.specialRecipe) &&
            Objects.equals(stacks, that.stacks) &&
            Objects.equals(stats, that.stats) &&
            Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colloq, consumeOnFull, consumed, depth, description, from, gold, group, hideFromAll, id, image, inStore, into, maps, name, plaintext, requiredChampion, rune, sanitizedDescription, specialRecipe, stacks, stats, tags);
    }

    @Override
    public String toString() {
        return "BasicDataDto{" +
            "colloq='" + colloq + '\'' +
            ", consumeOnFull=" + consumeOnFull +
            ", consumed=" + consumed +
            ", depth=" + depth +
            ", description='" + description + '\'' +
            ", from=" + from +
            ", gold=" + gold +
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
