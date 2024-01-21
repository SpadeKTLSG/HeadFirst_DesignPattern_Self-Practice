package ObserverMode_2;
import java.util.ArrayList;


public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    //values:
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void registerObserver(CurrentConditionsDisplay o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) { // 按照登记的列表去通知每个注册者
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() { //更新之后告诉他们
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
