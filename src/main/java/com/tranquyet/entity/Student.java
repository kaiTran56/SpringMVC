package com.tranquyet.entity;

public class Student {
	private String name;
	private String address;

	public Student() {

	}

	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public static Student getCreateStudent() {
		Student studentTemp = new Student();
		studentTemp.setName("Quyet");
		return studentTemp;
	}

	public Student getCreateStudentIoC() {
		Student studentTemp = new Student();
		studentTemp.setAddress("Hanu");
		return studentTemp;
	}

	public String showMessage() {
		return "Hello: " + name + " or " + address;
	}
}
