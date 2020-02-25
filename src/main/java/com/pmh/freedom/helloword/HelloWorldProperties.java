package com.pmh.freedom.helloword;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "funcode.helloworld")
public class HelloWorldProperties {

	private String name = "world";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
