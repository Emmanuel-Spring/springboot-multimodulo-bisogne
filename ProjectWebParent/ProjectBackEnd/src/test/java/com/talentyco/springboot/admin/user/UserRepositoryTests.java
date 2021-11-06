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
		User userEmmanuel = new User("aaanietomu@talentyco.com", "emmaanuel", "EmmaaNieto", "Nieto");
		userEmmanuel.addRole(roleAdmin);

		User savedUser = userRepository.save(userEmmanuel);

		assertThat(savedUser.getId()).isGreaterThan(0);
	}


	@Test
	public void testCreateNewUserWithTwoRoles() {
		User userENietoo = new User("MInietomu@talentyco.com", "emm1223654", "Emmanuel", "Nietzhe");
		Role roleEditor = new Role(113);
		Role roleAssistant = new Role(116);

		userENietoo.addRole(roleEditor);
		userENietoo.addRole(roleAssistant);

		User savedUser = userRepository.save(userENietoo);

		assertThat(savedUser.getId()).isGreaterThan(0);
	}



	@Test
	public void testListAllUsers() {
		Iterable<User> listUsers = userRepository.findAll();
		listUsers.forEach(user -> System.out.println(user));
	}

	@Test
	public void testGetUserById() {

		User userNam = userRepository.findById(1).get();
		System.out.println(userNam);
		assertThat(userNam).isNotNull();
	}

	@Test
	public void testUpdateUserDetails() {
		User userNam = userRepository.findById(1).get();
		userNam.setEnabled(true);
		userNam.setEmail("namjavaprogrammer@gmail.com");

		userRepository.save(userNam);
	}

	@Test
	public void testUpdateUserRoles() {
		User userRavi = userRepository.findById(2).get();
		Role roleEditor = new Role(3);
		Role roleSalesperson = new Role(2);

		userRavi.getRoles().remove(roleEditor);
		userRavi.addRole(roleSalesperson);

		userRepository.save(userRavi);
	}

	@Test
	public void testDeleteUser() {
		Integer userId = 15;
		userRepository.deleteById(userId);

	}

//	@Test
//	public void testGetUserByEmail() {
//		String email = "ravi@gmail.com";
//		User user = userRepository.getUserByEmail(email);
//
//		assertThat(user).isNotNull();
//	}
//
//	@Test
//	public void testCountById() {
//		Integer id = 1;
//		Long countById = repo.countById(id);
//
//		assertThat(countById).isNotNull().isGreaterThan(0);
//	}
//
//	@Test
//	public void testDisableUser() {
//		Integer id = 1;
//		repo.updateEnabledStatus(id, false);
//
//	}
//
//	@Test
//	public void testEnableUser() {
//		Integer id = 3;
//		repo.updateEnabledStatus(id, true);
//
//	}
//
//	@Test
//	public void testListFirstPage() {
//		int pageNumber = 0;
//		int pageSize = 4;
//
//		Pageable pageable = PageRequest.of(pageNumber, pageSize);
//		Page<User> page = repo.findAll(pageable);
//
//		List<User> listUsers = page.getContent();
//
//		listUsers.forEach(user -> System.out.println(user));
//
//		assertThat(listUsers.size()).isEqualTo(pageSize);
//	}
//
//	@Test
//	public void testSearchUsers() {
//		String keyword = "bruce";
//
//		int pageNumber = 0;
//		int pageSize = 4;
//
//		Pageable pageable = PageRequest.of(pageNumber, pageSize);
//		Page<User> page = repo.findAll(keyword, pageable);
//
//		List<User> listUsers = page.getContent();
//
//		listUsers.forEach(user -> System.out.println(user));
//
//		assertThat(listUsers.size()).isGreaterThan(0);
//	}
}







