package com.tts.eComm.model;

import java.util.Date;
import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long id;
	
	@Email(message = "Please provide a valid email address")
	@NotEmpty(message = "Please provide an email address")
	private String email;
	
	@Length(min = 5, message = "A username must have at least 5 characters")
	@Length(max = 20, message = "A username cannot have more than 15 characters")
	@Pattern(regexp = "[^\\s]+", message = "A username cannot contain spaces")
	private String username;
	
	@Length(min = 8, message = "A password must ahve at least 8 characters")
	private String password;
	
	@NotEmpty(message = "Please provide your first name")
	private String firstname;
	
	@NotEmpty(message = "please provide your last name")
	private String lastname;
	
	private Integer active;
	
	@CreationTimestamp
	private Date createdAt;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	public User(Long id,
			@Email(message = "Please provide a valid email address") @NotEmpty(message = "Please provide an email address") String email,
			@Length(min = 5, message = "A username must have at least 5 characters") @Length(max = 20, message = "A username cannot have more than 15 characters") @Pattern(regexp = "[^\\s]+", message = "A username cannot contain spaces") String username,
			@Length(min = 8, message = "A password must ahve at least 8 characters") String password,
			@NotEmpty(message = "Please provide your first name") String firstname,
			@NotEmpty(message = "please provide your last name") String lastname, Integer active, Date createdAt,
			Set<Role> roles) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.active = active;
		this.createdAt = createdAt;
		this.roles = roles;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", createdAt=" + createdAt + ", roles="
				+ roles + "]";
	}
	
	

}
