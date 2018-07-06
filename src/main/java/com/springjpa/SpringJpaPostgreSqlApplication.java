package com.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.repo.CustomerRepository;

import java.io.Serializable;

@SpringBootApplication
public class SpringJpaPostgreSqlApplication implements Serializable {
	@Autowired
	CustomerRepository repository;
	
	public static void main(String[] args){
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}


}
