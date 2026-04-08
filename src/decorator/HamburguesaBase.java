package decorator;

public class HamburguesaBase implements IHamburguesa {

   
    @Override
    public String getDescripcion() {
        return "Pan, carne";
    }
    @Override
    public double getPrecio() {
        return 2000;
    }

}
