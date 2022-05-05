package com.CRUD.clienteCRUD.service;

import com.CRUD.clienteCRUD.dto.ClientDto;

public interface ClientService {
	
	public ClientDto updateClient(long id, String firstName, String lastName);
	public ClientDto updateFirstNameClient(ClientDto client);
	public ClientDto updateLastNameClient(ClientDto client);
	public ClientDto updateEmailClient(ClientDto client);

}
