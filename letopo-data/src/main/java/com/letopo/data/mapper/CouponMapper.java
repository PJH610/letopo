package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.CouponDO;
import com.letopo.data.dto.CouponAdminDTO;
import com.letopo.data.dto.CouponDTO;
import com.letopo.data.model.KVModel;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface CouponMapper extends BaseMapper<CouponDO> {

    public Integer decCoupon(Long couponId);

    //这样写MyBatis无法直接映射泛型，只能用Long了
    public List<KVModel<Long,Long>> getUserCouponsCount(@Param("userId") Long userId, @Param("couponIds") List<Long> couponIds);

    public List<CouponDTO> getActiveCoupons();

    public List<CouponAdminDTO> getAdminCouponList(@Param("title")String title, @Param("type") Integer type, @Param("status")Integer status, @Param("now") Date now, @Param("offset") Integer offset, @Param("limit") Integer limit);

}
