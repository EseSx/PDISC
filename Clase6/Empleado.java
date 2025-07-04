public abstract class Empleado {
    private String nombreCompleto;
    private String DNI;
    private float salario;
    private String antiguedad;

    public Empleado(String nombreCompleto, String DNI, float salario, String antiguedad) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public Empleado(String nombreCompleto, String DNI, float salario) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.salario = salario;
    }

    public Empleado(String nombreCompleto, String DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }

    public Empleado(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Empleado() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    abstract void trabajar();

    abstract void mostrarDatos();
}
