package com.letopo.data.dto.goods;

import lombok.Data;
import java.util.List;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class SpuTreeNodeDTO {

    private String value;

    private String label;

    private Long id;

    private List<SpuTreeNodeDTO> children;

}
