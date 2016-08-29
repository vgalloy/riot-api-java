package vgalloy.riot.api.internal.rest.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 28/05/16.
 *         This annotation signify the request doesn't count in your rate limit
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RiotNoLimitRate {

}
