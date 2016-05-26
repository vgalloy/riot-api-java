package vgalloy.riot.api.service.query;

import java.util.Objects;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;

import vgalloy.riot.api.service.callback.Callback;
import vgalloy.riot.api.service.callback.DefaultCallBack;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 26/05/16.
 */
public abstract class AbstractCallbackQuery<Dto> implements Query<Dto> {

    private Callback<Dto> successCallback = new DefaultCallBack<>();
    private Callback<NotFoundException> notFoundExceptionCallback = new DefaultCallBack<>();
    private Callback<InternalServerErrorException> internalServerErrorExceptionCallback = new DefaultCallBack<>();

    @Override
    public Dto execute() {
        Dto result = null;
        try {
            result = executeWithError();
            successCallback.process(result);
        } catch (NotFoundException e) {
            notFoundExceptionCallback.process(e);
        } catch (InternalServerErrorException e) {
            internalServerErrorExceptionCallback.process(e);
        }
        return result;
    }

    /**
     * Child execute method.
     *
     * @return the dto
     */
    protected abstract Dto executeWithError();

    /**
     * Define the on success callback.
     *
     * @param successCallback the callback
     * @return this
     */
    public AbstractCallbackQuery<Dto> onSuccess(Callback<Dto> successCallback) {
        this.successCallback = Objects.requireNonNull(successCallback, "successCallback can not be null");
        return this;
    }

    /**
     * Define the on NotFoundException callback.
     *
     * @param notFoundExceptionCallback the callback
     * @return this
     */
    public AbstractCallbackQuery<Dto> onNotFoundException(Callback<NotFoundException> notFoundExceptionCallback) {
        this.notFoundExceptionCallback = Objects.requireNonNull(notFoundExceptionCallback, "notFoundExceptionCallback can not be null");
        return this;
    }

    /**
     * Define the on InternalServerErrorException callback.
     *
     * @param internalServerErrorExceptionCallback the callback
     * @return this
     */
    public AbstractCallbackQuery<Dto> onInternalServerErrorException(Callback<InternalServerErrorException> internalServerErrorExceptionCallback) {
        this.notFoundExceptionCallback = Objects.requireNonNull(notFoundExceptionCallback, "internalServerErrorExceptionCallback can not be null");
        return this;
    }
}
