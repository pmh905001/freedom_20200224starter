package com.pmh.freedom.helloword;


public class HelloWorldService {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.err.println("Hello: " + name);
	}

}
