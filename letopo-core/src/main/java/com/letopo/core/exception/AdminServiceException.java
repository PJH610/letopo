package com.letopo.core.exception;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 10:33
 */
public class AdminServiceException extends ServiceException {

    public AdminServiceException(ServiceExceptionDefinition definition) {
        super(definition);
    }

    public AdminServiceException(String message, int code) {
        super(message,code);
    }

}
