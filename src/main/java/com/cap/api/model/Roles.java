package com.cap.api.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Roles")
public class Roles {
	@Id
	@Column(name="Roleid")
	private int Roleid;
	@Column(name="Rolename")
	private String Rolename;
	@Column(name="description")
	private String description;
	@Column(name="active")
	private String active;
	
	

	public Roles() {
		super();
	}


	public Roles(int roleid, String rolename, String description, String active) {
		super();
		this.Roleid = roleid;
		this.Rolename = rolename;
		this.description = description;
		this.active = active;
	}


	public int getRoleid() {
		return Roleid;
	}


	public void setRoleid(int roleid) {
		Roleid = roleid;
	}


	public String getRolename() {
		return Rolename;
	}


	public void setRolename(String rolename) {
		Rolename = rolename;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}
	
	

	

}
