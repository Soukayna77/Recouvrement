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

import com.recouvrement.projet.Controller.Service.AdminServiceImplement;
import com.recouvrement.projet.Model.Admin;

@RestController
@RequestMapping("Admin")
public class AdminController {
@Autowired
AdminServiceImplement adminServiceImplement;
@PostMapping
public Admin AjoutAdmin(@RequestBody @Valid Admin admin)
{
return adminServiceImplement.addOneAdmin(admin);	
}
@GetMapping
public List<Admin> getAllAdmin()
{
return adminServiceImplement.findAdmins();	
}
@GetMapping("/{id}")
public Optional<Admin> getMyAdmin(@PathVariable String id)
{
return adminServiceImplement.findOneAdmin(id);	
}
@DeleteMapping("/{id}")
public void deleteOne(@PathVariable String id)
{
	adminServiceImplement.deleteAdmin(id);	

}

}
