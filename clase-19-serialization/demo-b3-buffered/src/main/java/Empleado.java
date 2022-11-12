public class Empleado {

    private int legajo;
    private String apellido;
    private String nombre;
    private double sueldo;

    public Empleado(int legajo, String apellido, String nombre, double sueldo) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
}
