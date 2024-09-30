package registrofacade;

public class Curso {
    private String nombre;
    private int cuposDisponibles;

    public Curso(String nombre, int cuposDisponibles) {
        this.nombre = nombre;
        this.cuposDisponibles = cuposDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void reducirCupo() {
        if (cuposDisponibles > 0) {
            cuposDisponibles--;
        }
    }
}
