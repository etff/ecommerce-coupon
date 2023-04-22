package com.example.ecommercecoupon.global.config

import jakarta.persistence.MappedSuperclass
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@MappedSuperclass
@EnableJpaAuditing
@Configuration
class JpaConfig
