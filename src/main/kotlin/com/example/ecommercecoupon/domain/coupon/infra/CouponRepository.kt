package com.example.ecommercecoupon.domain.coupon.infra

import com.example.ecommercecoupon.domain.coupon.domain.Coupon
import org.springframework.data.jpa.repository.JpaRepository

interface CouponRepository : JpaRepository<Coupon, Long>
