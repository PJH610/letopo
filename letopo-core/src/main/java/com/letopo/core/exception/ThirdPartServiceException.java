package com.letopo.core.exception;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 19:36
 */
// 第三方接口服务异常
public class ThirdPartServiceException extends ServiceException {

    public ThirdPartServiceException(ServiceExceptionDefinition definition) {
        super(definition);
    }

    public ThirdPartServiceException(String message, int code) {
        super(message, code);
    }

}
