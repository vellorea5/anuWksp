package com.example.demo;

import java.util.Set;

public class Course {
	int id;
	String name;
	Trainer trainer;
	Set<Integer> marks;
	
	public Set<Integer> getMarks() {
		return marks;
	}

	public void setMarks(Set<Integer> marks) {
		this.marks = marks;
	}

	public Course() {
		super();
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

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Course(int id, String name, Trainer trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
	}

	
	public Course(int id, String name, Trainer trainer, Set<Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", trainer=" + trainer + ", marks=" + marks + "]";
	}

}
