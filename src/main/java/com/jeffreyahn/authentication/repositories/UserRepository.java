package com.jeffreyahn.authentication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jeffreyahn.authentication.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);
}
