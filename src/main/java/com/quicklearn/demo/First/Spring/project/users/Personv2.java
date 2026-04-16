package com.quicklearn.demo.First.Spring.project.users;

public class Personv2 {

	private PersonName name;

	public Personv2(PersonName name) {
		super();
		this.name = name;
	}

	public PersonName getName() {
		return name;
	}

	public void setName(PersonName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Personv2 [name=" + name + "]";
	}

}
