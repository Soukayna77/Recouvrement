package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import com.recouvrement.projet.Model.Reclamation;

public interface ReclamationInterfaceService {
	public Reclamation addOneReclamation(Reclamation reclamation);
	public List<Reclamation> findReclamations();
	public Optional<Reclamation> findOneReclamation(String id);
	public void deleteReclamation(String id);
}
