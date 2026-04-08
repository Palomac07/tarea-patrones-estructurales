package Bridge;

public abstract class Dispositivo {
    protected FormatoVideo formatoVideo;

    public Dispositivo(FormatoVideo formatoVideo) {
        this.formatoVideo = formatoVideo;
    }

    public abstract void reproducir();
}
