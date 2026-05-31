public class AppTest {

    public static void main(String[] args) {
        String mensaje = App.mensaje();

        if (!mensaje.contains("Hola")) {
            throw new RuntimeException("La prueba falló: no contiene la palabra Hola");
        }

        System.out.println("Prueba correcta");
    }
}