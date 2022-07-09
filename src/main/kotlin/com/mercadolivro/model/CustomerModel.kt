package com.mercadolivro.model

import javax.persistence.*


@Entity(name = "customer")
data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    var name: String,

    @Column(unique = true, nullable = false)
    var email: String,
)
