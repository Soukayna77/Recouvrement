package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

}
