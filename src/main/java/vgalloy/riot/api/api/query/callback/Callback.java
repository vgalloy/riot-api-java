package vgalloy.riot.api.api.query.callback;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public interface Callback<RESPONSE> {

    /**
     * Action to proceed after request execute.
     *
     * @param response the response. It can be a Dto or an exception.
     */
    void process(RESPONSE response);
}
