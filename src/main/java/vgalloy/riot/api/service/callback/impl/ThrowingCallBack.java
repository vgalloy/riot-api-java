package vgalloy.riot.api.service.callback.impl;

import vgalloy.riot.api.service.callback.Callback;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 26/05/16.
 */
public final class ThrowingCallBack<RESPONSE extends RuntimeException> implements Callback<RESPONSE> {

    @Override
    public void process(RESPONSE response) {
        throw response;
    }
}
