package com.vgalloy.riot.api.api.query.impl.match;

import com.vgalloy.riot.api.api.dto.mach.MatchDetail;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public interface GetMatchDetailByIdQuery extends AbstractQuery<GetMatchDetailByIdQuery, MatchDetail> {

    /**
     * Set the flag indicating whether or not to include match timeline data.
     *
     * @param includeTimeline include Timeline
     * @return this
     */
    GetMatchDetailByIdQuery includeTimeline(boolean includeTimeline);
}
