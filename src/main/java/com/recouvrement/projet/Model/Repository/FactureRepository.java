package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Facture;

public interface FactureRepository extends MongoRepository<Facture, String> {

}
