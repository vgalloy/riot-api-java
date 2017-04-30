package vgalloy.riot.api.internal.query.impl;

import vgalloy.riot.api.api.query.callback.Callback;

/**
 * Created by Vincent Galloy on 26/05/16.
 *
 * @author Vincent Galloy
 */
public final class ThrowingCallBack<RESPONSE extends RuntimeException> implements Callback<RESPONSE> {

    private static final ThrowingCallBack<?> INSTANCE = new ThrowingCallBack<>();

    /**
     * Constructor.
     * To prevent instantiation
     */
    private ThrowingCallBack() {
        // Do nothing
    }

    @Override
    public void process(RESPONSE response) {
        throw response;
    }

    /**
     * Get the Callback instance.
     *
     * @param <T> the parametric type
     * @return the singleton instance
     */
    @SuppressWarnings("unchecked")
    public static <T extends RuntimeException> ThrowingCallBack<T> getInstance() {
        return (ThrowingCallBack<T>) INSTANCE;
    }
}
