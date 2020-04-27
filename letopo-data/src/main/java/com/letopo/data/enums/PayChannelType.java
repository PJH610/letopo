package com.letopo.data.enums;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public enum PayChannelType {
    WEPAY("WX", "微信支付"),
    ALIPAY("ALI", "支付宝"),
    OFFLINE("OFFLINE", "线下支付"),
    ;

    PayChannelType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
