package ejercicio;

public class Especie {

    private double tasaDeCrecimiento;
    private int poblacion;
    private String nombre;

    public Especie(double tasaDeCrecimiento, int poblacion, String nombre) {
        this.tasaDeCrecimiento = tasaDeCrecimiento;
        this.poblacion = poblacion;
        this.nombre = nombre;
    }

    public double getTasaDeCrecimiento() {
        return tasaDeCrecimiento;
    }

    public void setTasaDeCrecimiento(double tasaDeCrecimiento) {
        this.tasaDeCrecimiento = tasaDeCrecimiento;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
