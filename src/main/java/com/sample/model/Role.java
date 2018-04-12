package com.sample.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@AttributeOverride(name = "id", column = @Column(name = "role_id",  
				   nullable = false, columnDefinition = "BIGINT UNSIGNED")) 
public class Role extends BaseModelAudit{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "role")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
