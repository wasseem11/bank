package com.accenture.aa.banking.dao.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table (name="USERS")
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="USER_TYPE")		//Add a column to see who is user who is customer
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="ID")
	private Long id; //use object class
	
	@Column (name="USERNAME",nullable=false, length=60)
	private String username;
	
	@Column (name="PASSWORD",nullable=false, length=100)
	private String password;
	
	@Column (name="FIRST_NAME",nullable=false)
	private String firstName;
	
	@Column (name="LAST_NAME",nullable=false)
	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
