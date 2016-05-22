package vgalloy.riot.service.request;

import vgalloy.riot.service.callback.CallBack;
import vgalloy.riot.service.query.Query;

import java.util.Objects;

/**
 * Created by Vincent on 21/05/2016.
 */
public class AsynchronousRequestImpl<Dto> implements AsynchronousRequest {

    private Query<Dto> query;
    private CallBack<Dto> callback;
    private boolean isRunning;

    /**
     * Constructor.
     *
     * @param query    the query to execute
     * @param callBack the callback to execute after the request completed
     */
    public AsynchronousRequestImpl(Query<Dto> query, CallBack<Dto> callBack) {
        this.query = Objects.requireNonNull(query, "query can not be null");
        this.callback = Objects.requireNonNull(callBack, "callBack can not be null");
    }

    @Override
    public void run() {
        Dto dto = query.execute();
        callback.onSuccess(dto);
    }
}
