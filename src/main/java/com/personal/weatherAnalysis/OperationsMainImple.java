package com.personal.weatherAnalysis;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class OperationsMainImple implements OperationsMainInterface {

	private SparkSession spark;
	private Dataset<Row> rawDf;
	private Dataset<Row> macAirTempDF;

	public void setRawDf(Dataset<Row> rawDf) {
		System.out.println("Setting rwaDF");
	 	this.rawDf = rawDf;
	}
	

	public OperationsMainImple(SparkSessionCreator spark){
		this.spark = spark.getSparkSession();
		
	}
	@Override
	public void macAirTempofDay() {
		System.out.println("This is now from DataOperaionImpl");
		this.rawDf.createOrReplaceTempView("rawDataFrame");
		macAirTempDF = this.spark.sql("SELECT MAX(airTemp),obsDay FROM rawDataFrame GROUP BY obsDay ORDER BY obsDay");
		this.macAirTempDF.show();
	}

}
