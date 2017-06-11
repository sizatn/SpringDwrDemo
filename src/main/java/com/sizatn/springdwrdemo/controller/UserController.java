package com.sizatn.springdwrdemo.controller;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;

import com.sizatn.springdwrdemo.model.User;

@RemoteProxy(name = "userController")
public class UserController {

	@RemoteMethod
	public User getUser() {
		User user = new User();
		user.setUserno("001");
		user.setUsername("sizatn");
		user.setAddress("China");
		return user;
	}

}
