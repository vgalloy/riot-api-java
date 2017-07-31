package vgalloy.riot.api.internal.service;

import java.util.Objects;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vgalloy.riot.api.api.query.AbstractCallbackQuery;
import vgalloy.riot.api.api.query.Query;

/**
 * Created by Vincent Galloy on 31/07/2017
 *
 * @author Vincent Galloy
 */
public final class QueryTester {

    private static final Logger ABSTRACT_TEST_LOGGER = LoggerFactory.getLogger(AbstractTest.class);

    private final String queryName;
    private String code = "200";

    /**
     * Static factory for building {@link QueryTester}.
     *
     * @param queryName the name of the query. This name will be display in console.
     * @return the query tester
     */
    public static QueryTester of(String queryName) {
        return new QueryTester(queryName);
    }

    /**
     * Constructor.
     *
     * @param queryName the query name
     */
    private QueryTester(String queryName) {
        this.queryName = Objects.requireNonNull(queryName, "queryName can not be null");
    }

    /**
     * Assert the query is correct.
     *
     * @return this
     */
    public QueryTester test(AbstractCallbackQuery<? extends Query<?>, ?> query) {
        query.onBadRequestExceptionCallback(e -> code = "400")
                .onNotAuthorizedException(e -> code = "401")
                .onForbiddenException(e -> code = "403")
                .onNotFoundException(e -> code = "404")
                .onInternalServerErrorException(e -> code = "500")
                .onServiceUnavailableException(e -> code = "503")
                .execute();
        return this;
    }

    /**
     * End the assertion.
     */
    public void end() {
        print(code);
    }

    public void end(int code) {
        print(String.valueOf(code));
    }

    /**
     * Print the result as a formatted String.
     *
     * @param code the code
     */
    private void print(String code) {
        StringBuilder stringBuilder = new StringBuilder(queryName + " ");
        IntStream.range(queryName.length(), 50).asLongStream().forEach(e -> stringBuilder.append("."));
        String message = stringBuilder.append(" [ ")
                .append(code)
                .append(" ]")
                .toString();
        if ("200".equals(code)) {
            ABSTRACT_TEST_LOGGER.info("{}", message);
        } else if ("403".equals(code)) {
            ABSTRACT_TEST_LOGGER.error("{}", message);
        } else {
            ABSTRACT_TEST_LOGGER.warn("{}", message);
        }
    }
}
