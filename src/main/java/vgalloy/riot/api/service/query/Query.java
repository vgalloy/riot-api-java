package vgalloy.riot.api.service.query;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 20/05/2016
 */
public interface Query<T> {

    /**
     * Execute the query now.
     *
     * @return The dto.
     */
    T execute();
}
