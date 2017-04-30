package vgalloy.riot.api.api.query;

/**
 * Created by Vincent on 20/05/2016.
 *
 * @author Vincent Galloy
 */
public interface Query<T> {

    /**
     * Execute the query now.
     *
     * @return The dto.
     */
    T execute();
}
