package com.letopo.core.exception;

import java.io.Serializable;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 17:35
 */
public abstract class ServiceException extends Exception implements Serializable {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ServiceException() {
    }

    public ServiceException(String message, int code) {
        super(message);
        this.code = code;
    }

    public ServiceException(ServiceExceptionDefinition definition) {
        super(definition.getMsg());
        this.code = definition.getCode();
    }
}