package com.api.javastoreback.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.javastoreback.controller.TbuserController;

public class DependencyInjection01 {

	static final Logger loggers = LoggerFactory.getLogger(TbuserController.class);
	
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		DependencyInjection02 objeto = new DependencyInjection02(loggers);
		
	}
}
