package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:15
 */
@Data
@TableName("unimall_role_permission")
public class RolePermissionDO extends SuperDO {

    @TableField("role_id")
    private Long roleId;

    private String permission;

    private Integer deleted;

}
