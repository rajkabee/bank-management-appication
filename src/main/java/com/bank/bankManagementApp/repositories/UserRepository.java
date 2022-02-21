package com.bank.bankManagementApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.bank.bankManagementApp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	Page<User> findByRoleId(@RequestParam("id") String id, Pageable pageable);
	
	@Query("select u from User u where u.userStatus = 1")
	public List<User> findAll();
	
	Page<User> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
	
	
}
