package com.jpa.Issue.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.Issue.Entity.Course;
import com.jpa.Issue.dao.IssueDao;

@Service
public class IssueService {

	@Autowired
	IssueDao issueDao;
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void method0a() {
		issueDao.method0a();
	}
	
	@Transactional
	public void method0b() {
		issueDao.method0b();
	}
	
	@Transactional
	public void method1() {
		Course c2=issueDao.method1();
		em.detach(c2);
	    em.merge(c2);
		
	}

	@Transactional
	public void method2() {
		issueDao.method2();
	}
	
	
}
