package ObserverMeterology;

public class MeteoStation {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		
		CurrentWeatherShow currentWeatherShow = new CurrentWeatherShow(weatherData);
		StatisticWeatherShow statisticWeatherShow = new StatisticWeatherShow(weatherData);
		
		weatherData.setData((float) 26.6, 65, 1102.1f);
		weatherData.setData((float) 30, 70, 1200.1f);
		weatherData.setData((float) 14.6, 90, 800.1f);
	}

}
