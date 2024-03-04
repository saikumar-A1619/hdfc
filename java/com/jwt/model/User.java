package com.jwt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="role")
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
    private String username;
    
    private String passward;
    
    private Role role;
	
	
}
