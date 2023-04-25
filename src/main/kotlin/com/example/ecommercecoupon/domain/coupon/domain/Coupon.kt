package com.example.ecommercecoupon.domain.coupon.domain

import com.example.ecommercecoupon.domain.coupon.domain.type.CouponStatus
import com.example.ecommercecoupon.domain.coupon.domain.type.DiscountType
import com.example.ecommercecoupon.global.model.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Coupon(
    val name: String,
    val couponCode: String,
    @Enumerated(EnumType.STRING)
    val discountType: DiscountType,
    val startedAt: LocalDateTime,
    val endedAt: LocalDateTime,
    val maxDiscount: Int,
    val expiredDays: Int,
    val countCount: Int,
    @Enumerated(EnumType.STRING)
    val couponStatus: CouponStatus,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
) : BaseEntity()
