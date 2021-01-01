package com.tranquyet.entity;

public class People {
	private String name;
	private String address;
	private int age;

	public People() {

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

	public String setTest() {
		return "Hello World!" + address;
	}

	public void Start() {
		System.out.println("Hello Init");
	}

	public void End() {
		System.out.println("Hello End");
	}
}
