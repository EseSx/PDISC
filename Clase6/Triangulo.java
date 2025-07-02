public class Triangulo extends Figura {
    private float Base;
    private float Altura;

    public Triangulo(float Base, float Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Triangulo(float Altura) {
        this.Altura = Altura;
    }

    public Triangulo() {
    }

    float getAltura() {
        return Altura;
    }

    void setAltura(float Altura) {
        this.Altura = Altura;
    }

    float getBase() {
        return Base;
    }

    void setBase(float Base) {
        this.Base = Base;
    }

    @Override
    void area() {
        System.out.println("El area del triangulo es de: " + ((this.Base * this.Altura) / 2));
    }
}
