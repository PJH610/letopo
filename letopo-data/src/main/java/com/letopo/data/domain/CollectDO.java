package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("unimall_collect")
public class CollectDO extends SuperDO{
    @TableField("user_id")
    private Long userId;

    @TableField("spu_id")
    private Long spuId;

}