package com.letopo.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 17:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceExceptionDefinition {
    private int code;
    private String msg;
}
