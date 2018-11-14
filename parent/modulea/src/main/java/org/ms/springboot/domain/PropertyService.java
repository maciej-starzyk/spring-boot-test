package org.ms.springboot.domain;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {

	@Value("${my.property}")
	private String myPropertyValue;
	
	
	public String getProperty() {
		return myPropertyValue;
	}


	@PostConstruct
	public void post() {
		System.out.println("The value of my property is " + myPropertyValue);
	}
}
