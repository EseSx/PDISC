public class Main {
    public static void main(String[] args) {
        System.out.println("---- Actividad Figuras ----");
        Figura[] figuras = new Figura[3];

        figuras[0] = new Cuadrado(2.0f);
        figuras[1] = new Circulo(3.0f);
        figuras[2] = new Triangulo(4.0f, 5.0f);

        for (Figura f : figuras) {
            System.out.println("------------------------------");
            f.area();
            System.out.println("------------------------------");
        }

        System.out.println("---- Actividad Empleados ----");

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Diseñador("Juan Carlos", "47.390.000", 2.00f, "30 años");
        empleados[1] = new Gerente("Facundo Rama", "30.580.122", 500.00f, "56 años");
        empleados[2] = new Programador("Pupi Pupo", "55.555.556", 2000000.00f, "1 semana"); // Ojala

        for (Empleado e : empleados) {
            System.out.println("------------------------------");
            System.out.println("-- Trabajando --");
            e.trabajar();
            System.out.println("-- Mostrar Datos --");
            e.mostrarDatos();
            System.out.println("------------------------------");
        }
    }
}
