package com.jpa.Issue.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.Issue.Entity.Course;

@Repository
public class IssueDao {
	
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void method1() {
		System.out.println("method1 started");
		
		Course course1 = new Course("one", "one", new Date());
		Course course2 = new Course("two", "two", new Date());
		
		em.persist(course1);
		em.persist(course2);
		em.detach(course2);
	
		System.out.println("method1 completed");
	
	}
	
	@Transactional
	public void method2() {
		System.out.println("method2 started");
		Course c3=em.find(Course.class, 11);
		c3.setName("test 2 updated ");
		em.detach(c3);
		System.out.println("method2 completed");
	}
}
