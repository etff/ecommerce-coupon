package com.example.ecommercecoupon.domain.coupon.api

import com.example.ecommercecoupon.domain.coupon.application.CouponService
import com.example.ecommercecoupon.domain.coupon.dto.CouponCreateRequest
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/coupons")
@RestController
class CouponApi(private val couponService: CouponService) {
    private val log = LoggerFactory.getLogger(javaClass)

    // create coupon
    @PostMapping
    fun createCoupon(@RequestBody request: CouponCreateRequest): ResponseEntity<Long> {
        log.info("createCoupon request: {}", request)
        val couponId = couponService.createCoupon(request)
        return ResponseEntity.ok(couponId)
    }
}
