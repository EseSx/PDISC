public class Diseñador extends Empleado {
    public Diseñador(String nombreCompleto, String DNI, float salario, String antiguedad) {
        super(nombreCompleto, DNI, salario, antiguedad);
    }

    public Diseñador(String nombreCompleto, String DNI, float salario) {
        super(nombreCompleto, DNI, salario);
    }

    public Diseñador(String nombreCompleto, String DNI) {
        super(nombreCompleto, DNI);
    }

    public Diseñador(String nombreCompleto) {
        super(nombreCompleto);
    }

    public Diseñador() {
    }

    @Override
    void trabajar() {
        System.out.println(
                "El Diseñador " + super.getNombreCompleto() + " diseña por $" + super.getSalario()
                        + " mensuales");
    }

    @Override
    void mostrarDatos() {
        System.out.println(
                "Datos del Diseñador:\nNombre completo: " + super.getNombreCompleto() + "\nDNI: " + super.getDNI()
                        + "\nSalario: $" + super.getSalario() + "\nAntiguedad: " + super.getAntiguedad());
    }
}
