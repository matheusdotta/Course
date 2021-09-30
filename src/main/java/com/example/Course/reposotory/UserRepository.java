package com.example.Course.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
