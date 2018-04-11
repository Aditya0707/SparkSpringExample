package com.personal.weatherAnalysis;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Weather implements Serializable{
	private int obsYear;
	private int obsMonth;
	private int obsDay;
	private int obsHour;
	private double airTemp;
	private double seaLevellPressure;
	private double dewPointTemp;
	private int windDirection;
	private int windSpeedRate;
	private int skyCondTotCoverageCode;
	private double liquidPrecipitationForOneHr;
	private double liquidPrecipitationForSixHr;
	
	public int getObsYear() {
		return obsYear;
	}
	public void setObsYear(int obsYear) {
		this.obsYear = obsYear;
	}
	public int getObsMonth() {
		return obsMonth;
	}
	public void setObsMonth(int obsMonth) {
		this.obsMonth = obsMonth;
	}
	public int getObsDay() {
		return obsDay;
	}
	public void setObsDay(int obsDay) {
		this.obsDay = obsDay;
	}
	public int getObsHour() {
		return obsHour;
	}
	public void setObsHour(int obsHour) {
		this.obsHour = obsHour;
	}
	
	public double getDewPointTemp() {
		return dewPointTemp;
	}
	public void setDewPointTemp(double dewPointTemp) {
		this.dewPointTemp = dewPointTemp;
	}
	public double getAirTemp() {
		return airTemp;
	}
	public void setAirTemp(double airTemp) {
		this.airTemp = airTemp;
	}
	public double getSeaLevellPressure() {
		return seaLevellPressure;
	}
	public void setSeaLevellPressure(double seaLevellPressure) {
		this.seaLevellPressure = seaLevellPressure;
	}
	public int getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(int windDirection) {
		this.windDirection = windDirection;
	}
	public int getWindSpeedRate() {
		return windSpeedRate;
	}
	public void setWindSpeedRate(int windSpeedRate) {
		this.windSpeedRate = windSpeedRate;
	}
	public int getSkyCondTotCoverageCode() {
		return skyCondTotCoverageCode;
	}
	public void setSkyCondTotCoverageCode(int skyCondTotCoverageCode) {
		this.skyCondTotCoverageCode = skyCondTotCoverageCode;
	}
	public double getLiquidPrecipitationForOneHr() {
		return liquidPrecipitationForOneHr;
	}
	public void setLiquidPrecipitationForOneHr(double liquidPrecipitationForOneHr) {
		this.liquidPrecipitationForOneHr = liquidPrecipitationForOneHr;
	}
	public double getLiquidPrecipitationForSixHr() {
		return liquidPrecipitationForSixHr;
	}
	public void setLiquidPrecipitationForSixHr(double liquidPrecipitationForSixHr) {
		this.liquidPrecipitationForSixHr = liquidPrecipitationForSixHr;
	}
	
	
	
	

}
