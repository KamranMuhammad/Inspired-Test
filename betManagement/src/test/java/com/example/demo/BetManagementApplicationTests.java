package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BetManagementApplicationTests {

	@Test
	public void anyBetWon() {
		Bet bet = new Bet();
		assertEquals("won", bet.getStatus());
	}
	
	@Test
	public void testCreateUser() {
		
		TestEntityManager entityManager = null;
		     
	    UserRepository repo = null;
		     
		
	    User user = new User();
	    user.setEmail("kami@gmail.com");
	    user.setPassword("kami2022");
	    user.setFirstName("kamran");
	    user.setLastName("Muhammad");
	     
	    User savedUser = repo.save(user);
	     
	    User existUser = entityManager.find(User.class, savedUser.getId());
	     
	    assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
	     
	}

}
