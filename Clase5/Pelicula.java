public class Pelicula {
    // --- Atributos ---
    private String Titulo;
    private String Director;
    private int Duracion;

    // --- Metodos ---
    // Contructores
    public Pelicula(String Titulo, String Director, int Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public Pelicula(String Director, int Duracion) {
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public Pelicula(int Duracion) {
        this.Duracion = Duracion;
    }

    public Pelicula() {
    }

    // Getters & Setter
    String getTitulo() {
        return Titulo;
    }

    void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    String getDirector() {
        return Director;
    }

    void setDirector(String Director) {
        this.Director = Director;
    }

    int getDuracion() {
        return Duracion;
    }

    void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    // Mostrar datos generales
    void mostrarInfo() {
        System.out.println("Titulo: " + Titulo + "\nDirector: " + Director + "\nDuracion: " + Duracion);
    }
}
