package com.recouvrement.projet.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recouvrement.projet.Controller.Service.ClientServiceImplement;
import com.recouvrement.projet.Model.Client;

@RestController
@RequestMapping("Client")
public class ClientController {
@Autowired
ClientServiceImplement clientServiceImplement;
@PostMapping
public Client AjoutClient(@RequestBody @Valid Client client)
{
return clientServiceImplement.addOneClient(client);	
}
@GetMapping
public List<Client> getAllClient()
{
return clientServiceImplement.findClients();	
}
@GetMapping("/{id}")
public Optional<Client> getMyClient(@PathVariable String id)
{
return clientServiceImplement.findOneClient(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(@PathVariable String id)
{
	clientServiceImplement.deleteClient(id);	

}

}
