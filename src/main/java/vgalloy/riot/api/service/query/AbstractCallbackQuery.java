package vgalloy.riot.api.service.query;

import java.util.Objects;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.ServiceUnavailableException;

import vgalloy.riot.api.service.callback.Callback;
import vgalloy.riot.api.service.callback.DefaultCallBack;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 26/05/16.
 */
public abstract class AbstractCallbackQuery<QUERY extends AbstractQuery<QUERY, DTO>, DTO> implements Query<DTO> {

    private Callback<DTO> successCallback = new DefaultCallBack<>();

    private Callback<BadRequestException> badRequestExceptionCallback = new DefaultCallBack<>();
    private Callback<NotAuthorizedException> notAuthorizedExceptionCallback = new DefaultCallBack<>();
    private Callback<ForbiddenException> forbiddenExceptionCallback = new DefaultCallBack<>();
    private Callback<NotFoundException> notFoundExceptionCallback = new DefaultCallBack<>();
    private Callback<InternalServerErrorException> internalServerErrorExceptionCallback = new DefaultCallBack<>();
    private Callback<ServiceUnavailableException> serviceUnavailableExceptionCallback = new DefaultCallBack<>();

    @Override
    public DTO execute() {
        DTO result = null;
        try {
            result = executeWithError();
            successCallback.process(result);
        }  catch (BadRequestException e) {
            badRequestExceptionCallback.process(e);
        }  catch (NotAuthorizedException e) {
            notAuthorizedExceptionCallback.process(e);
        } catch (ForbiddenException e) {
            forbiddenExceptionCallback.process(e);
        } catch (NotFoundException e) {
            notFoundExceptionCallback.process(e);
        } catch (InternalServerErrorException e) {
            internalServerErrorExceptionCallback.process(e);
        } catch (ServiceUnavailableException e) {
            serviceUnavailableExceptionCallback.process(e);
        }
        return result;
    }

    /**
     * Child execute method. This method is allow to throw some exception {@link this#execute}
     *
     * @return the dto
     */
    protected abstract DTO executeWithError();

    /**
     * Define the on success callback.
     *
     * @param successCallback the callback
     * @return this
     */
    public QUERY onSuccess(Callback<DTO> successCallback) {
        this.successCallback = Objects.requireNonNull(successCallback, "successCallback can not be null");
        return (QUERY) this;
    }

    /**
     * Define the on BadRequestException callback.
     *
     * @param badRequestExceptionCallback the callback
     * @return this
     */
    public QUERY onBadRequestExceptionCallback(Callback<BadRequestException> badRequestExceptionCallback) {
        this.badRequestExceptionCallback = Objects.requireNonNull(badRequestExceptionCallback, "badRequestExceptionCallback can not be null");
        return (QUERY) this;
    }

    /**
     * Define the on NotAuthorizedException callback.
     *
     * @param notAuthorizedExceptionCallback the callback
     * @return this
     */
    public QUERY onNotAuthorizedException(Callback<NotAuthorizedException> notAuthorizedExceptionCallback) {
        this.notAuthorizedExceptionCallback = Objects.requireNonNull(notAuthorizedExceptionCallback, "notAuthorizedExceptionCallback can not be null");
        return (QUERY) this;
    }

    /**
     * Define the on ForbiddenException callback.
     *
     * @param forbiddenExceptionCallback the callback
     * @return this
     */
    public QUERY onForbiddenException(Callback<ForbiddenException> forbiddenExceptionCallback) {
        this.forbiddenExceptionCallback = Objects.requireNonNull(forbiddenExceptionCallback, "forbiddenExceptionCallback can not be null");
        return (QUERY) this;
    }

    /**
     * Define the on NotFoundException callback.
     *
     * @param notFoundExceptionCallback the callback
     * @return this
     */
    public QUERY onNotFoundException(Callback<NotFoundException> notFoundExceptionCallback) {
        this.notFoundExceptionCallback = Objects.requireNonNull(notFoundExceptionCallback, "notFoundExceptionCallback can not be null");
        return (QUERY) this;
    }

    /**
     * Define the on ServiceUnavailableException callback.
     *
     * @param serviceUnavailableExceptionCallback the callback
     * @return this
     */
    public QUERY onServiceUnavailableException(Callback<ServiceUnavailableException> serviceUnavailableExceptionCallback) {
        this.serviceUnavailableExceptionCallback = Objects.requireNonNull(serviceUnavailableExceptionCallback, "serviceUnavailableExceptionCallback can not be null");
        return (QUERY) this;
    }

    /**
     * Define the on InternalServerErrorException callback.
     *
     * @param internalServerErrorExceptionCallback the callback
     * @return this
     */
    public QUERY onInternalServerErrorException(Callback<InternalServerErrorException> internalServerErrorExceptionCallback) {
        this.internalServerErrorExceptionCallback = Objects.requireNonNull(internalServerErrorExceptionCallback, "internalServerErrorExceptionCallback can not be null");
        return (QUERY) this;
    }
}
