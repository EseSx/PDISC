public class Alumno {
   // ---- Declaro los atributos ----
   // Private: para que no se modifiquen.
   // final: para que no se pueda cambiar el valor.
   // Float: para que sea de tipo Float.
   private final Float nota1;
   private final Float nota2;
   
   // ---- Constructor ----
   public Alumno(Float nota1, Float nota2){
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
   public Float promediar(Float nota1, Float nota2) {
      return (nota1 + nota2) / 2;
   }

   // ---- Devolucion de la nota promediada ----
   @Override
   public String toString() {
      return "Promedio " + promediar(nota1, nota2);
   }
}
