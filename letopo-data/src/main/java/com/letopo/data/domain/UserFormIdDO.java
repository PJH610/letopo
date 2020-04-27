package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
@Data
@TableName("unimall_user_form_id")
public class UserFormIdDO extends SuperDO {

    @TableField("user_id")
    private Long userId;

    private String openid;

    @TableField("form_id")
    private String formId;


}
