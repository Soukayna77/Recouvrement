package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import com.recouvrement.projet.Model.Admin;

public interface AdminInterfaceService {
	public Admin addOneAdmin(Admin admin);
	public List<Admin> findAdmins();
	public Optional<Admin> findOneAdmin(String id);
	public void deleteAdmin(String id);

}
