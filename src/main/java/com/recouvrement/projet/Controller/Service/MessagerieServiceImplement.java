package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recouvrement.projet.Model.Messagerie;
import com.recouvrement.projet.Model.Repository.MessagerieRepository;

@Service
public class MessagerieServiceImplement implements MessagerieInterfaceService {
@Autowired
MessagerieRepository messagerieRepository;
	@Override
	public Messagerie addOneMessagerie(Messagerie messagerie) {
		// TODO Auto-generated method stub
		return messagerieRepository.save(messagerie);
	}

	@Override
	public List<Messagerie> findMessageries() {
		// TODO Auto-generated method stub
		return messagerieRepository.findAll();
	}

	@Override
	public Optional<Messagerie> findOneMessagerie(String id) {
		// TODO Auto-generated method stub
		return messagerieRepository.findById(id);
	}

	@Override
	public void deleteMessagerie(String id) {
		// TODO Auto-generated method stub
		messagerieRepository.deleteById(id);
	}

}

