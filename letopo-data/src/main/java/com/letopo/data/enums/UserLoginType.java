package com.letopo.data.enums;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public enum UserLoginType {
    REGISTER(0, "手机注册"),
    MP_WEIXIN(1, "WX小程序登录"),
    APP_WEIXIN(2, "WX第三方登录"),
    H5_WEIXIN(3, "H5微信登录")
    ;

    UserLoginType(int code, String msg) {
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

    public static boolean contains(Integer loginType) {
        if (loginType == null) {
            return false;
        }
        for (UserLoginType type : values()) {
            if (type.getCode() == loginType) {
                return true;
            }
        }
        return false;
    }


}
