package iestr.jmff.ejercicio16;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    };

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.append(", ");
        sb.append(y);

        return sb.toString();
    }
}
