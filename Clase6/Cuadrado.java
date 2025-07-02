public class Cuadrado extends Figura {
    private float Lados;

    public Cuadrado(float Lados) {
        this.Lados = Lados;
    }

    public Cuadrado() {
    }

    float getLados() {
        return Lados;
    }

    void setLados(float Lados) {
        this.Lados = Lados;
    }

    @Override
    void area() {
        System.out.println("El area del cuadrador es: " + (this.Lados * this.Lados));
    }
}
