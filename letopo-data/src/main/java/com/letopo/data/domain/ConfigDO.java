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
@TableName("unimall_config")
@AllArgsConstructor
@NoArgsConstructor
public class ConfigDO extends SuperDO {

    @TableField("key_word")
    private String keyWord;

    @TableField("value_worth")
    private String valueWorth;
}
