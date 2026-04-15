package composite;

public class Main {
 public static void main(String[] args) {

        Catedra c1 = new Catedra("Programación", 1000);
        Catedra c2 = new Catedra("Matemática", 1500);
        Catedra c3 = new Catedra("Física", 1200);

        Departamento d1 = new Departamento("Sistemas");
        d1.agregar(c1);
        d1.agregar(c2);

        Departamento d2 = new Departamento("Ciencias");
        d2.agregar(c3);

        Facultad f1 = new Facultad("Ingeniería");
        f1.agregar(d1);
        f1.agregar(d2);

        Universidad u = new Universidad("UADE");
        u.agregar(f1);

        System.out.println("Presupuesto total: " + u.getPresupuesto());
    }
}
