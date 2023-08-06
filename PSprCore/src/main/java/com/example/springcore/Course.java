package com.example.springcore;

import java.util.List;
import java.util.Set;

public class Course {
	private int id;
	private String cname;
	private Set<String> topics;
	
	public Course() {}
	
	public Course(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<String> getTopics() {
		return topics;
	}

	public void setTopics(Set<String> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", topics=" + topics + "]";
	}
	
}
