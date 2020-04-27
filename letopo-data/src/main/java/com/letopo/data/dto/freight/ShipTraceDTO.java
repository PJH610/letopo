package com.letopo.data.dto.freight;

import lombok.Data;

import java.util.List;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class ShipTraceDTO {

    /**
     * 运单号
     */
    private String shipNo;

    /**
     * 承运商
     */
    private String shipCode;

    /**
     * 承运商名称
     */
    private String shipName;

    private String errmsg;

    private Integer errcode;

    private List<ShipTraceItemDTO> traces;

}
