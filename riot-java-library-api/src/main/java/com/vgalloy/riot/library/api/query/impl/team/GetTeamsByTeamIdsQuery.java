package com.vgalloy.riot.library.api.query.impl.team;

import java.util.Map;

import com.vgalloy.riot.library.api.dto.team.TeamDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetTeamsByTeamIdsQuery extends Query<Map<String, TeamDto>> {

}
