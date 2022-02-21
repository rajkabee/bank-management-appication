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
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String address_id;
	private String country;
	private String state;
	private String district;
	private String municipality;
	private int ward;
	private String street;
	private int POB_no;
	@CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;
	

	
}
