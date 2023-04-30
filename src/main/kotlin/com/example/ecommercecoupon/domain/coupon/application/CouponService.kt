package com.example.ecommercecoupon.domain.coupon.application

import com.example.ecommercecoupon.domain.coupon.dto.CouponCreateRequest
import com.example.ecommercecoupon.domain.coupon.infra.CouponRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class CouponService(private val couponRepository: CouponRepository) {

    fun createCoupon(couponCreateRequest: CouponCreateRequest): Long {
        val toEntity = couponCreateRequest.toEntity()
        return couponRepository.save(toEntity).id
    }
}
