package com.tianji.promotion.service;

import com.tianji.promotion.domain.dto.UserCouponDTO;
import com.tianji.promotion.domain.po.Coupon;
import com.tianji.promotion.domain.po.UserCoupon;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户领取优惠券的记录，是真正使用的优惠券信息 服务类
 * </p>
 *
 * @author fenny
 * @since 2023-12-05
 */
public interface IUserCouponService extends IService<UserCoupon> {

    void receiveCoupon(Long couponId);

    void exchangeCoupon(String code);

    public void checkAndCreateUserCoupon(Long user, Coupon coupon, Long id);

    void checkAndCreateUserCouponNew(UserCouponDTO dto);

}
