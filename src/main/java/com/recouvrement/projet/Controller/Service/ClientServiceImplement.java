package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recouvrement.projet.Model.Client;
import com.recouvrement.projet.Model.Repository.ClientRepository;

@Service
public class ClientServiceImplement implements ClientInterfaceService {
@Autowired
ClientRepository clientRepository;
	@Override
	public Client addOneClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public List<Client> findClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> findOneClient(String id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id);
	}

	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}

}

