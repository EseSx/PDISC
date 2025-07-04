public abstract class Vehiculo {
    private String patente;
    private String año;
    private String dueño;

    public Vehiculo(String patente, String año, String dueño) {
        this.patente = patente;
        this.año = año;
        this.dueño = dueño;
    }

    public Vehiculo() {
    }

    public String getPatente() {
        return patente;
    }

    public String getAño() {
        return año;
    }

    public String getDueño() {
        return dueño;
    }

    void mostrarDatos() {
        System.out.println(
                "Datos del Vehiculo:\nPatente: " + this.patente + "\nAño: " + this.año + "\nDueño: " + this.dueño);
    };

    abstract void calcularImpuestos();
}
