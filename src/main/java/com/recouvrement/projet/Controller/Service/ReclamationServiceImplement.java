package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recouvrement.projet.Model.Reclamation;
import com.recouvrement.projet.Model.Repository.ReclamationRepository;

@Service
public class ReclamationServiceImplement implements ReclamationInterfaceService {
@Autowired
ReclamationRepository reclamationRepository;
	@Override
	public Reclamation addOneReclamation(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return reclamationRepository.save(reclamation);
	}

	@Override
	public List<Reclamation> findReclamations() {
		// TODO Auto-generated method stub
		return reclamationRepository.findAll();
	}

	@Override
	public Optional<Reclamation> findOneReclamation(String id) {
		// TODO Auto-generated method stub
		return reclamationRepository.findById(id);
	}

	@Override
	public void deleteReclamation(String id) {
		// TODO Auto-generated method stub
		reclamationRepository.deleteById(id);
	}

}
