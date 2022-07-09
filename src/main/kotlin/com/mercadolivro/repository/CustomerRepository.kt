package com.mercadolivro.repository

import com.mercadolivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<CustomerModel, Int> {

    // Note: Spring JPA - Like query
    fun getByNameContaining(name: String?): List<CustomerModel>
}