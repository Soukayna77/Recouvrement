package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Offre;

public interface OffreRepository extends MongoRepository<Offre, String> {

}
