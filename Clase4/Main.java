public class Main
{
    public static void main(String[] args) {
        Alumno santi = new Alumno(7.0f, 9.1f);
        
        System.out.println(santi);
        System.out.println("-------------");
        System.out.println(santi.promediar());
    }
}