package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);

}