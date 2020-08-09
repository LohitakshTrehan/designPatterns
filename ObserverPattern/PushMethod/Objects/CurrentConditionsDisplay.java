package ObserverPattern.PushMethod.Objects;

import ObserverPattern.PushMethod.DisplayElement;
import ObserverPattern.PushMethod.Observer;
import ObserverPattern.PushMethod.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temprature;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        display();
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions: " + temprature + "F degrees and " + humidity + "% humidity");
    }

}