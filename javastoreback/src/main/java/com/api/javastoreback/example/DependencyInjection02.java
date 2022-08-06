package com.api.javastoreback.example;

import org.slf4j.Logger;

public class DependencyInjection02 {

	public DependencyInjection02(Logger loggers) {
		
		//outra forma de fazer uma dependency injection
		//Logger newLogger = new Logger(...);
		//newLogger.Debug("");
		  
		loggers.debug("Test of the dependency.");
		
	}
	
	
	
	
}
