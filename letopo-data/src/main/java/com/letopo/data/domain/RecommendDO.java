package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:14
 */
@TableName("unimall_recommend")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendDO extends SuperDO {

    @TableField("spu_id")
    private Long spuId;

    @TableField("recommend_type")
    private Integer recommendType;
}
