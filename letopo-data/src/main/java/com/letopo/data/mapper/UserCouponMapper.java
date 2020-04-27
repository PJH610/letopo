package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.UserCouponDO;
import com.letopo.data.dto.UserCouponDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface UserCouponMapper extends BaseMapper<UserCouponDO> {

    public List<UserCouponDTO> getUserCoupons(Long userId);

    public UserCouponDTO getUserCouponById(@Param("userCouponId") Long userCouponId, @Param("userId") Long userId);

}
