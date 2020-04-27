package com.letopo.data.dto;

import lombok.Data;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class CategoryTreeNodeDTO {

    private String label;

    private Long value;

    private String fullName;

    private Long parent;

    private Integer level;

    private String iconUrl;

    private String picUrl;

    private List<CategoryTreeNodeDTO> children;

}
