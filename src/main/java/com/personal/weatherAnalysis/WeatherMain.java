package com.personal.weatherAnalysis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.personal.appcontext.BeanContainer;

public class WeatherMain {

	public static void main(String[] args) {

		// creating a spring container via AnnotationConfigApplicationContext
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(BeanContainer.class);

		// Taking spring help for injecting WeatherMainInterface Bean
		WeatherMainInterface weatherInterface = container.getBean(WeatherMainInterface.class);

		// calling printData() method of WeatherMainInterface Bean
		weatherInterface.printData();
		
		OperationsMainInterface operationInterface = container.getBean(OperationsMainInterface.class);
		operationInterface.macAirTempofDay();
		
		weatherInterface.closeSparkSession();
		// closing spring container to ensure all Beans are destroyed!
		container.close();

	}

}
