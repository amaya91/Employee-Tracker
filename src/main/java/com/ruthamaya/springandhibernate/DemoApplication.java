package com.ruthamaya.springandhibernate;

import com.ruthamaya.springandhibernate.model.EmployeeEntity;
import com.ruthamaya.springandhibernate.repository.EmployeeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import org.slf4j.Logger;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		Optional<EmployeeEntity> emp = repository.findById(2L);

		logger.info("Employee id 2 -> {}");
	}
}
