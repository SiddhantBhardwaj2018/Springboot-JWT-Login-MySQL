package com.siddhantbhardwaj.jwtspringbootmysql;

import com.siddhantbhardwaj.jwtspringbootmysql.entity.CustomUser;
import com.siddhantbhardwaj.jwtspringbootmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtSpringbootMysqlApplication {

	@Autowired
	private UserRepository userRepository;

	// Populating database immediately after starting up the application
	@PostConstruct
	public void initUsers(){
		List<CustomUser> users = Stream.of(
				new CustomUser(101,"javatechie","password","javatechie@gmail.com"),
				new CustomUser(102,"user 1","password","user1@gmail.com"),
				new CustomUser(103,"user 2","password","user2@gmail.com"),
				new CustomUser(104,"user 3","password","user3@gmail.com")
		).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringbootMysqlApplication.class, args);
	}

}
