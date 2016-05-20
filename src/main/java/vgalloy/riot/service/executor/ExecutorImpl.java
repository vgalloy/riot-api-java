package vgalloy.riot.service.executor;

import vgalloy.riot.service.callback.CallBack;
import vgalloy.riot.service.query.Query;
import vgalloy.riot.service.request.AsynchronousRequest;
import vgalloy.riot.service.request.AsynchronousRequestImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vincent on 21/05/2016.
 */
public class ExecutorImpl implements Executor {

    private List<AsynchronousRequest> asynchronousQueries = new ArrayList<>();
    private boolean isRunning;

    @Override
    public <Dto> void addQuery(Query<Dto> query, CallBack<Dto> callBack) {
        AsynchronousRequest asynchronousRequest = new AsynchronousRequestImpl<Dto>(query, callBack);
        if (isRunning) {
            asynchronousRequest.start();
        } else {
            asynchronousQueries.add(asynchronousRequest);
        }
    }

    @Override
    public synchronized void start() {
        if (!isRunning) {
            isRunning = true;
            asynchronousQueries.stream().forEach(AsynchronousRequest::start);
        }
    }
}
