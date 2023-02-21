package iestr.jmff.terminales;

public class Terminal {
    private String numero;
    private int segundos;

    public Terminal(String numero) {
        this.numero = numero;
        this.segundos=0;
    }

    public void llama(Terminal receptor, int duracion){
        //Acumula tiempo de conversación en el que llama
        this.segundos+=duracion;
        //Acumula tiempo de conversación en el que recibe la llamada
        receptor.segundos+=duracion;
    }


    @Override
    public String toString() {
        return "Nº " + numero + " - " + segundos +"s de conversación";
    }


}
