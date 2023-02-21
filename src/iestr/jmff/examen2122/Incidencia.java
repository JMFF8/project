package iestr.jmff.examen2122;

public class Incidencia {
    private int id;
    private String descripcion;
    private float coste;
    private boolean resuelta;


    public Incidencia(int id, String descripcion, float coste) {
        this.id = id;
        this.descripcion = descripcion;
        this.coste = coste;
        this.resuelta = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Incidencia (").append(id).append(") (").append(resuelta? "resuelta":"PENDIENTE").append(") (").append(descripcion).append(") (").append(String.format("%.2f€)",coste));

        return sb.toString();
    }

    public void resolver(){
        if(resuelta) {
            System.out.printf("\nERROR: La incidencia %i ya está resuelta",id);
            return;
        }
        resuelta=true;
        System.out.printf("\nResolviendo incidencia... %s",this);

    }
}
