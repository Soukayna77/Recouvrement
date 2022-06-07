package com.recouvrement.projet.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contrat {
@Id
private String id;
private String codeContrat;
private String typeOffre;
private String numAppel;
private String dateActivation;
private String duree;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCodeContrat() {
	return codeContrat;
}
public void setCodeContrat(String codeContrat) {
	this.codeContrat = codeContrat;
}
public String getTypeOffre() {
	return typeOffre;
}
public void setTypeOffre(String typeOffre) {
	this.typeOffre = typeOffre;
}
public String getNumAppel() {
	return numAppel;
}
public void setNumAppel(String numAppel) {
	this.numAppel = numAppel;
}
public String getDateActivation() {
	return dateActivation;
}
public void setDateActivation(String dateActivation) {
	this.dateActivation = dateActivation;
}
public String getDuree() {
	return duree;
}
public void setDuree(String duree) {
	this.duree = duree;
}
@Override
public String toString() {
	return "Contrat [id=" + id + ", codeContrat=" + codeContrat + ", typeOffre=" + typeOffre + ", numAppel=" + numAppel
			+ ", dateActivation=" + dateActivation + ", duree=" + duree + "]";
}
public Contrat(String id, String codeContrat, String typeOffre, String numAppel, String dateActivation, String duree) {
	super();
	this.id = id;
	this.codeContrat = codeContrat;
	this.typeOffre = typeOffre;
	this.numAppel = numAppel;
	this.dateActivation = dateActivation;
	this.duree = duree;
}
public Contrat() {
	super();
	// TODO Auto-generated constructor stub
}

}
