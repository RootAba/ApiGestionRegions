package com.example.Apigestionregions;

import com.example.Apigestionregions.modele.Regions;
import com.example.Apigestionregions.modele.User;
import com.example.Apigestionregions.repository.UserRepository;
//import org.apache.el.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import  java.util.stream.Stream;

@SpringBootApplication
public class ApigestionregionsApplication {

	@Autowired
	private UserRepository userRepository;
	@PostConstruct
	public void InitUser(){
		List<User> users  =Stream.of(
				new User(1,"abasse","abasse","abassemaiga403@gmail.com"),
				new User(2,"aba","aba","aba@gmail.com"),
				new User(1,"abas","abas","abas@gmail.com")
		).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApigestionregionsApplication.class, args);
	}

}
