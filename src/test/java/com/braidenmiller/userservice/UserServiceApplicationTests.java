package com.braidenmiller.userservice;

import com.braidenmiller.userservice.controller.UserController;
import com.braidenmiller.userservice.dao.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	UserController userController;

	@Test
	void contextLoads() {
		assert true;
	}

	@Test
	void controllerTest() {
		ResponseEntity<String> pong = userController.ping();
		assert pong.getStatusCode().value() == 200;
		assert pong.getBody() != null;
		assert pong.getBody().equals("pong");
	}

	@Test
	void controllerTestGetUsers() {
		List<UserEntity> users = userController.getAll();
		assert users != null;
	}
}
