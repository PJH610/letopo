package com.letopo.core.exception;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 10:34
 */
public class AppServiceException extends ServiceException {

    public AppServiceException(ServiceExceptionDefinition definition) {
        super(definition);
    }

    public AppServiceException(String message, int code) {
        super(message,code);
    }
}
