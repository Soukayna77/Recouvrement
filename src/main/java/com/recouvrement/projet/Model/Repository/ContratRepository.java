package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Contrat;

public interface ContratRepository extends MongoRepository<Contrat, String> {

}
