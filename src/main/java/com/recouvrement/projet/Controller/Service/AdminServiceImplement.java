

package com.recouvrement.projet.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recouvrement.projet.Model.Admin;
import com.recouvrement.projet.Model.Repository.AdminRepository;

@Service
public class AdminServiceImplement implements AdminInterfaceService {
@Autowired
AdminRepository adminRepository;
	@Override
	public Admin addOneAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> findAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Optional<Admin> findOneAdmin(String id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id);
	}

	@Override
	public void deleteAdmin(String id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
	}

}

