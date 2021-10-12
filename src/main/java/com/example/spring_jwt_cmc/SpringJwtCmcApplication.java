package com.example.spring_jwt_cmc;

import com.example.spring_jwt_cmc.domain.entity.Role;
import com.example.spring_jwt_cmc.domain.entity.User;
import com.example.spring_jwt_cmc.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringJwtCmcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtCmcApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPPER_ADMIN"));
//
//			userService.saveUser(new User(null, "Hoan Phan", "Hoan", "123456", new ArrayList<>()));
//			userService.saveUser(new User(null, "Loan Nguyen", "LoanN", "123456", new ArrayList<>()));
//			userService.saveUser(new User(null, "Mui Phan", "Mui", "123456", new ArrayList<>()));
//			userService.saveUser(new User(null, "Loan Phan", "LoanP", "123456", new ArrayList<>()));
//
//			userService.addRoleToUser("Hoan", "ROLE_SUPPER_ADMIN");
//			userService.addRoleToUser("LoanN", "ROLE_USER");
//			userService.addRoleToUser("Mui", "ROLE_ADMIN");
//			userService.addRoleToUser("LoanP", "ROLE_MANAGER");
		};
	}

}
