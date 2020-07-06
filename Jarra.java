public class Jarra {

    private int contenido;
    private final int capacidad;

    public Jarra(int n) {
        if (n <= 0) {
            throw new RuntimeException("ERROR: La jarra debe tener una capacidad mayor que 0.");
        } else {
            contenido = 0;
            capacidad = n;
        }
    }
}