package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

import java.util.Date;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:06
 */
@Data
public class SuperDO {

    private Long id;

    @TableField("gmt_update")
    private Date gmtUpdate;

    @TableField("gmt_create")
    private Date gmtCreate;

}
