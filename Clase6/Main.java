public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Cuadrado(2.0f);
        figuras[1] = new Circulo(3.0f);
        figuras[2] = new Triangulo(4.0f, 5.0f);

        for (Figura f : figuras) {
            System.out.println("----------");
            f.area();
            System.out.println("----------");
        }
    }
}
