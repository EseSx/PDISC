public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];

        vehiculos[0] = new Auto("754AB89", "2020", "Facundo Lompa", 4);
        vehiculos[1] = new Moto(200, "888888", "2019", "Tamara Gutierrez");
        vehiculos[2] = new Camion(3000, "ABCDEF", "2006", "Geronimo Tarrasco");

        for (Vehiculo v : vehiculos) {
            System.out.println("------------------------------");
            v.mostrarDatos();
            v.calcularImpuestos();
            System.out.println("------------------------------");
        }
    }
}
