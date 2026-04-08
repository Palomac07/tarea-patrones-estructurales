package adapter;

public class Main {
    public static void main(String[] args) {
        OldFahrenheitSensor oldSensor = new OldFahrenheitSensor();

        ISensorCelsius sensor = new Adapter(oldSensor);

        double temperatura = sensor.leerTemperatura();

        System.out.println("Temperatura en Celsius: " + temperatura);
    }

}
