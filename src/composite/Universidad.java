package composite;

import java.util.ArrayList;
import java.util.List;

public class Universidad implements ComponenteGasto{
    private String nombre;
    private List<ComponenteGasto> componentes;

    public Universidad(String nombre) {
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
