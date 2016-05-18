package vgalloy.riotapijava.dto;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 18/05/16.
 */
public class PlayerDto {

    private int championId;
    private int summonerId;
    private int teamId;

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(int summonerId) {
        this.summonerId = summonerId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "championId=" + championId +
                ", summonerId=" + summonerId +
                ", teamId=" + teamId +
                '}';
    }
}
