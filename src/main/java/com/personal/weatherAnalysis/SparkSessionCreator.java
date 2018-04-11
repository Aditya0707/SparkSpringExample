package com.personal.weatherAnalysis;

import org.apache.spark.sql.SparkSession;

public class SparkSessionCreator {

	private String appName;
	private String sparkHost;
	private String sparkEnvironment;
	private SparkSession sparkSession;
	
	
	public SparkSessionCreator() {

	}
	
	
	public SparkSessionCreator(String appName, String sparkHost, String sparkEnvironment) {
		super();
		this.appName = appName;
		this.sparkHost = sparkHost;
		this.sparkEnvironment = sparkEnvironment;
		
		this.sparkSession = SparkSession.builder().appName(appName)
				.config(sparkHost, sparkEnvironment).getOrCreate();
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setSparkHost(String sparkHost) {
		this.sparkHost = sparkHost;
	}

	public void setSparkEnvironment(String sparkEnvironment) {
		this.sparkEnvironment = sparkEnvironment;
	}


	public String getAppName() {
		return appName;
	}


	public String getSparkHost() {
		return sparkHost;
	}


	public String getSparkEnvironment() {
		return sparkEnvironment;
	}


	public SparkSession getSparkSession() {
		return sparkSession;
	}


	public void setSparkSession(SparkSession spark) {
		this.sparkSession = spark;
	}
	
	
	

}
