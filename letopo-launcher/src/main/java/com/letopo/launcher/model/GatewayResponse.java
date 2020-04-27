package com.letopo.launcher.model;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 22:59
 */
@Data
public class GatewayResponse {
    private int errno;
    private String errmsg;
    private Object data;
    private long timestamp;
}
