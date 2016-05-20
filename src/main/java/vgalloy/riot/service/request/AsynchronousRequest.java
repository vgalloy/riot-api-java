package vgalloy.riot.service.request;

/**
 * Created by Vincent on 21/05/2016.
 */
public interface AsynchronousRequest {

    /**
     * Execute the query asynchronously. You have to define a callback.
     */
    void start();
}
