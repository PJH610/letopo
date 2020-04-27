package com.letopo.launcher.exception;

import com.letopo.core.exception.ServiceException;
import com.letopo.core.exception.ServiceExceptionDefinition;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 22:30
 */
public class LauncherServiceException extends ServiceException {

    public LauncherServiceException(ServiceExceptionDefinition exceptionDefinition) {
        super(exceptionDefinition);
    }

}
