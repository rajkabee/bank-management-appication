package com.bank.bankManagementApp.entity;

import java.util.Date;

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


@Entity
public class User {
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
	@OneToOne
	private DBFile profilePic;
	
	@CreatedDate
	Date date_created;
	@LastModifiedDate
	Date date_updated;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(long user_id, String first_name, String middle_name, String last_name, String contact, String email,
			String gender, Date dob, String password, boolean active, Address address, Role role, DBFile profilePic) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.contact = contact;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.password = password;
		this.active = active;
		this.address = address;
		this.role = role;
		this.profilePic = profilePic;
	}



	public User(String first_name, String middle_name, String last_name, String contact, String email, String gender,
			Date dob, String password, boolean active, Address address, Role role, DBFile profilePic) {
		super();
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.contact = contact;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.password = password;
		this.active = active;
		this.address = address;
		this.role = role;
		this.profilePic = profilePic;
	}



	public User(long user_id, String first_name, String middle_name, String last_name, String contact, String email,
			String gender, Date dob, String password, boolean active, Address address, Role role, DBFile profilePic,
			Date date_created, Date date_updated) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.contact = contact;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.password = password;
		this.active = active;
		this.address = address;
		this.role = role;
		this.profilePic = profilePic;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}



	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	public DBFile getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(DBFile profilePic) {
		this.profilePic = profilePic;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", contact=" + contact + ", email=" + email + ", gender=" + gender
				+ ", dob=" + dob + ", address=" + address + ", role=" + role + ", profilePic=" + profilePic
				+ ", date_created=" + date_created + ", date_updated=" + date_updated + "]";
	}
	
	
	
	
}
