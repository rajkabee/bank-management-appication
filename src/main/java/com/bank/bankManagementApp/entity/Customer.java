package com.bank.bankManagementApp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long user_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String contact;
	private String email;
	private String gender;
	private Date dob;
	private String password;
	private boolean active;
	
	@OneToOne
	private Address address;
	@OneToOne
	private Role role;
	@OneToMany
	private List<DBFile> files;
	
	@CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;
	
	
	
}
