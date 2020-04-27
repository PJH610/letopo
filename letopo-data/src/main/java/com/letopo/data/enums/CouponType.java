package com.letopo.data.enums;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public enum CouponType {
    COMMON(1, "普通券"),
    CDKEY(2, "兑换券"),
    ;

    CouponType(int code, String msg) {
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
