public class Libro {
    private String Titulo;
    private String Autor;

    public Libro(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public Libro(String Titulo) {
        this.Titulo = Titulo;
    }

    public Libro() {
    }

    String getTitulo() {
        return Titulo;
    }

    void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    void mostrarInfo() {
        System.out.println(Titulo + " del autor " + Autor);
    }
}
