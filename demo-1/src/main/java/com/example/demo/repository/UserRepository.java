package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

//@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<User, String> {

	


}
