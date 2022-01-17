package com.bank.bankManagementApp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
@Data
@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long account_id;
	long account_number;
	String account_type;
	Customer customer;
	boolean is_active;
	@CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;

	
	
	
}
