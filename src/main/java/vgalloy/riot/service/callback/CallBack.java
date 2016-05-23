package vgalloy.riot.service.callback;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016.
 *         FIXME Est-ce que cette classe est vraiment utile ?
 */
public interface CallBack<Dto> {

    /**
     * Action to proceed after request success.
     *
     * @param dto the dto
     */
    void onSuccess(Dto dto);
}
