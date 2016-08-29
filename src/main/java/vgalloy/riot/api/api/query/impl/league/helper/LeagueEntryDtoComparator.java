package vgalloy.riot.api.api.query.impl.league.helper;

import vgalloy.riot.api.api.dto.league.LeagueEntryDto;

import java.util.Comparator;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 28/05/16.
 */
public class LeagueEntryDtoComparator implements Comparator<LeagueEntryDto> {

    @Override
    public int compare(LeagueEntryDto o1, LeagueEntryDto o2) {
        if (o1 == null) {
            if (o2 == null) {
                return 0;
            }
            return -1;
        } else {
            if (o2 == null) {
                return 1;
            }
            return o1.getLeaguePoints() - o2.getLeaguePoints();
        }
    }
}
