package ObserverMeterology;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer obs = (Observer) observers.get(i);
			obs.update(temperature, humidity, pressure);
		}
	}

	public void loadChange() {
		notifyObservers();
	}

	public void setData(float temp, float hum, float pres) {
		this.temperature = temp;
		this.humidity = hum;
		this.pressure = pres;
		loadChange();
	}
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
