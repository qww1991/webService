package com.q.weather.ws;

public class WeatherServerImpl implements WeatherServer {

	@Override
	public String getCityWeather(String cityName) {
		if ("北京".equals(cityName)) {
			return cityName + "雾霾";
		} else {
			return cityName + "正常";
		}
	}

}
