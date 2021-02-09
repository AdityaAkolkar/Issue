package com.jpa.Issue.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="author")
	public String author;
	
	@Column(name="published_date")
	public Date published_date;

	private Course() {
	}

	public Course(int id, String name, String author, Date published_date) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.published_date = published_date;
	}
	
	public Course(String name, String author, Date published_date) {
		super();
		this.name = name;
		this.author = author;
		this.published_date = published_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublished_date() {
		return published_date;
	}

	public void setPublished_date(Date published_date) {
		this.published_date = published_date;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + ", published_date=" + published_date
				+ "]";
	}

}