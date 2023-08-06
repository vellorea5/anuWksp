package com.example.anuspringboot.entity;

import java.util.Set;

public class Course {
	private int id;
	private String name;
	private Set<Topic> topics;
	
	public Course() {}

	public Course(int id, String name, Set<Topic> topics) {
		super();
		this.id = id;
		this.name = name;
		this.topics = topics;
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

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", topics=" + topics + "]";
	}
	
	
}
