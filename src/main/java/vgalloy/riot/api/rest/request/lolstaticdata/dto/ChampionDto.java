package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionDto {

    private List<String> allytips;
    private String blurb;
    private List<String> enemytips;
    private int id;
    private ImageDto image;
    private InfoDto info;
    private String key;
    private String lore;
    private String name;
    private String partype;
    private PassiveDto passive;
    private List<RecommendedDto> recommended;
    private List<SkinDto> skins;
    private List<ChampionSpellDto> spells;
    private StatsDto stats;
    private List<String> tags;
    private String title;

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
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

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public PassiveDto getPassive() {
        return passive;
    }

    public void setPassive(PassiveDto passive) {
        this.passive = passive;
    }

    public List<RecommendedDto> getRecommended() {
        return recommended;
    }

    public void setRecommended(List<RecommendedDto> recommended) {
        this.recommended = recommended;
    }

    public List<SkinDto> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinDto> skins) {
        this.skins = skins;
    }

    public List<ChampionSpellDto> getSpells() {
        return spells;
    }

    public void setSpells(List<ChampionSpellDto> spells) {
        this.spells = spells;
    }

    public StatsDto getStats() {
        return stats;
    }

    public void setStats(StatsDto stats) {
        this.stats = stats;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChampionDto that = (ChampionDto) o;
        return id == that.id &&
                Objects.equals(allytips, that.allytips) &&
                Objects.equals(blurb, that.blurb) &&
                Objects.equals(enemytips, that.enemytips) &&
                Objects.equals(image, that.image) &&
                Objects.equals(info, that.info) &&
                Objects.equals(key, that.key) &&
                Objects.equals(lore, that.lore) &&
                Objects.equals(name, that.name) &&
                Objects.equals(partype, that.partype) &&
                Objects.equals(passive, that.passive) &&
                Objects.equals(recommended, that.recommended) &&
                Objects.equals(skins, that.skins) &&
                Objects.equals(spells, that.spells) &&
                Objects.equals(stats, that.stats) &&
                Objects.equals(tags, that.tags) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allytips, blurb, enemytips, id, image, info, key, lore, name, partype, passive, recommended, skins, spells, stats, tags, title);
    }

    @Override
    public String toString() {
        return "ChampionDto{" +
                "allytips=" + allytips +
                ", blurb='" + blurb + '\'' +
                ", enemytips=" + enemytips +
                ", id=" + id +
                ", image=" + image +
                ", info=" + info +
                ", key='" + key + '\'' +
                ", lore='" + lore + '\'' +
                ", name='" + name + '\'' +
                ", partype='" + partype + '\'' +
                ", passive=" + passive +
                ", recommended=" + recommended +
                ", skins=" + skins +
                ", spells=" + spells +
                ", stats=" + stats +
                ", tags=" + tags +
                ", title='" + title + '\'' +
                '}';
    }
}
