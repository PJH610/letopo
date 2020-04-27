package com.letopo.plugin.core.exception;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 16:03
 */
public class PluginException extends RuntimeException {

    public PluginException() {

    }

    public PluginException(String msg) {
        super(msg);
    }
}
