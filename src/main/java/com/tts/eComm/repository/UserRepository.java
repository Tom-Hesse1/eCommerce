package com.tts.eComm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.eComm.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public List<User> findAll();
	
	public User findByUsername(String username);

	public User findByFirstname(String firstname);
	
	public User findByLastname(String fastname);
	
	public User findById(long id);
	
}
