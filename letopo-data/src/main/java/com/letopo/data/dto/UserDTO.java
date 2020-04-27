package com.letopo.data.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class UserDTO extends SuperDTO {

    private String phone;

    private Integer loginType;

    private String openId;

    private String nickname;

    private String avatarUrl;

    private Integer level;

    private Date birthday;

    private Integer gender;

    private Date gmtLastLogin;

    private String lastLoginIp;

    private Integer status;

    /**
     * 登录成功，包装此参数
     */
    private String accessToken;
}
