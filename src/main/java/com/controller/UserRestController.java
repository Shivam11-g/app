package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.dao.UserAccountDAO;
import com.dao.UserDAO;
import com.model.Users;
import com.model.UserAccount;

@RestController
public class UserRestController {
	
	@Autowired
	UserDAO userdao;
	@Autowired
	UserAccountDAO uadao;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello from rest controller";
	}
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody Users u) {
		
//		UserAccount ua=u.getUserAccount();
//		ua.setUser(u);
		userdao.save(u);
		
		return "user added: "+u;
	}
	
	@GetMapping("/getuser")
	public List<Users> getuser() {
		
		return userdao.findAll();
	}
	
}
