package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import com.recouvrement.projet.Model.Offre;

public interface OffreInterfaceService {
	public Offre addOneOffre(Offre offre);
	public List<Offre> findOffres();
	public Optional<Offre> findOneOffre(String id);
	public void deleteOffre(String id);

}
