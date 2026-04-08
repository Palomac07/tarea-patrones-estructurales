package decorator;

public class Main {
    public static void main(String[] args) {
        IHamburguesa hamburguesa = new HamburguesaBase();
        hamburguesa = new Queso(hamburguesa);
        hamburguesa = new Bacon(hamburguesa);
        hamburguesa = new Huevo(hamburguesa);

        System.out.println("Descripción: " + hamburguesa.getDescripcion());
        System.out.println("Precio: $" + hamburguesa.getPrecio());
    }
}
