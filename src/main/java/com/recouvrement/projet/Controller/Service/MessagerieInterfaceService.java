package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import com.recouvrement.projet.Model.Messagerie;

public interface MessagerieInterfaceService {
	public Messagerie addOneMessagerie(Messagerie messagerie);
	public List<Messagerie> findMessageries();
	public Optional<Messagerie> findOneMessagerie(String id);
	public void deleteMessagerie(String id);
}
