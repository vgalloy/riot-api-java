package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoDto implements Serializable {

    private static final long serialVersionUID = -241128866110684850L;

    private int attack;
    private int defense;
    private int difficulty;
    private int magic;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InfoDto infoDto = (InfoDto) o;
        return attack == infoDto.attack &&
                defense == infoDto.defense &&
                difficulty == infoDto.difficulty &&
                magic == infoDto.magic;
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
