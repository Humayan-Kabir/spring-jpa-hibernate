package com.kabir.project.springjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJpaHibernateApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired PersonDao personDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("command line runner is running now: {}", System.currentTimeMillis());
		logger.info("person with id 10002: {}", personDao.findById(10002));
		logger.info("deleted row: {}", personDao.deleteById(10002));
	}
}
