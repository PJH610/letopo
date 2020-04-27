package com.letopo.core.exception;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 14:34
 */
public class BizServiceException extends ServiceException {

    public BizServiceException(ServiceExceptionDefinition definition) {
        super(definition);
    }

    public BizServiceException(String message, int code) {
        super(message,code);
    }
}
