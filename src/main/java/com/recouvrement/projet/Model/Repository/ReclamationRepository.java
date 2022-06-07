package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Reclamation;

public interface ReclamationRepository extends MongoRepository<Reclamation, String> {

}
