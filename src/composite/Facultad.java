package composite;

import java.util.ArrayList;
import java.util.List;

public class Facultad implements ComponenteGasto{
    private String nombre;
    private List<ComponenteGasto> componentes;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void agregar(ComponenteGasto c) {
        componentes.add(c);
    }

    @Override
    public double getPresupuesto() {
        double total = 0;
        for (ComponenteGasto c : componentes) {
            total += c.getPresupuesto();
        }
        return total;
    }
}
