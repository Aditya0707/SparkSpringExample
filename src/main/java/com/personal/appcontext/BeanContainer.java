package com.personal.appcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.personal.weatherAnalysis.OperationsMainImple;
import com.personal.weatherAnalysis.OperationsMainInterface;
import com.personal.weatherAnalysis.SparkSessionCreator;
import com.personal.weatherAnalysis.WeatherInterfaceImple;
import com.personal.weatherAnalysis.WeatherMainInterface;

/*
 * This is spring container which will take care of creating Beans 
 * 
 * It will also take care of DependencyInjection
 * 
 * */

@Configuration
public class BeanContainer {

	@Bean
	public WeatherMainInterface weatherInterface() {
		WeatherInterfaceImple weatherInterface = new WeatherInterfaceImple(sparkSession());
		return weatherInterface;
	}

	@Bean
	public SparkSessionCreator sparkSession() {
		return new SparkSessionCreator("WeatherDatasets", "spark.master", "local");
	}

	@Bean
	public OperationsMainInterface operationInterface() {
		OperationsMainImple operationImpl = new OperationsMainImple(sparkSession());
		operationImpl.setRawDf(weatherInterface().getRawDf());
		return operationImpl;
	}

}
