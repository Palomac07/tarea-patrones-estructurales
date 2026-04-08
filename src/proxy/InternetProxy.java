package proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

    private InternetReal internetReal; // tenes el objeto real
    private List<String> sitiosProhibidos; // lista de paginas bloqueadas

    public InternetProxy() {
        internetReal = new InternetReal();

        sitiosProhibidos = new ArrayList<>();
        sitiosProhibidos.add("facebook.com");
        sitiosProhibidos.add("instagram.com");
        sitiosProhibidos.add("tiktok.com");
    } // aca creo los sitios prohibidos

    @Override
    public void conectarA(String url) {

        if (sitiosProhibidos.contains(url.toLowerCase())) { // aca se fija si la pagina esta en la lista de prohibido. toLowerCase convierte td en minuscula
            System.out.println("Acceso Denegado a " + url);
        } else {
            internetReal.conectarA(url);
        }
    }
}