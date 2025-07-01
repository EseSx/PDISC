public class Main {
    public static void main(String[] args) {
        System.out.println("Libros:");

        // Declaracion
        Libro principito = new Libro("El principito", "Antoine de Saint-Exupery");
        Libro laTorreOscura = new Libro("La Torre Oscura");
        Libro HarryPotterYElPricioneroDeAzkaban = new Libro();

        // Metodos
        System.out.println(principito.getTitulo());
        HarryPotterYElPricioneroDeAzkaban.setTitulo("La torre ya no es oscura");
        laTorreOscura.mostrarInfo();

        System.out.println("----------");
        System.out.println("Peliculas:");

        // Declaracion
        Pelicula godzilla1954 = new Pelicula("Lagarto", "Ishirou Honda", 96);
        Pelicula elGiganteDeHierro = new Pelicula("Brad Pajaro", 86);
        Pelicula laLaLand = new Pelicula(128000000);

        // Metodos
        godzilla1954.getTitulo();
        godzilla1954.setTitulo("Godzilla");

        elGiganteDeHierro.getDirector();
        elGiganteDeHierro.setDirector("Brad Bird");

        laLaLand.getDuracion();
        laLaLand.setDuracion(128);

        godzilla1954.mostrarInfo();
        elGiganteDeHierro.mostrarInfo();
        laLaLand.mostrarInfo();
    }
}
