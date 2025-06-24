public class Alumno {
   // ---- Declaro los atributos ----
   // Private y final tienen utilidades similares, basicamente impiden que se
   // modifiquen los atributos. Su principal diferencia radica en que Private puede
   // modificar los atributos desde dentro de la clase con un setter mientras que
   // final no

   private final Float nota1;
   private final Float nota2;

   // ---- Constructor ----
   public Alumno(Float nota1, Float nota2) {
      this.nota1 = nota1;
      this.nota2 = nota2;
   }

   // ---- Metodos patra ver los atributos de forma individual ----
   public Float getNota1() {
      return nota1;
   }

   public Float getNota2() {
      return nota2;
   }

   // ---- Metodo para promediar la nota ----
   public Float promediar() {
      return (nota1 + nota2) / 2;
   }

   // ---- Devuelvo algo siempre que se imprima el objeto ----
   @Override
   public String toString() {
      return "Promedio " + promediar();
   }
}
