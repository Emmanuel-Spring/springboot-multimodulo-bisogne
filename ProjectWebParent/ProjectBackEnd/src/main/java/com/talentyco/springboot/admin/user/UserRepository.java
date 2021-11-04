package com.talentyco.springboot.admin.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentyco.bisogne.common.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findAll();
}
