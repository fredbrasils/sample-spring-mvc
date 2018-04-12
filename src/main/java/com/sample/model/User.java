package com.sample.model;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "user")
@AttributeOverride(name = "id", column = @Column(name = "user_id",  
				   nullable = false, columnDefinition = "BIGINT UNSIGNED"))  
public class User extends BaseModelAudit{

	private static final long serialVersionUID = 1L;

	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	// @NotEmpty(message = "*Please provide an email")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	// @NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;

	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;

	@Column(name = "last_name")
	// @NotEmpty(message = "*Please provide your last name")
	private String lastName;

	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
