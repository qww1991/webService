import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.q.weather.ws.WeatherServer;

public class WeatherClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		WeatherServer ws = (WeatherServer) ac.getBean("weatherClient");
		String cityWeather = ws.getCityWeather("nanj");
		System.out.println(cityWeather);
	}
}
