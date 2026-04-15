package composite;

public class Catedra implements ComponenteGasto {

    private double costo;
    private String nombre;

    public Catedra(String nombre , double costo) {
        this.costo = costo;
        this.nombre = nombre;
    }

    @Override
    public double getPresupuesto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

}
