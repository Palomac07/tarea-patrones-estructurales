package Bridge;

public class ReproductorPortatil extends Dispositivo {
    public ReproductorPortatil(FormatoVideo formatoVideo) {
        super(formatoVideo);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo en reproductor portátil: " + formatoVideo.procesarFormato());
    }

}
