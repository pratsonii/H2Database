package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	UserDao dao;
	
	@RequestMapping(method = RequestMethod.POST,name = "/CreateUser")
	public void createUser()
	{
		User u = new User();
		u.setUserName("Pratik");
		u.setLastName("Soni");
		
		dao.save(u);
	}
	
	@RequestMapping(method = RequestMethod.GET,name = "/getUser")
	public List<User> getUser()
	{
		
		List<User> u = dao.findAll();
		
		return u;
	}
}
