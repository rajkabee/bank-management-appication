package com.bank.bankManagementApp.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankManagementApp.entity.User;
import com.bank.bankManagementApp.services.UserService;

@RestController
public class UserRestController {
	@Autowired
	UserService userService;
	//create
	public String createUser(@RequestBody User user) {
		User savedUser = userService.insertUserService(user);
		if(savedUser==user){
			return "Success";
		}
		else {
			return "Failed";
		}
	}
	//read one
	public User getUser(@PathVariable String id) {
		User user = userService.getUser(id);
		return user;
	}
	
	//read all pageable
	public List<User> getUsers() {
		List<User> users = userService.getUsers();
		return users;
	}
	//update 
	public String updateUser(@RequestBody User user) {
		User savedUser = userService.getUser(user.getUserId());
		if(savedUser==user){
			userService.updateUser(user);
			return "success";
		}
		else {
			return "Failed";
		}
	}
	//delete
}
