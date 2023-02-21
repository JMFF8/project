package iestr.jmff.examen1920;

import java.lang.invoke.StringConcatFactory;

public class Factura {
    public static final int TOPE=1000;

    private static int contador=0;
    private static int contadorPagadas=0;
    private static int contadorPendientes=0;
    private static double importePendientes=0.0;
    private static double importePagadas=0.0;

    private final int id;
    private final String cliente;
    private double importeNeto;
    private boolean abonada;

    //Constructor
    private Factura(String cliente, double importeNeto) {
        this.id=++contador;
        this.cliente = cliente;
        this.importeNeto = importeNeto;
        abonada=false;

        //Ajustar contadores y acumuladores
        contadorPendientes++;
        importePendientes+=importeNeto;
    }

    //Pseudoconstructor (Se pone el constructor privado) (Se pueden obviar los pseudoconstructores con restricciones)
    public static Factura nuevaFactura(String cliente, double importeNeto){ //IMPORTANTE STATIC
        if(contador<TOPE){//Comprobar que no haya mas de TOPE ids
            return new Factura(cliente,importeNeto);
        }else{
            return null;
        }
    }


    ///////////////// GETTERS Y SETTERS /////////////////
    public static int getContador() {
        int cont=contador;
        return cont;
    }

    public boolean setImporteNeto(double importeNeto) {
        if(abonada){
            return false;
        } else {
            this.importePendientes -= this.importeNeto;
            this.importePagadas += this.importeNeto;
            this.importeNeto = importeNeto;
            return true;
        }
    }

    public boolean Abonar(){
        if(abonada){
            return false;
        }else {
            this.abonada = true;
            contadorPendientes--;
            contadorPagadas++;
            importePendientes-=importeNeto;
            importePagadas+=importeNeto;
            return true;
        }
    }

    public static int getContadorPagadas() {
        int cpa=contadorPagadas;
        return cpa;
    }

    public static int getContadorPendientes() {
        int cpe=contadorPendientes;
        return cpe;
    }

    public static double getImportePendientes() {
        double ipe=importePendientes;
        return ipe;
    }

    public static double getImportePagadas() {
        double ipa=importePagadas;
        return ipa;
    }

    public String getCliente() {
        String cc=cliente;
        return cc;
    }

    public boolean isAbonada() {
        boolean ca=abonada;
        return ca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(id).append(") ").append(cliente).append(" --> ").append(String.format("%.2f€ Estado: ",importeNeto)).append(abonada?"Abonada":"Por abonar");

        return sb.toString();
    }
}
