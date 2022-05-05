package com.CRUD.clienteCRUD.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private long id;
	
	
	@JsonProperty("firstName")
	private String firstName;
	
	
	@JsonProperty("lastName")
	private String lastName;
	
	
	@JsonProperty("email")
	private String email;
	
	

}
