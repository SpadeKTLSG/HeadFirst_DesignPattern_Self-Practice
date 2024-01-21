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
        for (Observer observer : observers) { // ���յǼǵ��б�ȥ֪ͨÿ��ע����
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() { //����֮���������
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
