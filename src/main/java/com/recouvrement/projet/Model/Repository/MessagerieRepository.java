package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Messagerie;

public interface MessagerieRepository extends MongoRepository<Messagerie, String> {

}
