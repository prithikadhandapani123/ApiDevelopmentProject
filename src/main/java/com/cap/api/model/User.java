package com.cap.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
		
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "last_updated_at")
    private Date lastUpdatedAt = new Date();
	
	



	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn( name = "user_fid", referencedColumnName = "user_id")
	List<Roles> listofroles = new ArrayList<>();
	
	


	public User(int userId, String userName, String password, String role, String firstname, String middlename,
			String lastname, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		
	}


	
	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		
		
		if(obj==null || !(obj instanceof User) )
			return false;
		return this.userId==((User)obj).getUserId();
	}


	public List<Roles> getListofroles() {
		return listofroles;
	}



	public void setListofroles(List<Roles> listofroles) {
		this.listofroles = listofroles;
	}


	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}



	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	
	
	
	
}
