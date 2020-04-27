package com.letopo.data.dto.order;

import com.letopo.data.domain.OrderSkuDO;
import com.letopo.data.dto.SuperDTO;
import com.letopo.data.dto.freight.ShipTraceDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
@Data
public class OrderDTO extends SuperDTO {

    /**
     * 用户下单渠道
     */
    private String channel;

    private String orderNo;

    private Long userId;

    private Integer status;

    private Integer skuOriginalTotalPrice;
    /**
     * 商品总价
     */
    private Integer skuTotalPrice;

    private Integer freightPrice;

    private Integer couponPrice;

    private Long couponId;

    /**
     * 计算优惠后，实际需要支付的价格
     */
    private Integer actualPrice;

    private Integer payPrice;

    /**
     * 支付流水号 (第三方)
     */
    private String payId;

    /**
     * 第三方支付渠道
     */
    private String payChannel;

    private Date gmtPay;

    private String shipNo;

    /**
     * 承运商
     */
    private String shipCode;

    private String province;

    private String city;

    private String county;

    private String address;

    private String phone;

    private String consignee;

    private String mono;

    private Integer adminMonoLevel;

    private String adminMono;

    private String refundReason;

    private Date gmtShip;

    /**
     * 确实收货时间
     */
    private Date gmtConfirm;

    private List<OrderSkuDO> skuList;

    private ShipTraceDTO shipTraceDTO;

}
