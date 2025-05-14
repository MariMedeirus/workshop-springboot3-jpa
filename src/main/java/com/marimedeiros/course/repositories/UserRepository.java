package com.marimedeiros.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marimedeiros.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}
