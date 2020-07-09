package com.tts.eComm.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.eComm.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

	public Role findByRole(String role);
}
