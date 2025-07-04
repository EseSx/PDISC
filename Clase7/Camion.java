public class Camion extends Vehiculo {
    private float cargaMaxima;

    public Camion(float cargaMaxima, String patente, String año, String dueño) {
        super(patente, año, dueño);
        this.cargaMaxima = cargaMaxima;
    }

    public Camion() {
    }

    @Override
    void calcularImpuestos() {
        System.out.println(
                "Calculo del impuesto: $8000 + $100 x tonelada\nImpuesto: $" + (8000 + (100 * this.cargaMaxima)));
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carga maxima: " + this.cargaMaxima + "t");
    }
}
