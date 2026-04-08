package Bridge;

public class SmartTV extends Dispositivo {
    public SmartTV(FormatoVideo formatoVideo) {
        super(formatoVideo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo en Smart TV: " + formatoVideo.procesarFormato());
    }

}
