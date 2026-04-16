package com.quicklearn.demo.First.Spring.project.users;

public class PersonvV1 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonvV1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonvV1 [name=" + name + "]";
	}

}
