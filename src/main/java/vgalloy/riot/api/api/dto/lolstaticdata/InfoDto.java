package vgalloy.riot.api.api.dto.lolstaticdata;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Vincent Galloy on 23/05/16.
 *
 * @author Vincent Galloy
 */
public class InfoDto implements Serializable {

    private static final long serialVersionUID = -241128866110684850L;

    private Integer attack;
    private Integer defense;
    private Integer difficulty;
    private Integer magic;

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoDto)) {
            return false;
        }
        InfoDto infoDto = (InfoDto) o;
        return Objects.equals(attack, infoDto.attack) &&
            Objects.equals(defense, infoDto.defense) &&
            Objects.equals(difficulty, infoDto.difficulty) &&
            Objects.equals(magic, infoDto.magic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attack, defense, difficulty, magic);
    }

    @Override
    public String toString() {
        return "InfoDto{" +
            "attack=" + attack +
            ", defense=" + defense +
            ", difficulty=" + difficulty +
            ", magic=" + magic +
            '}';
    }
}
