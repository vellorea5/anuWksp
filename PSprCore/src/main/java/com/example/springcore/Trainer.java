package com.example.springcore;

public class Trainer {
	private int id;
	private String tname;
	
	public Trainer() {}

	public Trainer(int id, String tname) {
		super();
		this.id = id;
		this.tname = tname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", tname=" + tname + "]";
	}
	
}
