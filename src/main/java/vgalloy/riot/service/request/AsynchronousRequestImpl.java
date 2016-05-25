package vgalloy.riot.service.request;

import java.util.Objects;

import vgalloy.riot.service.callback.CallBack;
import vgalloy.riot.service.query.Query;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 21/05/2016..
 *         TODO Est-ce que cette classe est vraiment utile ?
 */
public class AsynchronousRequestImpl<Dto> implements AsynchronousRequest {

    private final Query<Dto> query;
    private final CallBack<Dto> callBack;

    /**
     * Constructor.
     *
     * @param query    the query to execute
     * @param callBack the callback to execute after the request completed
     */
    public AsynchronousRequestImpl(Query<Dto> query, CallBack<Dto> callBack) {
        this.query = Objects.requireNonNull(query, "query can not be null");
        this.callBack = Objects.requireNonNull(callBack, "callBack can not be null");
    }

    @Override
    public void run() {
        Dto dto = query.execute();
        callBack.onSuccess(dto);
    }
}
