package com.desperate.gromov_clo_bot.repository

import com.desperate.gromov_clo_bot.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Int> {

}