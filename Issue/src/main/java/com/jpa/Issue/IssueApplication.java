package com.jpa.Issue;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.Issue.Entity.Course;

@SpringBootApplication
public class IssueApplication implements CommandLineRunner {

	@PersistenceContext
	EntityManager em;
	
	public static void main(String[] args) {
		SpringApplication.run(IssueApplication.class, args);
	}

	
	@Transactional
	public void run(String... args) throws Exception {
		System.out.println("Run method started");
		
		Course course1 = new Course("one", "one", new Date());
		Course course2 = new Course("two", "two", new Date());
		
		em.persist(course1);
		em.persist(course2);
		em.detach(course2);
	
		System.out.println("Run method completed");
	}

	

}
