package Bridge;

public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new ReproductorPortatil(new MP4());
        Dispositivo d2 = new ReproductorPortatil(new MKV());
        Dispositivo d3 = new SmartTV(new MP4());
        Dispositivo d4 = new SmartTV(new MKV());

        d1.reproducir();
        d2.reproducir();
        d3.reproducir();
        d4.reproducir();
    }

}
