package com.bank.bankManagementApp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
@Data
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String transaction_id;
	
	String transaction_type;
	String medium;
	
	String fromAccountId;
	String toAccountId;
	
	@CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;
	
	
}
