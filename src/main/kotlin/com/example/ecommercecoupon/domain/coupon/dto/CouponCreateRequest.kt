package com.example.ecommercecoupon.domain.coupon.dto

import com.example.ecommercecoupon.domain.coupon.domain.Coupon
import com.example.ecommercecoupon.domain.coupon.domain.CouponCodeGenerator
import com.example.ecommercecoupon.domain.coupon.domain.type.CouponStatus
import com.example.ecommercecoupon.domain.coupon.domain.type.DiscountType
import java.time.LocalDate

data class CouponCreateRequest(
    val name: String,
    val discountType: DiscountType,
    val couponValue: Int,
    val startedAt: LocalDate,
    val endedAt: LocalDate,
    val maxDiscount: Int,
    val expiredDays: Int,
    val couponCount: Int,
) {
    fun toEntity(): Coupon {
        return Coupon(
            name = name,
            couponCode = CouponCodeGenerator.generateCode(),
            couponValue = couponValue,
            discountType = discountType,
            startedAt = startedAt,
            endedAt = endedAt,
            maxDiscount = maxDiscount,
            expiredDays = expiredDays,
            countCount = couponCount,
            couponStatus = CouponStatus.ACTIVE,
        )
    }
}
