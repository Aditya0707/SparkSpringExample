package com.personal.weatherAnalysis;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class WeatherInterfaceImple implements WeatherMainInterface {

	private SparkSession spark;

	private Dataset<Row> rawDF;

	private JavaRDD<Weather> weatherRDD;

	public JavaRDD<Weather> getWeatherRDD() {
		return weatherRDD;
	}

	public WeatherInterfaceImple(SparkSessionCreator spark) {
		System.out.println("Being called by spring");
		this.spark = spark.getSparkSession();

		this.weatherRDD = this.spark.sparkContext().textFile("010010-99999-2018", 1).toJavaRDD().map(line -> {
			String[] parts = line.split("\\s+");

			Weather weather = new Weather();
			weather.setObsYear(Integer.parseInt(parts[0].trim()));
			weather.setObsMonth(Integer.parseInt(parts[1].trim()));
			weather.setObsDay(Integer.parseInt(parts[2].trim()));
			weather.setObsHour(Integer.parseInt(parts[3].trim()));
			weather.setAirTemp(Double.parseDouble(parts[4].trim()));
			weather.setDewPointTemp(Double.parseDouble(parts[5].trim()));
			weather.setSeaLevellPressure(Double.parseDouble(parts[6].trim()));
			weather.setWindDirection(Integer.parseInt(parts[7].trim()));
			weather.setWindSpeedRate(Integer.parseInt(parts[8].trim()));
			weather.setSkyCondTotCoverageCode(Integer.parseInt(parts[9].trim()));
			weather.setLiquidPrecipitationForOneHr(Double.parseDouble(parts[10].trim()));
			weather.setLiquidPrecipitationForSixHr(Double.parseDouble(parts[11].trim()));

			return weather;

		});

		this.rawDF = this.spark.createDataFrame(weatherRDD, Weather.class);
	}

	@Override
	public void printData() {

		rawDF.printSchema();

	}

	@Override
	public Dataset<Row> getRawDf() {
		return rawDF;
	}

	@Override
	public void closeSparkSession() {
		this.spark.close();
	}

}
