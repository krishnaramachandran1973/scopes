package com.cts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("nonSingleton")
@Scope("prototype")
public class Singer {
	private String name = "unknown";

	public Singer(@Value("John Mayer") String name) {
		this.name = name;
	}
	
	

}
