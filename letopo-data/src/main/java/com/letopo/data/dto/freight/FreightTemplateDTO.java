package com.letopo.data.dto.freight;

import com.letopo.data.domain.FreightTemplateCarriageDO;
import com.letopo.data.domain.FreightTemplateDO;
import com.letopo.data.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FreightTemplateDTO extends SuperDTO {

    private FreightTemplateDO freightTemplateDO;

    private List<FreightTemplateCarriageDO> freightTemplateCarriageDOList;

}
