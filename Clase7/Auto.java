public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String patente, String año, String dueño, int cantidadPuertas) {
        super(patente, año, dueño);
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto() {
    }

    @Override
    void calcularImpuestos() {
        System.out.println(
                "Calculo del impuesto: $5000 + $500 por puerta\nImpuesto: $" + (5000 + (500 * this.cantidadPuertas)));
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de puertas: " + this.cantidadPuertas);
    }
}
