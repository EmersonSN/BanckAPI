package com.example.banckaccount

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

//Interface que extende o mongo que vem do Spring
interface AccountRespository : MongoRepository <Account, String> {

    fun finBtDocument(document: String): Optional<Account>
}