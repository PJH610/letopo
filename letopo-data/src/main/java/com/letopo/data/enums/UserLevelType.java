package com.letopo.data.enums;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public enum UserLevelType {
    COMMON(0, "普通会员"),
    VIP(1, "VIP会员"),
    ;

    UserLevelType(int code, String msg) {
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
