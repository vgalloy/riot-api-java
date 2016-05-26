package vgalloy.riot.service.callback;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 */
public interface Callback<Dto> {

    /**
     * Action to proceed after request success.
     *
     * @param dto the dto
     */
    void process(Dto dto);
}
