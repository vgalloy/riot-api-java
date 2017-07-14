package com.vgalloy.riot.api.internal.query.callback;

/**
 * Created by Vincent on 21/05/2016.
 *
 * @author Vincent Galloy
 */
public interface Callback<RESPONSE> {

    /**
     * Action to proceed after request execute.
     *
     * @param response the response. It can be a Dto or an exception.
     */
    void process(RESPONSE response);
}
