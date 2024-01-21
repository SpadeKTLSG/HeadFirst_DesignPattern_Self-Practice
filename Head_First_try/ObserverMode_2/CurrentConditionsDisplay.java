public class CurrentConditionsDisplay implements Observer, DisplayElement { // 这个就是布告板了,展示
    private float temperature;
    private float humidity;
    private WeatherData weatherData; //服务端的主题需要包含进来.

    public CurrentConditionsDisplay(WeatherData weatherData) { //需要包含一个主题并注册为观察者
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
