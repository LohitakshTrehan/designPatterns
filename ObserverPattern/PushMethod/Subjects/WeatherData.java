package ObserverPattern.PushMethod.Subjects;

import java.util.ArrayList;

import ObserverPattern.PushMethod.Observer;
import ObserverPattern.PushMethod.Subject;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temprature;
    private float humidity;
    private float pressure;

    
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temprature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}