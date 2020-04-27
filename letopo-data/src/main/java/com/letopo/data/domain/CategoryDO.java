package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:08
 */
@Data
@TableName("unimall_category")
public class CategoryDO extends SuperDO {

    private String title;

    @TableField("parent_id")
    private Long parentId;

    /**
     * 图标
     */
    @TableField("icon_url")
    private String iconUrl;

    /**
     * 分类图片
     */
    @TableField("pic_url")
    private String picUrl;

    private Integer level;

}
