package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter { it.name.contains(name, ignoreCase = true) }
        }
        return customers
    }

    fun create(customer: CustomerModel) {
        customers.add(
            CustomerModel(
                UUID.randomUUID().toString(),
                customer.name,
                customer.email
            )
        )
        print(customer)
    }

    fun update(customer: CustomerModel) {
        return customers.first { it.id == customer.id }.let {
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: String) {
        customers.removeIf { it.id == id }
    }
}