package decorator;

public abstract class ExtraDecorator implements IHamburguesa {
    protected IHamburguesa hamburguesa;

    public ExtraDecorator(IHamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

}
