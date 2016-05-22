package ObserverMeterology;

import java.util.ArrayList;

public class StatisticWeatherShow implements DisplayElement, Observer {

	private float avgTemperature;
	private float avgHumidity;
	private float avgPressure;
	private Subject weatherData;
	private ArrayList<Float> temperature;
	private ArrayList<Float> humidity;
	private ArrayList<Float> pressure;

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature.add(temperature);
		this.humidity.add(humidity);
		this.pressure.add(pressure);
		calculateAverage();
		display();
	}

	public void calculateAverage() {
		float tempSum = 0;
		float humiSum = 0;
		float presSum = 0;
		for (Float temp : temperature) {
			tempSum += temp;
		}
		for (Float hum : humidity) {
			humiSum += hum;
		}
		for (Float pres : pressure) {
			presSum += pres;
		}
		avgTemperature = tempSum / temperature.size();
		avgHumidity = humiSum / humidity.size();
		avgPressure = presSum / pressure.size();
	}

	public void resetStatistic() {
		temperature.clear();
		humidity.clear();
		pressure.clear();
	}

	@Override
	public void display() {
		System.out.println("Statystyki pogody: ");
		System.out.println("srednia temperatura " + avgTemperature + " C");
		System.out.println("srednia wilgotnosc: " + avgHumidity +"%");
		System.out.println("srednia cisnienie " + avgPressure);
	}

	public StatisticWeatherShow(WeatherData WeatherData) {
		temperature = new ArrayList<Float>();
		humidity = new ArrayList<Float>();
		pressure = new ArrayList<Float>();

		this.weatherData = WeatherData;
		WeatherData.registerObserver(this);
	}
}
