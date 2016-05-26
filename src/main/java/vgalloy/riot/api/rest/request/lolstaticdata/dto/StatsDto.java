package vgalloy.riot.api.rest.request.lolstaticdata.dto;

import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 23/05/16.
 */
public class StatsDto {

    private double armor;
    private double armorperlevel;
    private double attackdamage;
    private double attackdamageperlevel;
    private double attackrange;
    private double attackspeedoffset;
    private double attackspeedperlevel;
    private double crit;
    private double critperlevel;
    private double hp;
    private double hpperlevel;
    private double hpregen;
    private double hpregenperlevel;
    private double movespeed;
    private double mp;
    private double mpperlevel;
    private double mpregen;
    private double mpregenperlevel;
    private double spellblock;
    private double spellblockperlevel;

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getArmorperlevel() {
        return armorperlevel;
    }

    public void setArmorperlevel(double armorperlevel) {
        this.armorperlevel = armorperlevel;
    }

    public double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public double getAttackdamageperlevel() {
        return attackdamageperlevel;
    }

    public void setAttackdamageperlevel(double attackdamageperlevel) {
        this.attackdamageperlevel = attackdamageperlevel;
    }

    public double getAttackrange() {
        return attackrange;
    }

    public void setAttackrange(double attackrange) {
        this.attackrange = attackrange;
    }

    public double getAttackspeedoffset() {
        return attackspeedoffset;
    }

    public void setAttackspeedoffset(double attackspeedoffset) {
        this.attackspeedoffset = attackspeedoffset;
    }

    public double getAttackspeedperlevel() {
        return attackspeedperlevel;
    }

    public void setAttackspeedperlevel(double attackspeedperlevel) {
        this.attackspeedperlevel = attackspeedperlevel;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public double getCritperlevel() {
        return critperlevel;
    }

    public void setCritperlevel(double critperlevel) {
        this.critperlevel = critperlevel;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHpperlevel() {
        return hpperlevel;
    }

    public void setHpperlevel(double hpperlevel) {
        this.hpperlevel = hpperlevel;
    }

    public double getHpregen() {
        return hpregen;
    }

    public void setHpregen(double hpregen) {
        this.hpregen = hpregen;
    }

    public double getHpregenperlevel() {
        return hpregenperlevel;
    }

    public void setHpregenperlevel(double hpregenperlevel) {
        this.hpregenperlevel = hpregenperlevel;
    }

    public double getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(double movespeed) {
        this.movespeed = movespeed;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getMpperlevel() {
        return mpperlevel;
    }

    public void setMpperlevel(double mpperlevel) {
        this.mpperlevel = mpperlevel;
    }

    public double getMpregen() {
        return mpregen;
    }

    public void setMpregen(double mpregen) {
        this.mpregen = mpregen;
    }

    public double getMpregenperlevel() {
        return mpregenperlevel;
    }

    public void setMpregenperlevel(double mpregenperlevel) {
        this.mpregenperlevel = mpregenperlevel;
    }

    public double getSpellblock() {
        return spellblock;
    }

    public void setSpellblock(double spellblock) {
        this.spellblock = spellblock;
    }

    public double getSpellblockperlevel() {
        return spellblockperlevel;
    }

    public void setSpellblockperlevel(double spellblockperlevel) {
        this.spellblockperlevel = spellblockperlevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatsDto statsDto = (StatsDto) o;
        return Double.compare(statsDto.armor, armor) == 0 &&
                Double.compare(statsDto.armorperlevel, armorperlevel) == 0 &&
                Double.compare(statsDto.attackdamage, attackdamage) == 0 &&
                Double.compare(statsDto.attackdamageperlevel, attackdamageperlevel) == 0 &&
                Double.compare(statsDto.attackrange, attackrange) == 0 &&
                Double.compare(statsDto.attackspeedoffset, attackspeedoffset) == 0 &&
                Double.compare(statsDto.attackspeedperlevel, attackspeedperlevel) == 0 &&
                Double.compare(statsDto.crit, crit) == 0 &&
                Double.compare(statsDto.critperlevel, critperlevel) == 0 &&
                Double.compare(statsDto.hp, hp) == 0 &&
                Double.compare(statsDto.hpperlevel, hpperlevel) == 0 &&
                Double.compare(statsDto.hpregen, hpregen) == 0 &&
                Double.compare(statsDto.hpregenperlevel, hpregenperlevel) == 0 &&
                Double.compare(statsDto.movespeed, movespeed) == 0 &&
                Double.compare(statsDto.mp, mp) == 0 &&
                Double.compare(statsDto.mpperlevel, mpperlevel) == 0 &&
                Double.compare(statsDto.mpregen, mpregen) == 0 &&
                Double.compare(statsDto.mpregenperlevel, mpregenperlevel) == 0 &&
                Double.compare(statsDto.spellblock, spellblock) == 0 &&
                Double.compare(statsDto.spellblockperlevel, spellblockperlevel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(armor, armorperlevel, attackdamage, attackdamageperlevel, attackrange, attackspeedoffset, attackspeedperlevel, crit, critperlevel, hp, hpperlevel, hpregen, hpregenperlevel, movespeed, mp, mpperlevel, mpregen, mpregenperlevel, spellblock, spellblockperlevel);
    }

    @Override
    public String toString() {
        return "StatsDto{" +
                "armor=" + armor +
                ", armorperlevel=" + armorperlevel +
                ", attackdamage=" + attackdamage +
                ", attackdamageperlevel=" + attackdamageperlevel +
                ", attackrange=" + attackrange +
                ", attackspeedoffset=" + attackspeedoffset +
                ", attackspeedperlevel=" + attackspeedperlevel +
                ", crit=" + crit +
                ", critperlevel=" + critperlevel +
                ", hp=" + hp +
                ", hpperlevel=" + hpperlevel +
                ", hpregen=" + hpregen +
                ", hpregenperlevel=" + hpregenperlevel +
                ", movespeed=" + movespeed +
                ", mp=" + mp +
                ", mpperlevel=" + mpperlevel +
                ", mpregen=" + mpregen +
                ", mpregenperlevel=" + mpregenperlevel +
                ", spellblock=" + spellblock +
                ", spellblockperlevel=" + spellblockperlevel +
                '}';
    }
}
