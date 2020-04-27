package com.letopo.data.enums;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public enum BizType {
    GOODS(1, "商品"),
    COMMENT(2, "评价")
    ;

    BizType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
