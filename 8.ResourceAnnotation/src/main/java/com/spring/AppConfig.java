package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring")
public class AppConfig {

	@Bean
	public Address address(){
		Address address = new Address();
		address.setCity("Varanasi");
		return address;
	}
	@Bean
	public Company company() {
		Company company = new Company();
		company.setCompName("ABCD Ltd");
		return company;
	}
}
