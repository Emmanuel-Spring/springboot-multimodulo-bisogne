package com.talentyco.springboot.admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentyco.bisogne.common.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> listAll() {
		return (List<User>)userRepository.findAll();
	}




}
