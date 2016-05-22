package ObserverMeterology;

public class CurrentWeatherShow implements Observer, DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public void display() {
		System.out.println("Warunki biezace: ");
		System.out.println("temperatura " + temperature + " C");
		System.out.println("wilgotnosc: " + humidity+"%");
		System.out.println("cisnienie " + pressure);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
	
	public CurrentWeatherShow(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

}
