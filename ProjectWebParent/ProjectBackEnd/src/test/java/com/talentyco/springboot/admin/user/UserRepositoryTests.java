package com.talentyco.springboot.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.talentyco.bisogne.common.entity.Role;
import com.talentyco.bisogne.common.entity.User;

@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateNewUserWithOneRole() {
		Role roleAdmin = entityManager.find(Role.class, 1);
		User userEmmanuel = new User("emmanuel.nietomu@talentyco.com", "emmanuel", "EmmaNieto", "Engineer");
		userEmmanuel.addRole(roleAdmin);
		
		User savedUser = userRepository.save(userEmmanuel);
		
		assertThat(savedUser.getId()).isGreaterThan(0);
	}
	
	
	
	@Test
	public void testCreateNewUserWithTwoRoles() {
		User userENieto = new User("emmanuel.nietomu@talentyco.com", "emmanuel", "EmmaNieto", "Engineer");
		Role roleEditor = new Role(2);
		Role roleAssistant = new Role(5);
		
		userENieto.addRole(roleEditor);
		userENieto.addRole(roleAssistant);
		
		User savedUser = userRepository.save(userENieto);
		
		assertThat(savedUser.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testListAllUsers() {
		Iterable<User> listUsers = userRepository.findAll();
		listUsers.forEach(user -> System.out.println(user));
	}
	
	
	
	
	
	
	
	
}
