package iestr.jmff.rectangulo;

public class Rectangulo {
    private int id;
    private int ancho;
    private int alto;

    int contador=0;
    public Rectangulo(int ancho, int alto){
        this.id=contador();
        this.ancho=ancho;
        this.alto=alto;
    }

    public int contador(){

        return contador;
    }
    public void girar(){
        int aux=alto;
        this.alto=ancho;
        this.ancho=aux;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Rectángulo ").append(id).append(" -> Ancho ").append(ancho).append(" x Alto ").append(alto);

        return sb.toString();
    }
}

