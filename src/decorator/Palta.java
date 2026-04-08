package decorator;

public class Palta extends ExtraDecorator {

    public Palta(IHamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", palta";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 400;
    }

}
