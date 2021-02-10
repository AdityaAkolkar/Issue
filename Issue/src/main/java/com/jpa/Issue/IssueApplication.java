package com.jpa.Issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.Issue.dao.IssueDao;

@SpringBootApplication
public class IssueApplication implements CommandLineRunner {

	@Autowired
	IssueDao issueDao;
	
	public static void main(String[] args) {
		SpringApplication.run(IssueApplication.class, args);
	}

	
	public void run(String... args) throws Exception {
		
		System.out.println("Before method1");
		issueDao.method1();
		System.out.println("After method1");
		
		System.out.println("Before method2");
		issueDao.method2();
		System.out.println("After method2");
		
	}

	

}
