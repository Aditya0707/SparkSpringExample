package com.personal.weatherAnalysis;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public interface WeatherMainInterface {

	public void printData();

	public Dataset<Row> getRawDf();
	
	public void closeSparkSession();

}
