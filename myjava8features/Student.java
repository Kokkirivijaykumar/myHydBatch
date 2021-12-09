package com.technoelevate.myjava8features;

public class Student {

	private int rollno;
	private String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Integer getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}