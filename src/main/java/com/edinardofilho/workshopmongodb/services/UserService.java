package com.edinardofilho.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edinardofilho.workshopmongodb.domain.User;
import com.edinardofilho.workshopmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo; 
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
