package actividad2.practica1;

public class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        super();
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + String.format("%08d", numEmpleado);
    }
}