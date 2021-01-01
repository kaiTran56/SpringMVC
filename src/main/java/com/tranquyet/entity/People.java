package com.tranquyet.entity;

public class People {
	private String name;
	private String address;
	private int age;

	public People(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public void setTest() {
		System.out.println("Hello World!");
	}
}
