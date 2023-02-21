package iestr.jmff.ejercicio14;

import  java.util.Random;

public class FichaDomino {
    private int izquierda;
    private int derecha;

    private static Random generador=new Random();

    private FichaDomino(int izquierda,int derecha){
        this.izquierda=izquierda;
        this.derecha=derecha;
    }

    public static FichaDomino nuevaFicha(int izquierda, int derecha) {
        if(izquierda<0 || izquierda>6 || derecha<0 || derecha>6){
            return null;
        }else {
            return new FichaDomino(izquierda,derecha);
        }
    }

    public FichaDomino voltea(){
        int auxiliar=izquierda;
        izquierda=derecha;
        derecha=auxiliar;

        return this;
    }

    public boolean encaja(FichaDomino otra){
        if(this.izquierda==otra.izquierda || this.izquierda== otra.derecha ||this.derecha==otra.derecha || this.derecha==otra.izquierda) {
            return true;
        }else{
            return false;
        }
    };


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FichaDomino[");
        sb.append((izquierda==0)? " ":izquierda);
        sb.append("][");
        sb.append((derecha==0)? " ":derecha);
        sb.append("]");

        return sb.toString();
    }
}
