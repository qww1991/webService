package com.q.weather.ws;

import javax.jws.WebService;

@WebService
public interface WeatherServer {
	public String getCityWeather(String cityName);
}
