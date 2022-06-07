package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

}
