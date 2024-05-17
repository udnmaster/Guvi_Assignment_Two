package com.demo.assignmentTwo;

public class Person {

	public void display(String name, int age) {
		System.out.println("Name is " + name + " and age is " + age + ".");

	}

	public static void main(String[] args) {
		int age = 18;
		Person p = new Person();
		p.display("Henry", age);

	}

}
