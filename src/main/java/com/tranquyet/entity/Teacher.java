package com.tranquyet.entity;

public class Teacher extends People {
	private String position;
	private People people;

	public Teacher(String position, People people) {
		this.people = people;
		this.position = position;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString() {
		return people.getName() + " " + people.getAddress() + " " + position;
	}
}
