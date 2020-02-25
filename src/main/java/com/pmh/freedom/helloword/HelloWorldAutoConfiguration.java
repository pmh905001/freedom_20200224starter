package com.pmh.freedom.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloWorldProperties.class)
public class HelloWorldAutoConfiguration {

	@Autowired
	private HelloWorldProperties helloWorldProperties;

	@Bean
	@ConditionalOnMissingBean(HelloWorldService.class)
	public HelloWorldService helloWorldService() {
		HelloWorldService service = new HelloWorldService();
		service.setName(helloWorldProperties.getName());
		return service;
	}

}
