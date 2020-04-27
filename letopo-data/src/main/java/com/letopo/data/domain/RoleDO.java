package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:14
 */
@TableName("unimall_role")
@Data
public class RoleDO extends SuperDO {

    private String name;

    private String desc;

    private Integer status;

}
