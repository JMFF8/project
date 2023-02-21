package iestr.jmff.ejercicio16;

public class Linea {
    private Punto primero;
    private Punto segundo;

    public Linea(Punto primero, Punto segundo){
        this.primero=primero;
        this.segundo=segundo;
    };

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Línea formada por los puntos (");
        sb.append(primero);
        sb.append(") y (");
        sb.append(segundo);
        sb.append(")");

        return sb.toString();
    }
}
