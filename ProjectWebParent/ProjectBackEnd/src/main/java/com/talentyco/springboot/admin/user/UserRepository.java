package com.talentyco.springboot.admin.user;

import java.util.List;

import com.talentyco.bisogne.common.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findAll();
}