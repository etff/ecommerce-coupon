package com.example.ecommercecoupon.domain.coupon.domain

import java.util.*

object CouponCodeGenerator {
    fun generateCode(): String {
        return UUID.randomUUID().toString()
    }
}
