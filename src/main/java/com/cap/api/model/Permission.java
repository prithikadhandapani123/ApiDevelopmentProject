package com.cap.api.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Permission")
public class Permission {
	@Id
	@Column(name="permissionid")
	private String permissionid;
	@Column(name="permissionname")
	private String permissionname;
	@Column(name="description")
	private String description;
	@Column(name="active")
	private String active;
	
	
	

	public Permission() {
		super();
	}


	public Permission(String permissionid, String permissionname, String description, String active) {
		super();
		this.permissionid = permissionid;
		this.permissionname = permissionname;
		this.description = description;
		this.active = active;
	}


	public String getPermissionid() {
		return permissionid;
	}


	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}


	public String getPermissionname() {
		return permissionname;
	}


	public void setPermissionname(String permissionname) {
		this.permissionname = permissionname;
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
