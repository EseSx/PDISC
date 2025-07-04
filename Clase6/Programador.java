public class Programador extends Empleado {
    public Programador(String nombreCompleto, String DNI, float salario, String antiguedad) {
        super(nombreCompleto, DNI, salario, antiguedad);
    }

    public Programador(String nombreCompleto, String DNI, float salario) {
        super(nombreCompleto, DNI, salario);
    }

    public Programador(String nombreCompleto, String DNI) {
        super(nombreCompleto, DNI);
    }

    public Programador(String nombreCompleto) {
        super(nombreCompleto);
    }

    public Programador() {
    }

    @Override
    void trabajar() {
        System.out.println(
                "El Programador " + super.getNombreCompleto() + " programa todo por $" + super.getSalario()
                        + " mensuales");
    }

    @Override
    void mostrarDatos() {
        System.out.println(
                "Datos del Programador:\nNombre completo: " + super.getNombreCompleto() + "\nDNI: " + super.getDNI()
                        + "\nSalario: $" + super.getSalario() + "\nAntiguedad: " + super.getAntiguedad());
    }
}
