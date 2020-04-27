package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:11
 */
@Data
public class GeneratorTableColumnDO {

    @TableField("Field")
    private String field;

    @TableField("Type")
    private String type;

    private String Null;

}
