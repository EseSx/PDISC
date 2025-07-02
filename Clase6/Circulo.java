public class Circulo extends Figura {
    private float Radio;

    public Circulo(float Radio) {
        this.Radio = Radio;
    }

    public Circulo() {
    }

    float getRadio() {
        return Radio;
    }

    void setRadio(float Radio) {
        this.Radio = Radio;
    }

    @Override
    void area() {
        System.out.println("El area del circulo es: " + (3.1416 * (this.Radio * this.Radio)));
    }
}
