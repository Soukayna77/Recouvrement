package com.recouvrement.projet.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reclamation {
@Id
private String id;
}
