package com.recouvrement.projet.Model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.recouvrement.projet.Model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

}
