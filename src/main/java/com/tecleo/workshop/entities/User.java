package com.tecleo.workshop.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public User() {}

	public User(Long id, String name, String email, String phone, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	

}
