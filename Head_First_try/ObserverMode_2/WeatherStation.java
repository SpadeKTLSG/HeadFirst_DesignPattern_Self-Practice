public class WeatherStation { //���վ����:�������������ݷ���������ʾ���Լ�������
    // ����java�Դ��Ĺ۲���ģʽ��������,���Լ�ѧϰʹ�ù۲���ģʽ��ʮ�ֹؼ���,�ȴ������򵥵����ӳ���.�������������һ���Աߵ���Ŀ.
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); //�����µ��������ݷ�����
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
