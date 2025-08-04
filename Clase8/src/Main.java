import io.javalin.Javalin;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8080);

        app.get("/saludo/:nombre/:apellido", ctx -> {
            String nombre = ctx.pathParam("nombre");
            String apellido = ctx.pathParam("apellido");
            ctx.json(Map.of("mensaje", "Hola, " + nombre + " " + apellido));
        });

        // Ejercicio 1
        // Los metodos de los endpoints son incorrectos:
        // 1. DELETE
        // 2. GET
        // 3. POST

        app.get("/suma/:a/:b", ctx -> {
            String a = ctx.pathParam("a");
            int aI = Integer.parseInt(a);
            String b = ctx.pathParam("b");
            int bI = Integer.parseInt(b);
            ctx.json(Map.of("res:", (aI + bI)));
        });

        app.get("/resta/:a/:b", ctx -> {
            String a = ctx.pathParam("a");
            int aI = Integer.parseInt(a);
            String b = ctx.pathParam("b");
            int bI = Integer.parseInt(b);
            ctx.json(Map.of("res:", (aI - bI)));
        });

        app.get("/multiplicacion/:a/:b", ctx -> {
            String a = ctx.pathParam("a");
            int aI = Integer.parseInt(a);
            String b = ctx.pathParam("b");
            int bI = Integer.parseInt(b);
            ctx.json(Map.of("res:", (aI * bI)));
        });
    }
}
