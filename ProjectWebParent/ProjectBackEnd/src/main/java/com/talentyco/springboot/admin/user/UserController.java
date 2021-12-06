package com.talentyco.springboot.admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.talentyco.bisogne.common.entity.User;

import javax.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private UserService userService;


	@GetMapping("/users")
	public String listAll(Model modelo) {
		
		List<User> listUsers = userService.listAll();
		modelo.addAttribute("listUsers", listUsers);
		
		return "users";
	}



	@GetMapping("/user")
	public  String home(@Valid Model modelo) {

		List<User> listUsers = userService.listAll();
		modelo.addAttribute("listUsers", listUsers);

		return "user";
	}






}
