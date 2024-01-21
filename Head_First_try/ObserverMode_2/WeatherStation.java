public class WeatherStation { //监测站本体:包含了天气数据分析器和显示器以及传递器
    // 由于java自带的观察者模式并不完善,故自己学习使用观察者模式是十分关键的,先从这个最简单的例子出发.完整代码见另外一个旁边的项目.
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); //生成新的天气数据分析器
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
