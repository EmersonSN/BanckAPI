package com.example.banckaccount

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

//Interface que extende o mongo que vem do Spring
interface AccountRepository : MongoRepository <Account, String> {

    fun findByDocument(document: String): Optional<Account>
}