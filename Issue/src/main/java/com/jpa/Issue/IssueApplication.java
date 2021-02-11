package com.jpa.Issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.Issue.dao.IssueDao;
import com.jpa.Issue.service.IssueService;

@SpringBootApplication
public class IssueApplication implements CommandLineRunner {

	@Autowired
	IssueService issueService;
	
	public static void main(String[] args) {
		SpringApplication.run(IssueApplication.class, args);
	}

	
	public void run(String... args) throws Exception {
		
		// Causing Excpetion
		/*	System.out.println("Before method0");
			issueService.method0a();
			System.out.println("After method0");
		*/
		
		
		// Causing Excpetion
		/*	System.out.println("Before method0");
			issueService.method0b();
			System.out.println("After method0");
		*/
		
		issueService.method0a();
		issueService.method0b();
		
		System.out.println("Before method1");
		issueService.method1();
		System.out.println("After method1");
		
		System.out.println("Before method2");
		issueService.method2();
		System.out.println("After method2");
		
	}

	

}
