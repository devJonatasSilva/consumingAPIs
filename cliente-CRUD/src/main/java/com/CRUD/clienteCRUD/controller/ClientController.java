package com.CRUD.clienteCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.clienteCRUD.model.Client;
import com.CRUD.clienteCRUD.model.ClientRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClientController {
	
	@Autowired
	ClientRepository clientRepository;
	
	@PostMapping(path= "/client/addClient")
	public Client createNewClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@GetMapping(path= "/client/getClientList")
	public List<Client> getClietList(){
		return clientRepository.findAll();
	}
	
	@GetMapping(path= "/client/getClientById/{id}")
	public Client getClientById(@PathVariable("id") Long id) {
		return clientRepository.findById(id).get();
	}
	
	@RequestMapping(path= "client/updateClient", method = RequestMethod.PUT)
	public Client updateClient(@RequestBody Client client) {		
		return clientRepository.save(client);
	}
	
	@DeleteMapping(path= "/client/deletClient/{id}")
	public void deleteClientById(@PathVariable("id") Long id) {
		clientRepository.deleteById(id);
	}
	
	
}
