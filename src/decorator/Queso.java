package decorator;

public class Queso extends ExtraDecorator{
    public Queso(IHamburguesa hamburguesa) {
        super(hamburguesa);

    }
    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + ", queso";
    }

    @Override
    public double getPrecio() {
        return hamburguesa.getPrecio() + 300;
    }
}
