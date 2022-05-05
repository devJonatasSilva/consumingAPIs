package com.CRUD.clienteCRUD.service;

import org.springframework.stereotype.Service;

import com.CRUD.clienteCRUD.dto.ClientDto;

@Service
public class ClientServiceImpl implements ClientService{
	
	

	@Override
	public ClientDto updateClient(long id, String firstName, String lastName) {
		ClientDto clientDto = new ClientDto();
		clientDto.setFirstName(firstName);
		clientDto.setLastName(lastName);
		clientDto.setEmail(generateEmail(firstName, lastName));

		return clientDto;
	}

	

	@Override
	public ClientDto updateFirstNameClient(ClientDto client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDto updateLastNameClient(ClientDto client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDto updateEmailClient(ClientDto client) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private String generateEmail(String firstName, String lastName) {
		char[] lastNameArray = lastName.toCharArray();
		lastNameArray[0] = Character.toUpperCase(lastNameArray[0]);
		String lastNameCamelCase = new String(lastNameArray);
		
		return "email.do."+firstName+lastNameCamelCase+"@dominio.com";
	}
	
	

}
