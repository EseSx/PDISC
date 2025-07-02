public abstract class Figura {
    private String Nombre;

    public Figura(String Nombre) {
        this.Nombre = Nombre;
    }

    public Figura() {
    }

    String getNombre() {
        return Nombre;
    }

    void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    abstract void area();
}