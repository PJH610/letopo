package com.letopo.data.dto.appraise;

import com.letopo.data.dto.SuperDTO;
import lombok.Data;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class AppraiseRequestDTO extends SuperDTO {

    private Long orderId;

    private List<AppraiseRequestItemDTO> appraiseDTOList;

}


