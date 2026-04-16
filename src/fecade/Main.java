package fecade;


public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio del programa");

        HomeTheaterFacade cine = new HomeTheaterFacade();
        cine.comenzarPelicula();

        System.out.println("Fin del programa");

    }
}