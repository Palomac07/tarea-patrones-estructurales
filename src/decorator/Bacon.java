package decorator;

public class Bacon extends ExtraDecorator{

    public Bacon(IHamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", bacon";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 500;
    }


}
