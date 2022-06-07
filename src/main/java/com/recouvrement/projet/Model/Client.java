package com.recouvrement.projet.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
@Id
	private String id;
    private String codeClient;
	private String nom;
	private String prenom;
	private int age;
	private String adresse1;
	private String adresse2;
	private String tel1;
	private String tel2;
	private String cin;
	private String grade;
	private String email;
	private String mdp;
	private String matFiscal;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getMatFiscal() {
		return matFiscal;
	}
	public void setMatFiscal(String matFiscal) {
		this.matFiscal = matFiscal;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", codeClient=" + codeClient + ", nom=" + nom + ", prenom=" + prenom + ", age="
				+ age + ", adresse1=" + adresse1 + ", adresse2=" + adresse2 + ", tel1=" + tel1 + ", tel2=" + tel2
				+ ", cin=" + cin + ", grade=" + grade + ", email=" + email + ", mdp=" + mdp + ", matFiscal=" + matFiscal
				+ "]";
	}
	public Client(String id, String codeClient, String nom, String prenom, int age, String adresse1, String adresse2,
			String tel1, String tel2, String cin, String grade, String email, String mdp, String matFiscal) {
		super();
		this.id = id;
		this.codeClient = codeClient;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse1 = adresse1;
		this.adresse2 = adresse2;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.cin = cin;
		this.grade = grade;
		this.email = email;
		this.mdp = mdp;
		this.matFiscal = matFiscal;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
