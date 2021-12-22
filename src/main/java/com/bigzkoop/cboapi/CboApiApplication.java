package com.bigzkoop.cboapi;

import com.bigzkoop.cboapi.entity.Role;
import com.bigzkoop.cboapi.entity.User;
import com.bigzkoop.cboapi.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import java.util.ArrayList;

@SpringBootApplication
@EnableAsync
@PropertySource("classpath:application.yml")
public class CboApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CboApiApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"Malinud Amesh","Malindu","1234", 1L,new ArrayList<>()));
			userService.saveUser(new User(null,"Gathsara Umesh","Gathsara","1234",1L,new ArrayList<>()));
			userService.saveUser(new User(null,"Udara Janith","Udara","1234",1L,new ArrayList<>()));
			userService.saveUser(new User(null,"Lochana Thiwanka","Lochana","1234",1L,new ArrayList<>()));
			userService.saveUser(new User(null,"Bashana Sadanjana","Bashana","1234",1L,new ArrayList<>()));

			userService.addRoleToUser("Malindu","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Bashana","ROLE_ADMIN");
			userService.addRoleToUser("Gathsara","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Lochana","ROLE_MANAGER");
			userService.addRoleToUser("Udara","ROLE_ADMIN");
			userService.addRoleToUser("Gathsara","ROLE_USER");
		};
	}
}
