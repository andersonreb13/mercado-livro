package com.mercadolivro.service

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {
    
    fun create(book: BookModel) {
        bookRepository.save(book);
    }

    fun findAll(): List<BookModel> {
        return bookRepository.findAll().toList();
    }

    fun findActives(): List<BookModel> {
        return bookRepository.findByStatus(BookStatus.ACTIVE)
    }

    fun findById(id: Int): BookModel {
        return bookRepository.findById(id).orElseThrow()
    }

    fun deleteById(id: Int) {
        bookRepository.deleteById(id)
    }
}
