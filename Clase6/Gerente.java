public class Gerente extends Empleado {

    public Gerente(String nombreCompleto, String DNI, float salario, String antiguedad) {
        super(nombreCompleto, DNI, salario, antiguedad);
    }

    public Gerente(String nombreCompleto, String DNI, float salario) {
        super(nombreCompleto, DNI, salario);
    }

    public Gerente(String nombreCompleto, String DNI) {
        super(nombreCompleto, DNI);
    }

    public Gerente(String nombreCompleto) {
        super(nombreCompleto);
    }

    public Gerente() {
    }

    @Override
    void trabajar() {
        System.out.println(
                "El gerente " + super.getNombreCompleto() + " organiza todo por $" + super.getSalario() + " mensuales");
    }

    @Override
    void mostrarDatos() {
        System.out.println(
                "Datos del gerente:\nNombre completo: " + super.getNombreCompleto() + "\nDNI: " + super.getDNI()
                        + "\nSalario: $" + super.getSalario() + "\nAntiguedad: " + super.getAntiguedad());
    }
}
