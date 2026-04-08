package adapter;

public class Adapter implements ISensorCelsius{ // El cliente puede usarlo como si fuera un sensor en Celsius.
    private OldFahrenheitSensor oldSensor; // Envuelve al objeto legacy.

    public Adapter(OldFahrenheitSensor oldSensor) {
        this.oldSensor = oldSensor; // Así sabe con qué objeto trabajar.
    }

    @Override
    public double leerTemperatura() {
        String xml = oldSensor.obtenerTemperaturaXML(); // Llama al método viejo.
        
        String valor = xml.replace("<temp>", "").replace("</temp>", ""); // Saca el número.
        double fahrenheit = Double.parseDouble(valor); // Lo convierte a double.

        double celsius = (fahrenheit - 32) * 5 / 9; // pasa de fahrenheit a celsius.

        return celsius; // Devuelve el resultado final.
    }

}
