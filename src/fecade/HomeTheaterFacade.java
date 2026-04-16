package fecade;

public class HomeTheaterFacade {

    private Luces luces;
    private Proyector proyector;
    private Pantalla pantalla;
    private Sonido sonido;
    private Reproductor reproductor;

    public HomeTheaterFacade() {
        luces = new Luces();
        proyector = new Proyector();
        pantalla = new Pantalla();
        sonido = new Sonido();
        reproductor = new Reproductor();
    }

    public void comenzarPelicula() {

        System.out.println("---- Preparando modo cine ----");

        luces.encender();
        luces.bajarIntensidad(10);

        proyector.encender();
        pantalla.bajar();

        sonido.encender();
        reproductor.play();

        System.out.println("---- Disfrutá la película ----");
    }
}
