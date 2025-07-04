public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(int cilindrada, String patente, String año, String dueño) {
        super(patente, año, dueño);
        this.cilindrada = cilindrada;
    }

    public Moto() {
    }

    @Override
    void calcularImpuestos() {
        System.out.println(
                "Calculo del impuesto: $3000 (<250cc) / $6000 (>= 250)\nImpuesto: $"
                        + (this.cilindrada < 250 ? 3000 : 6000));
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cilindrada: " + this.cilindrada + "cc");
    }
}
