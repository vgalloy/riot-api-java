package vgalloy.riot.api.internal.query.impl;

import vgalloy.riot.api.api.query.callback.Callback;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 26/05/16.
 */
public final class DefaultCallBack<RESPONSE> implements Callback<RESPONSE> {

    @Override
    public void process(RESPONSE response) {
        // Do nothing
    }
}
