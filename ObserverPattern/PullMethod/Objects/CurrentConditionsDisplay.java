package ObserverPattern.PullMethod.Objects;

import java.util.Observable;
import java.util.Observer;

import ObserverPattern.PullMethod.DisplayElement;
import ObserverPattern.PullMethod.Subjects.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temprature;
    private float humidity;
    
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temprature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions: " + temprature + "F degrees and " + humidity + "% humidity");
    }

}