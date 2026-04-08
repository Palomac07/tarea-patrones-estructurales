package decorator;

public class Huevo extends ExtraDecorator{

    public Huevo(IHamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", huevo";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 300;
    }

}
