package com.bank.bankManagementApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bank.bankManagementApp.entity.User;
import com.bank.bankManagementApp.repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	public User insertUserService(User user) {
		User user1 = userRepo.save(user);
		return user1;	
	}
	public User getUser(String id) {
		User user = userRepo.getById(id);
		return user;
	}
	@SuppressWarnings("unchecked")
	public List<User> getUsers(Pageable page) {
		List<User> users = (List<User>) userRepo.findAll(page)
		return users;
	}
	public void updateUser(User user) {
		userRepo.
		
	}
	
	

}
