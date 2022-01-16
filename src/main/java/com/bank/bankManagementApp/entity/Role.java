package com.bank.bankManagementApp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	private String role_name;
	@CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;
	public Role() {
	}
	public Role(int role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}
	public Role(String role_name) {
		super();
		this.role_name = role_name;
	}
	public Role(int role_id, String role_name, Date date_created, Date date_updated) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getDate_updated() {
		return date_updated;
	}
	public void setDate_updated(Date date_updated) {
		this.date_updated = date_updated;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + ", date_created=" + date_created
				+ ", date_updated=" + date_updated + "]";
	}
	
	
}
