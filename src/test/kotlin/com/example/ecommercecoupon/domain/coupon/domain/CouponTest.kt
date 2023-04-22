package com.example.ecommercecoupon.domain.coupon.domain

import com.example.ecommercecoupon.domain.coupon.domain.type.CouponStatus
import com.example.ecommercecoupon.domain.coupon.domain.type.DiscountType
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDateTime

internal class CouponTest : AnnotationSpec() {

    @Test
    fun `Coupon 생성 테스트`() {
        val coupon = Coupon(
            name = "test",
            couponCode = "test",
            discountType = DiscountType.RATE,
            startedAt = LocalDateTime.now(),
            endedAt = LocalDateTime.now(),
            maxDiscount = 1000,
            expiredDays = 1,
            countCount = 1,
            couponStatus = CouponStatus.ACTIVE,
            id = 1L,
        )

        coupon.name shouldBe "test"
        coupon.couponCode shouldBe "test"
        coupon.discountType shouldBe DiscountType.RATE
        coupon.maxDiscount shouldBe 1000
        coupon.expiredDays shouldBe 1
        coupon.countCount shouldBe 1
        coupon.couponStatus shouldBe CouponStatus.ACTIVE
        coupon.id shouldBe 1L
    }
}
