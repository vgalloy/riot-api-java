package com.vgalloy.riot.library.api.query.impl.match;

import com.vgalloy.riot.library.api.dto.mach.MatchDetail;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public interface GetMatchDetailByIdQuery extends Query<MatchDetail> {

    /**
     * Set the flag indicating whether or not to include match timeline data.
     *
     * @param includeTimeline include Timeline
     * @return this
     */
    GetMatchDetailByIdQuery includeTimeline(boolean includeTimeline);
}
