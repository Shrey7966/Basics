package com.quicklearn.demo.First.Spring.project.users;

public class PersonName {

	private String Fname;
	private String Lname;

	public PersonName(String fname, String lname) {
		super();
		Fname = fname;
		Lname = lname;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@Override
	public String toString() {
		return "PersonName [Fname=" + Fname + ", Lname=" + Lname + "]";
	}

}
